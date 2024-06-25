package facade;

import subsistemaDois.CepApi;
import subsistemaUm.CrmApi;

public class Facade {
    public void migrarCliente(String nome,String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmApi.gravarCliente(nome,cep,cidade,estado);

    }
}
