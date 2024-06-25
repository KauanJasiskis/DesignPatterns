package proxy.solucao;

import builder.solucao.Pessoa;
import proxy.model.PessoaRepository;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
    private Map<Long,Pessoa> cache = new HashMap<>();
    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save......");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada.");
    }

    @Override
    public Pessoa findyById(Long id) {
        log.info("Iniciando chamada do metodo findById......");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if(cache.get(id) != null){
            log.info("Esta pegando do cache");

        }else{
            log.info("Esta pegando do repository");
             pessoa = super.findyById(id);
            cache.put(id,pessoa);
        }
        log.info("Chamada do metodo findyById finalizada.");
        long fim = System.currentTimeMillis();
        log.info("Tempo gasto na chamada... " + (fim - inicio));
        return pessoa;
    }
}
