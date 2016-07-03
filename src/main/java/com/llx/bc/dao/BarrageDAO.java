package com.llx.bc.dao;

import java.util.List;

import com.llx.bc.entity.Barrage;

public interface BarrageDAO {
	
	/**
	 * 添加弹幕
	 * @param barrage
	 */
	public void addBarrage(Barrage barrage);

	/**
	 * 获取某个视频的所有弹幕
	 * @param apiKey
	 * @param videoName
	 * @return
	 */
	public List<Barrage> getBarrages(String apiKey, String videoName);
}
