package GoF;

import GoF.singleton.SingletonEager;
import GoF.singleton.SingletonLazy;
import GoF.singleton.SingletonLazyHolder;

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
    }
}
