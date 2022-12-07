package ie.atu;

import org.junit.After;
import  org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.api.Test;
import org.junit.jupiter.api.Test;


public class EmployeeTest {

    @Before
    public void setup() {

    }

    @Test
    void nameTest() {
        Employee e = new Employee(String name, String pps);
        assertEquals(Expected:"Nathan", "30223F");
        System.out.println(e);
        //^^ Didn't set up right for me but what i would do if it did
    }

    @Test
    void nameTestF() {
        assertEquals(Expected:"Nathan", Actual:"Nath");
        thorw new IllegalArgumentException("Invalid name, must be between 5 and 30 characters");
    }


    @Test
    void ppsTest() {
        Employee e = new Employee(String name, String pps);
        assertEquals(Actual:"Nathan", "30223F");
        assert (Expected : "Nathan","30223F");
        System.out.println(e);

    }

    @Test
    void ppsTestF() {
        assertEquals(Expected:"30223F", Actual:"30223");
        thorw new IllegalArgumentException("Employee PPS number should be 6 characters");
    }


    @After
    public void teardown() {

    }

}


