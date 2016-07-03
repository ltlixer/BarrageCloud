package com.llx.bc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.llx.bc.dao.BarrageDAO;
import com.llx.bc.entity.Barrage;

@Repository
public class BarrageDAOImpl implements BarrageDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBarrage(Barrage barrage) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(barrage);
	}

	@Override
	public List<Barrage> getBarrages(String apiKey, String videoName) {
		// TODO Auto-generated method stub
		Query q= sessionFactory.getCurrentSession().createQuery("From Barrage b Where b.apiKey=:apiKey and b.videoName=:videoName");
		q.setString("apiKey", apiKey);
		q.setString("videoName", videoName);
		@SuppressWarnings("unchecked")
		List<Barrage> barrageList = q.list();
		return barrageList;
	}
	
}
