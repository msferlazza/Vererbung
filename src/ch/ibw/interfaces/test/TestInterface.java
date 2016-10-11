package ch.ibw.interfaces.test;

import ch.ibw.interfaces.InterfaceBase;

/**
 * Created by Michele on 11.10.2016.
 */
public class TestInterface {

    public static void printAlleKinder(InterfaceBase[] alleKinder){
        if(alleKinder != null) {
            for(InterfaceBase kind : alleKinder) {
                kind.print();
            }
        }
    }

    public static void printKind(InterfaceBase k) {
        if(k != null) {
            k.print();
        }
    }

    public static void main(String[] args)
    {
        KindInterface1 kind1 = new KindInterface1();
        KindInterface2 kind2 = new KindInterface2();
        KindInterface3 kind3 = new KindInterface3();

        kind1.sayHello();

        InterfaceBase[] kinder = new InterfaceBase[3];
        kinder[0] = kind1;
        kinder[1] = kind2;
        kinder[2] = kind3;

        printAlleKinder(kinder);
        printKind(kind1);

        // anonyme Klasse
        printKind(
                new InterfaceBase() {
                    @Override
                    public void print()
                    {
                        System.out.println("Hallo Anonym");
                    }
                }
        );
    }
}
