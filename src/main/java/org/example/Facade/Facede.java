package org.example.Facade;

import org.example.Facade.SubSistemaDoisCRM.CepApi;
import org.example.Facade.SubSistemaUmCRM.CrmService;

public class Facede {
    //a idéia é ser uma interface mais simples

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
