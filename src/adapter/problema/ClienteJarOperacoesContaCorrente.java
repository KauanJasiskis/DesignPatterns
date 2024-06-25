package adapter.problema;

import java.math.BigDecimal;

public class ClienteJarOperacoesContaCorrente {

    private JarOperacoesContaCorrente jocc;

    public ClienteJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }
    public boolean validaSaldo(BigDecimal valorPretendidoSaque){
        return jocc.validaSaldo(valorPretendidoSaque);
    }
    public void saca(BigDecimal valorPretendido){
        jocc.saca(valorPretendido);
    }
    public void deposita(BigDecimal valor){
        jocc.deposita(valor);
    }
}
