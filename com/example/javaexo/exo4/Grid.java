package com.example.javaexo.exo4;

public class Grid
{
    private int lines;
    private int cols;
    String[][] graph;

    public Grid(int lines, int cols) {
        this.lines = lines;
        this.cols = cols;
        this.graph = new String[lines][cols];

        clear();
    }

    public void addPoint(int addX, int addY) {
        if(addX >= 0 && addX <= Config.GRID_LINES && addY >= 0 && addY <= Config.GRID_COLUMNS) {
            if (!isFull()) {
                if (!containsPoint(addX, addY)) {
                    this.graph[addX][addY] = Config.GRID_POINT;
                }else {
                    System.out.println("Il y a déja un point a cet emplacement");
                }
            }else {
                System.out.println("Le graph est plein");
            }
        }else {
            System.out.println("Les points entré ne peuvent pas etre mis sur la grille");
        }
    }

    public void print() {
        // Print top border
        System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("-");
        }
        System.out.println("+");

        // Print grid with side borders
        for (int i = 0; i < lines; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println("|");
        }

        // Print bottom border
        System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public void deletePoint(int delX, int delY) {
        if (delX >= 0 && delX < lines && delY >= 0 && delY < cols) {
            graph[delX][delY] = String.valueOf(' ');
        } else {
            System.out.println("Coordinates out of bounds");
        }
    }

    public void clear() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                graph[i][j] = " ";
            }
        }
    }

    public boolean containsPoint(int addX, int addY) {
        return graph[addX][addY] == Config.GRID_POINT;
    }

    public boolean isFull() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                if (graph[i][j].equals(String.valueOf(' '))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void graphToFull() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                graph[i][j] = Config.GRID_POINT;
            }
        }
    }

    public void graphToFV() {
        addPoint(0, 0);
        addPoint(0, 1);
        addPoint(0, 2);
        addPoint(0, 3);
        addPoint(0, 4);
        addPoint(0, 5);
        addPoint(0, 6);
        addPoint(0, 7);
        addPoint(0, 8);
        addPoint(0, 9);
        addPoint(0, 12);
        addPoint(0, 20);

        addPoint(1, 0);
        addPoint(1, 13);
        addPoint(1, 19);

        addPoint(2, 0);
        addPoint(2, 1);
        addPoint(2, 2);
        addPoint(2, 3);
        addPoint(2, 4);
        addPoint(2, 14);
        addPoint(2, 18);

        addPoint(3, 0);
        addPoint(3, 15);
        addPoint(3, 17);

        addPoint(4, 0);
        addPoint(4, 16);
    }
}