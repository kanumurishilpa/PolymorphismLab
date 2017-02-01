package io.zipcoder.pets;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class PetFactory {


    public Pet makeAPet(String typeOfPet, String nameOfPet){

        switch (typeOfPet.toLowerCase()){
            case "dog":
                Dog dog = new Dog(nameOfPet);
                return  dog;
            case "cat":
                Cat cat = new Cat(nameOfPet);
                return cat;
            case "cow":
                Cow cow = new Cow(nameOfPet);
                return cow;
            default:
                Dog animal = new Dog(nameOfPet);
                return animal;
        }
    }
}
