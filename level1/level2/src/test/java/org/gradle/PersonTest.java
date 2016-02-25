package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
    		System.out.println("----------TESTTTTT--------");
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
