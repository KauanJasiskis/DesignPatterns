package prototype.problema;

import prototype.models.Botao;
import prototype.models.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul(){
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}