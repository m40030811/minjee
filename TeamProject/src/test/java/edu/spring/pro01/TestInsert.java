package edu.spring.pro01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.pro01.domain.ProjectVO;
import edu.spring.pro01.domain.TeamVO;
import edu.spring.pro01.persistence.ProjectDAO;
import edu.spring.pro01.persistence.TeamDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*.xml")
@WebAppConfiguration
public class TestInsert {

	private static final Logger logger = 
			LoggerFactory.getLogger(TestInsert.class);

	
	@Autowired
	private TeamDAO teamDAO;
	@Autowired
	private ProjectDAO projectDAO;
	
	@Test
	public void doTest() throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		Date project_start = format.parse("161111");
		Date project_end = format.parse("161212");
		
		TeamVO tvo = new TeamVO("team_name", null, null, "test team_intro", null, null);
		int result1 = teamDAO.insert(tvo);
		logger.info("result1: " + result1);
		
		ProjectVO pvo = new ProjectVO(tvo.getTeam_id(), "test project_name", null, project_start, project_end, null, null);
		int result2 = projectDAO.insert(pvo);
		logger.info("result2: " + result2);
	}
}
