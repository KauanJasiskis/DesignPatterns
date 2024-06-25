package prototype.problema;

import prototype.models.Botao;
import prototype.models.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo(){
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }

}
