package proxy.solucao;

import builder.solucao.Pessoa;

public interface ProxyPessoa {

    void save(Pessoa pessoa);
    Pessoa findyById(Long id);
}
