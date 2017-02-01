package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class CatTest {

    Cat cat;

    @Test
    public void speakTest(){
        cat = new Cat("Tom");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals("Cat should speak Meow", expected, actual);
    }
}
