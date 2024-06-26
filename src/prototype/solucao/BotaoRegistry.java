package prototype.solucao;

import prototype.models.Botao;
import prototype.models.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {
    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho. setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul. setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO",botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO",botaoVermelho);
        REGISTRY.put("BOTAO_AZUL",botaoAzul);
    }

    private BotaoRegistry(){

    }
    public static BotaoRegistry getInstance(){
        if(botaoRegistry == null){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return botaoRegistry;
    }
    public static Botao getBotao(String key){
        return BotaoFactory.getInstance(REGISTRY.get(key));


    }


    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave,botao);

    }
}
