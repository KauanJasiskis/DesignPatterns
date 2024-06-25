package adapter.solucao;

import java.math.BigDecimal;

public class ClienteJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarAdapter;

    public ClienteJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarAdapter) {
        this.jarAdapter = jarAdapter;
    }

    public void saca(BigDecimal valorPretendido){
        jarAdapter.saca(valorPretendido);
    }
    public void deposita(BigDecimal valor){
        jarAdapter.deposita(valor);
    }
}

