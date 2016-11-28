package edu.spring.pro01.persistence;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.spring.pro01.domain.TeamVO;

@Repository
public class TeamDAOImpl implements TeamDAO {

	private static final String NAMESPACE = "edu.spring.pro01.TeamMapper";
	private static final Logger logger =
			LoggerFactory.getLogger(TeamDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(TeamVO tvo) {
		logger.info("TeamDAO: insert() 호출....");
		return sqlSession.insert(NAMESPACE + ".insert_team", tvo);
	}

}
