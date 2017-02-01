package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class DogTest {
    Dog dog;
    @Test
    public void speakTest(){
        dog = new Dog("ramu");
        String expected = "Bow Wow";
        String actual = dog.speak();
        Assert.assertEquals("Dog should speak Bow Wow", expected, actual);
    }
}
