package com.llx.bc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.llx.bc.dao.BarrageDAO;
import com.llx.bc.entity.Barrage;
import com.llx.bc.service.BarrageService;

@Service
@Transactional
public class BarrageServiceIpml implements BarrageService {
	
	@Autowired
	private BarrageDAO barrageDAO;

	@Override
	public void addBarrage(Barrage barrage) {
		// TODO Auto-generated method stub
		barrageDAO.addBarrage(barrage);
	}

	@Override
	public List<Barrage> getBarrages(String apiKey, String videoName) {
		// TODO Auto-generated method stub
		return barrageDAO.getBarrages(apiKey, videoName);
	}

}
