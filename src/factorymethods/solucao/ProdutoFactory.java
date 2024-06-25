package factorymethods.solucao;

import factorymethods.models.Produto;
import factorymethods.models.ProdutoDigital;
import factorymethods.models.ProdutoFisico;
import factorymethods.models.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO -> {
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            }
            case DIGITAL -> {
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            }
            default -> throw new IllegalArgumentException("Tipo de produto invalido");
        }

    }



}
