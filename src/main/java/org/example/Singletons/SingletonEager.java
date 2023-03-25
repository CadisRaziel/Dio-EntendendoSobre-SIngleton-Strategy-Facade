package org.example.Singletons;

//singleton "apressado" //->instancia direto

public class SingletonEager {

    //a partir do momento que a variavel abaixo é definida ele ja atribui a instancia
    //no momento que essa classe for acionada, essa instancia ja vai ser atribuida
    //e automaticamente quando alguem chamar ela ja ta pronta pra ser retornada
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        //ninguem fora dessa classe vai consegui instancia ela
        super();
    }

    public static SingletonEager getInstancia(){

        return instancia;
    }
}
