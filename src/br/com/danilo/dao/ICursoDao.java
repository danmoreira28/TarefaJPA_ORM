package br.com.danilo.dao;

/**
 * @author danmoreira28
 */

import java.util.List;

import br.com.danilo.domain.Curso;

public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
