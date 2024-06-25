package chainofresponsibility.solucao;

import chainofresponsibility.Carro;
import chainofresponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {
    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarro descontoCarro =
                new DescontoCarroFiat(
                new DescontoCarroFord(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null))));
        return descontoCarro.aplicaDesconto(carro);
    }
}
