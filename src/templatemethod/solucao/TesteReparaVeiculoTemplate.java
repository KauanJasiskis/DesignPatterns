package templatemethod.solucao;

import templatemethod.VeiculoParaReparo;
import templatemethod.problema.ReparaVeiculoComumService;
import templatemethod.problema.ReparaVeiculoDeLuxoService;

public class TesteReparaVeiculoTemplate {
    public static void main(String[] args) {
        System.out.println("---------------LUXO---------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparoVeiculoService rp1 = new ReparoVeiculoDeLuxoServiceTemplate(veiculoDeLuxo);

        rp1.reparaVeiculo();

        System.out.println("---------------COMUM---------------");



        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparoVeiculoService rp2 = new ReparoVeiculoComumServiceTemplate(veiculoComum);

        rp2.reparaVeiculo();
    }
}
