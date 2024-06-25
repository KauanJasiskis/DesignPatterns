package prototype.problema;

import prototype.models.Botao;
import prototype.models.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho(){
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
