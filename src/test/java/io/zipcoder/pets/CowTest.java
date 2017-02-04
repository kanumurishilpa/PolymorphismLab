package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class CowTest {

    Cow cow;
    Dog dog;


    @Before
    public void setUp(){
        cow = new Cow("Lak");
        dog = new Dog("Fluffy");
    }

    @Test
    public void speakTest(){
        String expected = "Moo";
        String actual = cow.speak();
        Assert.assertEquals("Cow should speak Moo", expected, actual);
    }

    @Test
    public void compareToTest() {
        Assert.assertTrue("Should return true if cat is greater than dog", cow.compareTo(dog) > 0);
    }

}
