package org.example.Singletons;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        //classe responsavel por encapsular a instancia
        //thread safe
        //mais recomendada
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        //ninguem fora dessa classe vai consegui instancia ela
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
