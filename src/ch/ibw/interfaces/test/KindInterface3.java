package ch.ibw.interfaces.test;

import ch.ibw.interfaces.InterfaceBase;

/**
 * Created by Michele on 11.10.2016.
 */
public class KindInterface3 implements InterfaceBase {


    public void sayHello() {
        System.out.println("Hello Word");
    }

    @Override
    public void print()
    {
        System.out.println("Kind 3 interface");
    }
}
