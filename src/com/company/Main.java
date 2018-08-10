package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner invoer = new Scanner(System.in);

        System.out.println("Geef een tekst in");
        String tekst = invoer.nextLine();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("tekst.txt" )))) {


            writer.println(tekst);

        }

        System.out.println("output:");

        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("tekst.txt")))) {

            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                System.out.println(line);

            }

        }

    }
    // write your code here

}
