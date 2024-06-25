package prototype.solucao;

import prototype.models.Botao;
import prototype.models.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        String chave = "BOTAO_ROXO";
        Botao botaoRoxo = new Botao();
        botaoRoxo.setCor("Roxo");
        botaoRoxo.setAltura(50);
        botaoRoxo.setLargura(300);
        botaoRoxo.setTipoBorda(TipoBordaEnum.FINA);
        BotaoRegistry.addRegistry(chave,botaoRoxo);

        Botao botaoRoxoPrototype = BotaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(botaoRoxoPrototype);

    }
}
