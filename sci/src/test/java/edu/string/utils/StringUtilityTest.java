package edu.string.utils;


import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilityTest {

   String []testInputs={"I have four apples","I want twenty-nine dollars", "I want twenty nine dollars", "Five six SEVEN eiGHt!! "};
   String []desiredOutputs={"I have 4 apples","I want twenty-nine dollars", "I want twenty 9 dollars", "5 6 7 8 !! "};

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        StringUtility strinyg=new StringUtility();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void removeSpace() {
        StringUtility strinyg=new StringUtility();
        String inputTest="I have four apples";
        inputTest= strinyg.removeSpace(inputTest);
        String desired="Ihavefourapples";

        assertEquals(inputTest, desired);

    }

    @org.junit.jupiter.api.Test
    void numberReplace() {

        StringUtility strinyg=new StringUtility();

        String []testInputs={"I have four apples","I want twenty-nine dollars", "I want twenty nine dollars", "Five six SEVEN eiGHt !!"};
        String []desiredOutputs={"I have 4 apples","I want twenty-nine dollars", "I want twenty 9 dollars", "5 6 7 8 !!"};
        String []testOutputs=new String[testInputs.length];

        for(int x=0;x<testInputs.length;x++){
            testInputs[x]=strinyg.numberReplace(testInputs[x]);
            testOutputs[x]=testInputs[x];
        }

        assertArrayEquals(testOutputs, desiredOutputs);


    }

    @org.junit.jupiter.api.Test
    void splitIntoArray() {
        StringUtility strinyg=new StringUtility();

        String inputTest="I have four apples";

        String[] outPutTest= strinyg.splitIntoArray(inputTest);

        Set <String> outputCollection=new LinkedHashSet<>();

        System.out.println("outPutTest test");
        for(String s: outPutTest){
            outputCollection.add(s);
        }

        String[] desired={"I","have","four","apples"};
        Set <String> desiredCollection=new LinkedHashSet<>();

        System.out.println("Desired test");
        for(String s: desired){
            desiredCollection.add(s);
        }

        assertEquals(outputCollection, desiredCollection);
    }
}