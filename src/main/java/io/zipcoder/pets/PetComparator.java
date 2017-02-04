package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by shilpakanumuri on 2/1/17.
 */
class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2){
        if (pet1 != null && pet2 != null) {
            if (compareType(pet1, pet2) == 0) {
                return compareName(pet1, pet2);
            } else return compareType(pet1, pet2);
        } else return 0;
    }

    private int compareName(Pet pet1, Pet pet2){
        if (pet1 != null && pet2 != null) {
            return pet1.getName().compareTo(pet2.getName());
        }return 0;
    }

    private int compareType(Pet pet1, Pet pet2){
        if (pet1 != null && pet2 != null) {
            return pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
        } else return 0;
    }

}
