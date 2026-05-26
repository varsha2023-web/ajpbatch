package Abstraction;
abstract class Bird
{
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird
{
    void fly()
    {
        System.out.println("Eagle flies");
    }
}

final class SerpentEagle extends Eagle
{
    final void eat()
    {
        System.out.println("Serpent Eagle hunts over mountains and eats");
    }

    /*void fly()
    {
        System.out.println("Serpent Eagle flies at greatest heights");
    }*/
}

public class Abstract
{
    final int a = 100;

    public static void main(String[] args)
    {
        SerpentEagle se = new SerpentEagle();

        se.fly();
        se.eat();
    }
}