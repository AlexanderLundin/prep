package com.prep.interviews.strings;

import org.junit.jupiter.api.Test;

import javax.xml.bind.ValidationEvent;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressValidationTest {

    @Test
    public void test() {
        //Setup
        List<String> expected = new ArrayList<>();
        expected.add("IPv4");
        expected.add("IPv4");
        expected.add("IPv4");
        expected.add("IPv4");
        expected.add("IPv4");
        List<String> input = new ArrayList<>();
        input.add("121.18.19.20");
        input.add("0.12.12.34");
        input.add("121.234.12.12");
        input.add("23.45.12.56");
        input.add("0.1.2.3");
        //Exercise
        List<String> actual = IPAddressValidation.validateAddresses(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}