package factorymethods.problema;

import factorymethods.models.Produto;
import factorymethods.models.ProdutoDigital;
import factorymethods.models.TipoProdutoEnum;
import factorymethods.solucao.ProdutoFactory;

public class TesteProdutoComFactory {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        System.out.println(produtoFisico);
        System.out.println(produtoDigital);


    }
}
