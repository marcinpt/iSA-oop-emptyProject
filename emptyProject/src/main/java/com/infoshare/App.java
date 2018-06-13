package com.infoshare;

/**
 * Hello world!
 *
 */
public class App 
{
// Cw 1
// public static String hello(String imie) {
//        return imie;
//    }
//
//    public static String imieOdwrotnie(String imie){
//        String imieOdwr = "";
//        for (int i = imie.length()-1; i >= 0; i--) {
//            imieOdwr = imieOdwr + imie.charAt(i);
//        }
//        return imieOdwr;
//    }

    public static void main( String[] args )
    {
//
// System.out.println( "Hello World!" );
//        System.out.println("Witaj " + hello("Marcin"));
//        System.out.println("Imie odwrotnie: " + imieOdwrotnie("Marcin"));

//        Pies burek = new Pies("bokser", 20, "Azor", 20);
//        System.out.println(burek.szczekaj());
//        System.out.println("BMI wynosi: " + burek.oobliczBmi(20, 20));

        Pies p1 = new Pies();
        Pies p2 = new Pies("jamnik", 100, "Burek" );
        System.out.println(p1.szczekaj());
        System.out.println(p2.szczekaj());


    }
}

