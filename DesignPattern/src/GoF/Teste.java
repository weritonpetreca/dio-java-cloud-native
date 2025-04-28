package GoF;

import GoF.facade.Facade;
import GoF.singleton.SingletonEager;
import GoF.singleton.SingletonLazy;
import GoF.singleton.SingletonLazyHolder;
import GoF.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

//        Facade

        Facade facade = new Facade();
        facade.migrarCliente("Weriton", "37564000");

    }
}
