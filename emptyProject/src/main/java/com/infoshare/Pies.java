package com.infoshare;

public class Pies {
    public String rasa;
    public Integer waga;
    public String imie;
    public Integer wzrost;

    public Pies(String rasa, Integer waga, String imie, Integer wzrost) {
        this.rasa = rasa;
        this.waga = waga;
        this.imie = imie;
        this.wzrost = wzrost;
    }
    public String szczekaj() {
        return rasa + " " + imie + " o wadze " + waga + " kg zaszczekal";
    }

    public double oobliczBmi(Integer waga, Integer wzrost) {
        return waga / wzrost * wzrost * 1.0;
    }
}
