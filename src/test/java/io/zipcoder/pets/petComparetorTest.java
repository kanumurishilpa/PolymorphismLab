package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 2/1/17.
 */
public class petComparetorTest {

    PetComparator petComparator;
    Dog dog1;
    Dog dog2;


    @Before
    public void setUp(){
        petComparator = new PetComparator();
        dog1 = new Dog("Fluke");
        dog2 = new Dog("Scooby");
    }

    @Test
    public void petCompareTest(){
        Assert.assertTrue("Should lexographically compare two strings", 0 > petComparator.compare(dog1,dog2));
    }


}
