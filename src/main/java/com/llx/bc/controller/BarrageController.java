package com.llx.bc.controller;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llx.bc.entity.Barrage;
import com.llx.bc.service.BarrageService;
import com.llx.bc.util.JsonUtil;

@Controller
public class BarrageController {
	@Autowired
	private BarrageService barrageService;
	
	/**
	 * 弹幕云API
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/api")
	public void userLogin(ModelMap model,HttpServletRequest request,HttpServletResponse response) {
		String methodName = request.getParameter("method_name");
		if("storage".equals(methodName)){
			String type = request.getParameter("type");
			if("POST".equals(type)){
				String api_key = request.getParameter("api_key");
				String video_name = request.getParameter("video_name");
				String barrage_user = request.getParameter("barrage_user");
				String barrage_content = request.getParameter("barrage_content");
				String barrage_sendtime = request.getParameter("barrage_sendtime");
				Barrage barrage = new Barrage(api_key, type, video_name, barrage_user, barrage_content, barrage_sendtime);
				barrageService.addBarrage(barrage);
			}else if("GET".equals(type)){
				String api_key = request.getParameter("api_key");
				String video_name = request.getParameter("video_name");
				List<Barrage> barrageList = new ArrayList<Barrage>();
				barrageList = barrageService.getBarrages(api_key, video_name);
				try {
					response.getWriter().print(JsonUtil.toJSONString(barrageList));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
