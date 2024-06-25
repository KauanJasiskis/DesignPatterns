package strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
    }
}
