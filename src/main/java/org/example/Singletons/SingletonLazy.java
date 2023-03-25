package org.example.Singletons;

//Singleton "Preguiçoso" //-> nao instancia direto, vai fazer verificações se a instancia é nula
public class SingletonLazy {
    //No primeiro momento ele não disponibiliza a instancia

    private static SingletonLazy instancia;

    //construtor para ninguem externamente instancie esse singleton
    //ele precisa ser privado
    private SingletonLazy(){
        super();
    }

    //Aqui vamos expor a instancia para alguem poder chamar
    public static SingletonLazy getInstancia(){
        if(instancia == null){
            //só quando a instancia for iguala nullo que eu instancio ela
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
