package es.ubu.lsi.dao.multas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.ubu.lsi.dao.JpaDAO;
import es.ubu.lsi.model.multas.Bonus;
import es.ubu.lsi.model.multas.BonusPK;
import es.ubu.lsi.model.multas.Incidencia;

public class BonusDAO extends JpaDAO <Bonus, BonusPK>{

	private static final Logger logger = LoggerFactory.getLogger(TipoIncidenciaDAO.class);
	
	private BonusDAO(EntityManager em) {
		super(em);
	}

	@Override
	public List<Bonus> findAll() {
		try {
			TypedQuery<Bonus> query = getEntityManager().createNamedQuery("Bonus.findAll", Bonus.class);
			return query.getResultList();

		} catch (Exception ex) {
			logger.error(ex.getMessage());
			throw new RuntimeException(ex);
		}
	}
}
