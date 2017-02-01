package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 1/31/17.
 */
public class CowTest {

    Cow cow;
    @Test
    public void speakTest(){
        cow = new Cow("Lak");
        String expected = "Moo";
        String actual = cow.speak();
        Assert.assertEquals("Cow should speak Moo", expected, actual);
    }
}
