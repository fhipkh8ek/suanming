package com.suanming.dao.base;


import java.io.Serializable;
import java.util.List;

/**
 * 
* @ClassName: GenericDao
* @Description: 泛型Dao
* @author Kevin Lv
* @date 2013-5-27 下午10:15:38
* @param <T>
* @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {
	
	/**
	 * 
	* @Title: saveEntity
	* @Description: 添加实体
	* @param @param entity
	* @param @return   
	* @return T    返回类型
	* @throws
	 */
	public T saveEntity(T entity);
	
	/**
	 * 
	* @Title: saveEntity
	* @Description: 
	* @param @param entity    设定文件
	* @return void    返回类型
	* @throws
	 */
	public void saveObjEntity(T entity);

	/**
	 * 
	* @Title: updateEntity
	* @Description: 修改实体
	* @param @param entity
	* @param @return   
	* @return T    返回类型
	* @throws
	 */
	public T updateEntity(T entity);

	/**
	 * 
	* @Title: findById
	* @Description: 根据ID查询实体
	* @param @param id
	* @param @return   
	* @return T    返回类型
	* @throws
	 */
	public T findById(PK id);

	/**
	 * 
	* @Title: findAll
	* @Description: 查询所有实体
	* @param @return   
	* @return List<T>    返回类型
	* @throws
	 */
	public List<T> findAll();

	/**
	 * 
	* @Title: deleteEntity
	* @Description: 删除实体
	* @param @param entity   
	* @return void    返回类型
	* @throws
	 */
	public void deleteEntity(T entity);

	/**
	 * 
	* @Title: getHqlPagination
	* @Description: HQL分页
	* @param @param hql
	* @param @param pageNumber
	* @param @param pageSize
	* @param @return   
	* @return Pagination    返回类型
	* @throws
	 */
	public Pagination getHqlPagination(String hql,int pageNumber,int pageSize);

	/**
	 * 
	* @Title: getSqlPagination
	* @Description: SQL分页
	* @param @param sql
	* @param @param pageNumber
	* @param @param pageSize
	* @param @return   
	* @return Pagination    返回类型
	* @throws
	 */
	public Pagination getSqlPagination(String sql,int pageNumber,int pageSize);
	
	/**
	 * 
	* @Title: getTotalCount
	* @Description: 获取总记录数
	* @param @param hql
	* @param @return   
	* @return int    返回类型
	* @throws
	 */
	public int getTotalCount(String hql,int type);
	
	/**
	 * 
	* @Title: getHqlList
	* @Description: 无查询条件
	* @param @param hql
	* @param @return    设定文件
	* @return List<T>    返回类型
	* @throws
	 */
	public List<T> getHqlList(String hql); 
	
	/**
	 * 
	* @Title: getHqlList
	* @Description: 一个查询条件
	* @param @param hql
	* @param @param value
	* @param @return   
	* @return List<?>    返回类型
	* @throws
	 */
	public List<?> getHqlList(String hql,Object value);
	
	/**
	 * 
	* @Title: getHqList
	* @Description: 多个查询条件
	* @param @param hql
	* @param @param values
	* @param @return   
	* @return List<?>    返回类型
	* @throws
	 */
	public List<?> getHqList(String hql,Object[] values);
	
	/**
	 * 
	* @Title: getHqList
	* @Description: 分页使用
	* @param @param exampleEntity
	* @param @param firstResult
	* @param @param maxResults
	* @param @return   
	* @return List<?>    返回类型
	* @throws
	 */
	public List<?> getHqList(Object exampleEntity,int firstResult, int maxResults);
	
	/**
	 * 
	* @Title: getHqList
	* @Description: 一个查询条件
	* @param @param hql
	* @param @param paramName
	* @param @param value
	* @param @return   
	* @return List<?>    返回类型
	* @throws
	 */
	public List<?> getHqList(String hql,String paramName,Object value);
	
	/**
	 * 
	* @Title: getHqList
	* @Description: 多个查询条件
	* @param @param hql
	* @param @param paramName
	* @param @param value
	* @param @return   
	* @return List<?>    返回类型
	* @throws
	 */
	public List<?> getHqList(String hql , String[] paramName , Object[] value);


}
