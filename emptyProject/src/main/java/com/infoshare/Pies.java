package com.infoshare;

public class Pies {
    public String rasa;
    public Integer waga;
    public String imie;
    public Integer wzrost;

    public Pies(String rasa, Integer waga, String imie) {
        this(rasa, waga, imie, 0);
    }
    public Pies(String rasa, Integer waga, String imie, Integer wzrost) {
        this.rasa = rasa;
        this.waga = waga;
        this.imie = imie;
        this.wzrost = wzrost;
    }
    public Pies() {
        this("jamnik", 100, "Szarik", 180);
    }

    public String szczekaj() {
        return rasa + " " + imie + " o wadze " + waga + " kg, wzroscie " + wzrost + " zrobil hau hau";
    }



//    public double oobliczBmi(Integer waga, Integer wzrost) {
//        return waga / (wzrost * wzrost) * 1.0;
    }

