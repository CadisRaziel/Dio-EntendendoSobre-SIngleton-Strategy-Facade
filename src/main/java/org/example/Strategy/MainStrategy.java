package org.example.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();;

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
    }
}