package Classes.methods.Main;

import Classes.methods.abstracttion.Blood;
import Classes.methods.abstracttion.Coffee;
import Classes.methods.abstracttion.Liquid;
import Classes.methods.abstracttion.Wine;

public class LiquidMain {
    public static void main(String[] args) {

        Liquid[] liquids = { new Blood(100, "A", "Red Blood Cells"),
                             new Coffee(96, "Robusta", "Melanoidins"),
                             new Wine(78.5, "Ethyl", "Red")};

        for(Liquid e: liquids) {
            e.TempOfBoiling();
            System.out.println();
            e.GetAllFeatures();
            System.out.println();
        }
    }
}
