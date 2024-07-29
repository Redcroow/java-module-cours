package com.example.javaexo.exo4;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 1. Initilisation de la grille
        Grid grid = new Grid(Config.GRID_LINES, Config.GRID_COLUMNS);

        // 2. Boucle principale
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            grid.print(); // Appelle la méthode print() de Grid (à implémenter)

            System.out.print("COMMANDE >> ");
            String command = scanner.next();

            switch(command)
            {
                case "add":
                    int addX = scanner.nextInt();
                    int addY = scanner.nextInt();

                    // Ici, appeler la méthode d'ajout d'un point
                    grid.addPoint(addX, addY);

                    break;

                case "del":
                    int delX = scanner.nextInt();
                    int delY = scanner.nextInt();

                    // Ici, appeler la méthode de suppression d'un point
                    grid.deletePoint(delX, delY);

                    break;

                case "clear":
                    // Ici, appeler la méthode de nettoyage de la grille
                    grid.clear();

                    break;

                case "full" :
                    grid.graphToFull();
                    break;

                case "fv" :
                    grid.graphToFV();
                    break;

                case "quit":
                    System.out.println("Fin du programme...");
                    System.exit(0);

                default:
                    System.out.println("Commande non reconnue.");
            }
        }
    }
}