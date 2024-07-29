package com.example.javacours.heritage;

// final = permet de dire que la classe pegasus ne pourra pas etre extends
public final class MPegasus extends MHorse {
//    pas besoin de mettre le nom, x et y etend donné qu'il étend la classe Horse
    private int posZ;

    public MPegasus(String name) {
        /*
            fais référence au constructeur supérieur celui de la classe Horse ici
            (on passe le nom car pour construire un cheval on à besoin d'un nom)
         */
        super(name);
        this.posZ = 100;
    }

    public void fly(int z) {
        this.posZ = z;
        System.out.println("Le pégase s'élève dans les airs (Z= " + this.posZ + ")");
    }
}
