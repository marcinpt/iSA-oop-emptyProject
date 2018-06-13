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

        // zad 9.1
        Suka s1 = new Suka("jamniczka", 100, "Moli", 40);
        Suka s2 = new Suka("bokserka", 50, "Moli");
        System.out.println(s1.szczekaj());
        System.out.println(s2.szczekaj());

        //10.1
        Pies p4 = new Pies();
        Pies p4 = new Pies("dalmatynczyk", 3, "Dax", 80);
        Pies p4 = new Pies();
        Suka s3 = new Suka();
        PiesSamiec = new PiesSamiec();






    }
}

