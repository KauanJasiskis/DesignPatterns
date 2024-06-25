package templatemethod.problema;

import templatemethod.VeiculoParaReparo;

public class TesteReparaVeiculo {
    public static void main(String[] args) {
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparaVeiculoDeLuxoService rp1 = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);

        rp1.reparaVeiculo();

        System.out.println("-----------------------");



        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoComumService rp2 = new ReparaVeiculoComumService(veiculoComum);

        rp2.reparaVeiculo();
    }
}
