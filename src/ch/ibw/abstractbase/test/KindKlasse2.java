package ch.ibw.abstractbase.test;

import ch.ibw.abstractbase.AbstractBase;

/**
 * Created by Michele on 11.10.2016.
 */
public class KindKlasse2 extends AbstractBase {


    @Override
    public void sayHallo()
    {
        System.out.println("Hello Michele");
    }

    @Override
    public void print()
    {
        System.out.println("Kind 2");
    }
}
