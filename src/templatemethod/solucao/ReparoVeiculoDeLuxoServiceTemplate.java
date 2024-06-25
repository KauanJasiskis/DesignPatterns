package templatemethod.solucao;

import templatemethod.VeiculoParaReparo;

public class ReparoVeiculoDeLuxoServiceTemplate extends ReparoVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoDeLuxoServiceTemplate(VeiculoParaReparo veiculoParaReparo){
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
