package test.fr.eni.encheres.dal.jdbc;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.dal.ArticleVenduDAO;
import fr.eni.encheres.dal.RetraitDAO;
import fr.eni.encheres.dal.jdbc.ArticleVenduDAOJDBCImpl;
import fr.eni.encheres.dal.jdbc.RetraitDAOJDBCImpl;

class RetraitDAOJDBCImplTest {
	//pour commit
	
	private static RetraitDAO retraitDAO = new RetraitDAOJDBCImpl();
	private static ArticleVenduDAO articleDao = new ArticleVenduDAOJDBCImpl();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		

	}

	@Test
	void  testInsert() {
		
		Retrait retrait = new Retrait();
		retrait.setRue("8 Impasse des Colombes");
		retrait.setCodePostal("56789");
		retrait.setVille("Paris");
		
		
		assertNotNull(retrait.getId());
		
	}


	@Test
	void testGetById() throws BusinessException {
		
		Retrait retrait1 = new Retrait();
		retrait1.setRue("67 rue general leclerc");
		retrait1.setCodePostal("75988");
		retrait1.setVille("Paris");
		
		retraitDAO.insert(retrait1);
		
		List<Retrait> retraits = retraitDAO.getAll();
		Retrait retraitAttendu = retraits.get(retraits.size()-1);
		Retrait retraitRecupere = retraitDAO.getById(retraitAttendu.getId())
;
		
		assertEquals(retraitAttendu.getId(), retraitRecupere.getId());
		
		
	}

	@Test
	void testGetAll() throws BusinessException {
		
		Retrait retrait2 = new Retrait("57 rue general leclerc","56789","Paris");
		Retrait retrait3 = new Retrait("68 rue marechal juin", "34567", "Bordeaux");
		Retrait retrait4 = new Retrait("76 avenue montmartre","28100","Dreux");
		
		List<Retrait> retraits = retraitDAO.getAll();
		retraits.add(retrait2);
		retraits.add(retrait3);
		retraits.add(retrait4);
		
		retraitDAO.insert(retrait2);
		retraitDAO.insert(retrait3);
		retraitDAO.insert(retrait4);
		
		List<Retrait> allRetraits = retraitDAO.getAll();
		assertEquals(allRetraits.size(), retraits.size());
		
		
	}

	@Test
	void testUpdate() throws BusinessException {
		List<Retrait> retraits = retraitDAO.getAll();
		
		Retrait retraitAUpdate = retraits.get(retraits.size()-1);
		
		retraitAUpdate.setCodePostal("45678");
		
		retraitDAO.update(retraitAUpdate);
		
		Retrait retraitUpdate = retraitDAO.getById(retraitAUpdate.getId());
		
		assertEquals(retraitUpdate.getCodePostal(), "45678");
	}

	@Test
	void testDelete() throws BusinessException {
		
		List<Retrait> retraits = retraitDAO.getAll();
		
		retraits.remove(retraits.size()-1);
		
		retraitDAO.delete(retraits.size()-1);
		
		List<Retrait> newRetraits = retraitDAO.getAll();
		
		assertEquals(retraits.size(), newRetraits.size());
	}

}
