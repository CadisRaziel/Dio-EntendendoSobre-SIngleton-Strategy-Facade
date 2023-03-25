package org.example.Singletons;

public class MainTestes {
    public static void main(String[] args) {
        //caso o endereço de memoria for o mesmo em ambas chamadas é que funcionou !!!
        SingletonLazy lazy = SingletonLazy.getInstancia(); //-> vai me devolve a instancia dele.out.println("Hello world!");
        System.out.println("Primeira chamada |LAZY| " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Segunda chamada |LAZY| " + lazy);

        System.out.println("------------------------------------");

        //caso o endereço de memoria for o mesmo em ambas chamadas é que funcionou !!!
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Primeira chamada |Eager| " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Segunda chamada |Eager| " + eager);

        System.out.println("------------------------------------");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Primeira chamada |LazyHolder| " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Segunda chamada |LazyHolder| " + lazyHolder);
    }
}