package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class Controller {

    Display display;
    PetFactory petFactory;
    PetManagement petManagement;

    Controller(){
        display = new Display();
        petFactory = new PetFactory();
        petManagement = new PetManagement();
    }

    public void askUserForNumberOfPets(){
         petManagement.numberOfPets = display.askUserforInt("How many pets Do you Have?");
    }

    public void askUserForPetInfo(){
        for(int i=0 ; i < petManagement.numberOfPets; i++){
            petManagement.pets.add(i,petFactory.makeAPet(askUserForPetType(),askUserForPetName()));
        }
    }

    private String askUserForPetName(){
        return display.askUserforString("What is the name of you pet");
    }

    private String askUserForPetType(){
        return display.askUserforString("What is the type of pet");
    }

    public void displayPet(){
        for(int i=0; i < petManagement.numberOfPets; i++){
            display.displaySinglePet(petManagement.pets.get(i));
        }
    }

}
