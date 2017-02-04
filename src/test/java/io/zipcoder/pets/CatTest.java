package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class CatTest {

    Cat cat;
    Dog dog;

    @Before
    public void setUp() {
        cat = new Cat("Tom");
        dog = new Dog("Som");
    }

    @Test
    public void speakTest() {
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals("Cat should speak Meow", expected, actual);
    }

    @Test
    public void compareToTest() {
        Assert.assertTrue("Should return true if cat is greater than dog", 0 < cat.compareTo(dog));
    }

    @Test
    public void compareByNameTest() {
        int expected = 1;
        int actual = cat.getName().compareTo(dog.getName());
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void compareByTypeTest() {
        int expected = -1;
        int actual = cat.getClass().getSimpleName().compareTo(dog.getClass().getSimpleName());
        Assert.assertEquals(actual,expected);
    }
}
