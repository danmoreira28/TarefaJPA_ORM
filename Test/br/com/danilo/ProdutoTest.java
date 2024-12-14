package br.com.danilo;

/**
 * @author danmoreira
 */

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import br.com.danilo.dao.ProdutoDao;
import br.com.danilo.dao.IProdutoDao;
import br.com.danilo.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("B1");
        produto.setDescricao("Produto 1");
        produto.setValor(1000D);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
