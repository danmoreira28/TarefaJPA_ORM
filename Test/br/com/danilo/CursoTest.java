package br.com.danilo;

/**
 * @author danmoreira
 */

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import br.com.danilo.dao.CursoDao;
import br.com.danilo.dao.ICursoDao;
import br.com.danilo.domain.Curso;

public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A2");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
