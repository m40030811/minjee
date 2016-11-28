package edu.spring.pro01.domain;

import java.util.Date;
import java.util.UUID;

//팀 이름 : team_name
//팀 소개 : team_intro
//프로젝트 기간
//    시작일 : project_start
//    종료일 : project_end
//프로젝트 분야 : project_category
//주요 업무(프로젝트 소개) : project_intro
//모집 팀원 역할 : team_part
//업무관련 기술태그 : required_skill
//주요 활동 지역 : team_area
//팀장 연락처 : user_number
//팀장 이메일 : user_email
public class RegisterDTO {
	
	private String team_id;
	private String project_id;
	private String team_name;
	private String team_intro;
	private Date project_start;
	private Date project_end;
	
	public RegisterDTO(String team_name, String team_intro, Date project_start, Date project_end) {
		team_id = "t" + UUID.randomUUID().toString();
		project_id = "p" + UUID.randomUUID().toString();
		this.team_name = team_name;
		this.team_intro = team_intro;
		this.project_start = project_start;
		this.project_end = project_end;
	}
	

	public String getTeam_id() {
		return team_id;
	}
	
	public String getProject_id() {
		return project_id;
	}
	
	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_intro() {
		return team_intro;
	}

	public void setTeam_intro(String team_intro) {
		this.team_intro = team_intro;
	}

	public Date getProject_start() {
		return project_start;
	}

	public void setProject_start(Date project_start) {
		this.project_start = project_start;
	}

	public Date getProject_end() {
		return project_end;
	}

	public void setProject_end(Date project_end) {
		this.project_end = project_end;
	}
	
	
	
	
}
