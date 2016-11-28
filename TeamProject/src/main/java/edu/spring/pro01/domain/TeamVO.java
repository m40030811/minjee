package edu.spring.pro01.domain;

import java.util.Date;
import java.util.UUID;

public class TeamVO {

	private String team_id;
	private String team_name;
	private String team_log_img;
	private Date team_startday;
	private String team_intro;
	private String team_area;
	private String user_id;
	
	public TeamVO() {
		team_id = "t" + UUID.randomUUID().toString();
	}

	public TeamVO(String team_name, String team_log_img, Date team_startday, String team_intro,
			String team_area, String user_id) {
		
		team_id = "t" + UUID.randomUUID().toString();
		this.team_name = team_name;
		this.team_log_img = team_log_img;
		this.team_startday = team_startday;
		this.team_intro = team_intro;
		this.team_area = team_area;
		this.user_id = user_id;
	}

	public String getTeam_id() {
		return team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_log_img() {
		return team_log_img;
	}

	public void setTeam_log_img(String team_log_img) {
		this.team_log_img = team_log_img;
	}

	public Date getTeam_startday() {
		return team_startday;
	}

	public void setTeam_startday(Date team_startday) {
		this.team_startday = team_startday;
	}

	public String getTeam_intro() {
		return team_intro;
	}

	public void setTeam_intro(String team_intro) {
		this.team_intro = team_intro;
	}

	public String getTeam_area() {
		return team_area;
	}

	public void setTeam_area(String team_area) {
		this.team_area = team_area;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
}
