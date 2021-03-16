package Classes.methods.Main;

import Classes.methods.abstracttion.Blood;
import Classes.methods.abstracttion.Coffee;
import Classes.methods.abstracttion.Liquid;
import Classes.methods.abstracttion.Wine;

public class LiquidMain {
    public static void main(String[] args) {

        Liquid[] liquids = { new Blood(100, "A", "Red Blood Cells",75,40),
                             new Coffee(96, "Robusta", "Melanoidins",120, 100),
                             new Wine(78.5, "Ethyl", "Red",30,150)};

        for(Liquid e: liquids) {
            System.out.println(e.Density());
            System.out.println();
            e.GetAllFeatures();
            System.out.println();
        }

    }
}
