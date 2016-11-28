package edu.spring.pro01.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.pro01.domain.TeamVO;
import edu.spring.pro01.persistence.TeamDAO;

@Service
public class TeamServiceImpl implements TeamService {

	private static final Logger logger =
			LoggerFactory.getLogger(TeamServiceImpl.class);
	@Autowired
	private TeamDAO teamDAO;
	
	@Override
	public int create(TeamVO tvo) {
		logger.info("TeamService: create() 호출...");
		return teamDAO.insert(tvo);
	}

}
