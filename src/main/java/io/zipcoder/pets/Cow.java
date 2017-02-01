package io.zipcoder.pets;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class Cow extends Pet{

    public Cow(String name) {
        super.setName(name);
    }

    public String speak(){
        return "Moo";
    }
}
