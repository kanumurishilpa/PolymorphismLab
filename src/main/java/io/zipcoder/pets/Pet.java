package io.zipcoder.pets;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
abstract class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String speak();
}
