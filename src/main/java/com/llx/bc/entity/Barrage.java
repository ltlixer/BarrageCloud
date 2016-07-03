package com.llx.bc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "barrage")
public class Barrage {
	
	@Id
	@GeneratedValue
    @Column(name="id")
	private int id;
	
	//api_key
	@Column(name = "api_key")
	private String apiKey;
	//是记录弹幕，还是获取弹幕
	@Column(name = "type")
	private String type;
	//视频名称或地址
	@Column(name = "video_name")
	private String videoName;
	//发送弹幕的用户
	@Column(name = "barrage_user")
	private String barrageUser;
	//弹幕文字内容
	@Column(name = "barrage_content")
	private String barrageContent;
	//发送弹幕时的视频时间
	@Column(name = "barrage_sendtime")
	private String barrageSendtime;
	public Barrage(){}
	public Barrage(String apiKey, String type, String videoName, String barrageUser, String barrageContent,
			String barrageSendtime) {
		super();
		this.apiKey = apiKey;
		this.type = type;
		this.videoName = videoName;
		this.barrageUser = barrageUser;
		this.barrageContent = barrageContent;
		this.barrageSendtime = barrageSendtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getBarrageUser() {
		return barrageUser;
	}
	public void setBarrageUser(String barrageUser) {
		this.barrageUser = barrageUser;
	}
	public String getBarrageContent() {
		return barrageContent;
	}
	public void setBarrageContent(String barrageContent) {
		this.barrageContent = barrageContent;
	}
	public String getBarrageSendtime() {
		return barrageSendtime;
	}
	public void setBarrageSendtime(String barrageSendtime) {
		this.barrageSendtime = barrageSendtime;
	}
	
}
