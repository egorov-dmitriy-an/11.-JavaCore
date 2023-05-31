package sample;

import regular.Decorator;
import regular.Mathematica;

public class Main {

    public static void main(String[] args) {
        int result = Mathematica.add(5, 4);
        System.out.println(Decorator.decorate(result));
        result = Mathematica.sub(5, 4);
        System.out.println(Decorator.decorate(result));
        result = Mathematica.mul(5, 4);
        System.out.println(Decorator.decorate(result));
        result = Mathematica.div(5, 4);
        System.out.println(Decorator.decorate(result));
    }
}