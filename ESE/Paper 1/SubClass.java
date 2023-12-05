import java.util.*;

abstract class Abs
{
    Abs()
    {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void concrete_method()
    {
        System.out.println("This is a normal method of abstract class");
    }
}

public class SubClass extends Abs
{
    void a_method()
    {
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args)
    {
        SubClass o = new SubClass();

        o.a_method();
        o.concrete_method();
    }
}