package utilities;

import data.GreenTicket;

import java.util.Scanner;


public class DataReader {

    private Scanner sc;

    public DataReader() { sc = new Scanner(System.in); }

    public void close() { sc.close(); }

    public int getInt() {
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }


    public String[] readAndCreateTasksList() {
        System.out.println("Give the number of words:");
        int numWords = this.getInt();

        if(numWords < 1) {
            System.out.println("Number of words cannot be less than 1");
            System.exit(0);
        }
        String[] tabWords = new String[numWords];

        for (int i = 0; i < numWords; i++) {
            System.out.println("Give a " + (i+1) + " words:");
            tabWords[i] = sc.nextLine();
        }
    return tabWords;
    }



    public int ReadLenOfWord () {
        System.out.println("Give a length of word:");
        int temp =  this.getInt();
        if(temp < 1) {
            System.out.println("Length of word cannot be less than 1");
            System.exit(0);
        }
        return temp;
    }


    public int ReadIndexOfWords () {
        System.out.println("Give a number of words:");
        int temp =  this.getInt();
        if(temp < 1) {
            System.out.println("Number of words cannot be less than 1");
            System.exit(0);
        }
        return temp;
    }


    public GreenTicket readAndCreateGreenTicket() {

        System.out.println("Give a first number:");
        int first = this.getInt();
        System.out.println("Give a second number:");
        int second = this.getInt();
        System.out.println("Give a third number:");
        int third = this.getInt();

        return new GreenTicket(first, second, third);
    }



}
