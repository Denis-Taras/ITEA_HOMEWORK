package com.company.denis.Homework8.Europe;

import java.util.ArrayList;
import java.util.List;

public class Europe {

    List<ChangeOfTerritory> change = new ArrayList<>();

    {
        ChangeOfTerritory change1 = new ChangeOfTerritory(2025, "Украина победила РФ");
        ChangeOfTerritory change2 = new ChangeOfTerritory(2030, "Польща исчезла как государство");
        ChangeOfTerritory change3 = new ChangeOfTerritory(2035, "Молдавия забрала Приднестровье");
        change.add(change1);
        change.add(change2);
        change.add(change3);

    }

    class ChangeOfTerritory {
        int year;
        String change;

        public ChangeOfTerritory(int year, String change) {
            this.year = year;
            this.change = change;
        }
    }

    public void printChange(){
        for (ChangeOfTerritory c : change) {
            System.out.printf("%s в %d году\n", c.change, c.year);
        }
    }

    public static void main(String[] args) {
        Europe europe = new Europe();
        europe.printChange();
    }
}
