package com.infoshare;

public class Suka extends Pies{


    public Suka(String rasa, Integer waga, String imie, Integer wzrost) {
        super(rasa, waga, imie, wzrost);
    }
    public Suka(String rasa, Integer waga, String imie) {
        super(rasa, waga, imie, 0);
    }

    @Override
    public String szczekaj() {
        return super.szczekaj();
    }
}
