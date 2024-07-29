package com.example.javacours;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CourFichiers {
    public static void main(String[] args) throws IOException {
        Path f = Paths.get("com/example/javacours/fichiers/info");
        Path f2 = Paths.get("com/example/javacours/fichiers/test");
        Charset c = Charset.forName("UTF-8");
        StandardOpenOption mode = StandardOpenOption.DELETE_ON_CLOSE;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = Files.newBufferedReader(f);
            br.skip(1);
            System.out.println(br.readLine());
            br.close();

            bw = Files.newBufferedWriter(f);
            bw.write("Bonjour", 2, 5);
            bw.newLine();
            bw.write("Hello");
            bw.close();

        }catch (IOException e) {
            System.out.println(e);

        }catch (Exception e) {
            System.out.println(e);

        }

        System.out.println("-----------------------------------");

        try {
            System.out.println(Files.exists(f));
            Files.createFile(f2);

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
