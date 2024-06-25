package proxy.model;

import builder.solucao.Pessoa;
import proxy.solucao.ProxyPessoa;

public class PessoaService {
    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }
    public void save(Pessoa pessoa){
        proxyPessoa.save(pessoa);
    }
    public Pessoa findyById(Long id){
        return proxyPessoa.findyById(id);
    }

}
