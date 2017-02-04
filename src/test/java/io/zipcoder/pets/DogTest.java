package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class DogTest {
    Dog dog;
    Cat cat;

    @Before
    public void setUp(){
        cat = new Cat("Tom");
        dog = new Dog("ramu");
    }

    @Test
    public void speakTest(){
        dog = new Dog("ramu");
        String expected = "Bow Wow";
        String actual = dog.speak();
        Assert.assertEquals("Dog should speak Bow Wow", expected, actual);
    }

    @Test
    public void compareToTest() {
        Assert.assertFalse("Should return true if cat is greater than dog", 0 > dog.compareTo(cat));
    }
}
