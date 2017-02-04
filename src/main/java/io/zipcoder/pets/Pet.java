package io.zipcoder.pets;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
abstract class Pet implements Comparable<Pet>{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String speak();

    @Override
    public int compareTo(Pet pet) {
        if(compareName(pet) == 0){
            return compareType(pet);
        }else
            return compareName(pet);
    }

    private int compareName(Pet otherPet){
            return this.getName().compareTo(otherPet.getName());
    }

    private int compareType(Pet otherPet){
        return this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
    }
}
