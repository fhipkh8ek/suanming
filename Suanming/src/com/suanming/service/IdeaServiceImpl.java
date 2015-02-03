package com.suanming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suanming.dao.idea.IIdeaDao;
import com.suanming.pojo.Idea;

@Service("ideaService")
public class IdeaServiceImpl implements IIdeaService{

	@Autowired
	private IIdeaDao ideaDao;
	
	@Override
	public void saveIdea(Idea idea) {
		ideaDao.saveEntity(idea);
	}

}
