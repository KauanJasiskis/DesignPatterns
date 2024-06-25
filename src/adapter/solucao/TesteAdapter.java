package adapter.solucao;

import adapter.problema.ClienteJarOperacoesContaCorrente;
import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClienteJarOperacoesContaCorrenteAdapter client = new ClienteJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque);

        client.deposita(new BigDecimal(500));
    }
    }

