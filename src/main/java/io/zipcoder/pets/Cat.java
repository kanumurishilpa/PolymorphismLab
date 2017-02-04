package io.zipcoder.pets;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class Cat extends Pet{

    public Cat(String name) {
        super.setName(name);
    }

    public String speak(){
        return "Meow";
    }

}

