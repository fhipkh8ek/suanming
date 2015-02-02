package com.suanming.dao.base;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 
* @ClassName: GenericDaoHibernate
* @Description: 泛型Dao实现
* @author Kevin Lv
* @date 2013-5-27 下午10:41:46
* @param <T>
* @param <PK>
 */
@SuppressWarnings("unchecked")
public class GenericDaoHibernate<T, PK extends Serializable> extends HibernateDaoSupport implements GenericDao<T, PK> {
	
	private Class<T> clazz;
	
	public GenericDaoHibernate() {
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Autowired
    public void setSessionFactoryOverride(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

	@Override
	public T saveEntity(T entity) {
		return (T) this.getHibernateTemplate().merge(entity);
	}

	@Override
	public T updateEntity(T entity) {
		return (T) this.getHibernateTemplate().merge(entity);
	}

	@Override
	public T findById(PK id) {
		return getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		return getHibernateTemplate().find("from " + clazz.getName());
	}

	@Override
	public void deleteEntity(T entity) {
		getHibernateTemplate().delete(entity);
	}

	@Override
	public Pagination getHqlPagination(String hql, int pageNumber, int pageSize) {
		
		Query query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		int totalCount = getTotalCount(hql,1);
		Pagination pagination = new Pagination(pageSize, pageNumber,totalCount);
		query.setMaxResults(pageSize);
		query.setFirstResult((pageNumber - 1) * pageSize);
		pagination.setList(query.list());
		
		return pagination;
	}

	@Override
	public Pagination getSqlPagination(String sql, int pageNumber, int pageSize) {
		
		SQLQuery query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
		int totalCount = getTotalCount(sql,2);
		Pagination pagination = new Pagination(pageSize, pageNumber,totalCount);
		query.setMaxResults(pageSize);
		query.setFirstResult((pageNumber - 1) * pageSize);
		pagination.setList(query.list());
		
		return pagination;
	}
	

	@Override
	public int getTotalCount(String hql,int type) {
		hql  = hql.substring(hql.toLowerCase().indexOf("from"));
		hql  = StringUtils.substringBefore(hql, "order by ");
		if(1 == type){
			Query query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select count(*) " + hql);
			return ((Long)query.uniqueResult()).intValue();
		}else{
			SQLQuery query = this.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) " + hql);
			return ((Long)query.uniqueResult()).intValue();
		}
	}

	@Override
	public List<?> getHqlList(String hql, Object value) {
		return this.getHibernateTemplate().find(hql, value);
	}

	@Override
	public List<?> getHqList(String hql, Object[] values) {
		return this.getHibernateTemplate().find(hql, values);
	}

	@Override
	public List<?> getHqList(Object exampleEntity, int firstResult,int maxResults) {
		return this.getHibernateTemplate().findByExample(exampleEntity, firstResult, maxResults);
	}

	@Override
	public List<?> getHqList(String hql, String paramName, Object value) {
		return this.getHibernateTemplate().findByNamedParam(hql, paramName, value);
	}

	@Override
	public List<?> getHqList(String hql, String[] paramName, Object[] value) {
		return this.getHibernateTemplate().findByNamedParam(hql, paramName, value);
	}

	@Override
	public List<T> getHqlList(String hql) {
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public void saveObjEntity(T entity) {
		this.getHibernateTemplate().save(entity);
	}
	
}
