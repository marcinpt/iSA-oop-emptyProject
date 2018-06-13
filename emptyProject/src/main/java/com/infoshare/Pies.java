package com.infoshare;

public final class Pies {
    public String rasa;
    public Integer waga;
    public String imie;
    public Integer wzrost;

    public Pies(String rasa, Integer waga, String imie, Integer wzrost) {
        this.rasa = rasa;
        this.waga = waga;
        this.imie = imie;
        this.wzrost = wzrost;
        System.out.println("Jestem w konstruktorze Pies");
    }
    public Pies(String rasa, Integer waga, String imie) {
        this(rasa, waga, imie, 0);
        System.out.println("Jestem w konstruktorze Pies");
    }
    public Pies() {
        this("jamnik", 100, "Szarik", 180);
        System.out.println("Jestem w konstruktorze Pies");
    }

    public String szczekaj() {
        return rasa + " " + imie + " o wadze " + waga + " kg, wzroscie " + wzrost + " zrobil/a hau hau";
    }



//    public double oobliczBmi(Integer waga, Integer wzrost) {
//        return waga / (wzrost * wzrost) * 1.0;
    }

