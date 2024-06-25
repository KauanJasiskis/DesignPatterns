package adapter.solucao;

import adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido){
        if(jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        }else{
            throw new IllegalArgumentException("Valor para saque nao permitido");
        }


    }
    public void deposita(BigDecimal saldo){
        jarConta.deposita(saldo);
    }
}
