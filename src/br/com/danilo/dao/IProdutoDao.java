package br.com.danilo.dao;

import br.com.danilo.domain.Curso;
import br.com.danilo.domain.Produto;

import java.util.List;

/**
 * @author danmoreira28
 */

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto prod);

    public List<Produto> buscarTodos();
}
