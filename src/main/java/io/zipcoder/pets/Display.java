package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class Display {

    public int askUserforInt(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextInt();
    }

    public String askUserforString(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }

    public void displaySinglePet(Pet pet){
        System.out.println("This is my pet called " + pet.getName() + " Which is a " + pet.getClass().getSimpleName() + " and it speaks " + pet.speak());
    }
}
