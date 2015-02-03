package com.suanming.dao.idea;


import org.springframework.stereotype.Repository;

import com.suanming.dao.base.GenericDaoHibernate;
import com.suanming.pojo.Idea;

@Repository("ideaDao")
public class IdeaDaoImpl extends GenericDaoHibernate<Idea, Integer> implements IIdeaDao {

}
