package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Wataha {
    public List<Pies> czlonkowie = new ArrayList<>();

    public void addCz(Pies cz) {
        czlonkowie.add(cz);
    }

    public String ktoWStadzie() {
        StringBuilder out = new StringBuilder();
        out.append("czlonkowie stada =  ");
        for (Pies pies : czlonkowie) {
         out.append(pies.imie);
         out.append(" , ");
         out.append(" ; ")


        }
        return out.toString()
    }

}
