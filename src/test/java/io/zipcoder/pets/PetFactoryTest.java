package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class PetFactoryTest {

    PetFactory petFactory;
    Pet pet;

    @Before
    public void setUP(){
        petFactory = new PetFactory();
        pet = petFactory.makeAPet("Cat","Tom");
    }

    @Test
    public void getPetNameTest(){
        String expected = "Tom";
        String actual = pet.getName();
        Assert.assertEquals("Pet name should equal Tom",expected,actual);
    }

    @Test
    public void getPetTypeTest(){
        String expected = "Cat";
        String actual = pet.getClass().getSimpleName();
        Assert.assertEquals("Pet class should equal Cat",expected,actual);
    }
}