package org.example.Facade.SubSistemaUmCRM;

public class CrmService {

    //quando temos uma classe somente com metodos staticos é uma boa pratica criar um construtor privado
    //pois como só tem coisas staticas nao vamos deixa ninguem fica instanciando atoa
    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistam de crm UM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
