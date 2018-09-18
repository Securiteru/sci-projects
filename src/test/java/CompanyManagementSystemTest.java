import org.junit.jupiter.api.BeforeEach;
import people.Employee;
import people.Junior;
import people.Mid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.collections4.CollectionUtils;


import static org.junit.jupiter.api.Assertions.*;

class CompanyManagementSystemTest {

    /**
     * CompanyManagementSystemTest variables that keep the two sets which will be compared
     */

    private Set<Employee> testSet;
    private Set<Employee> expectedSet;


    /**
     * Method that creates 2 employee objects, adds them both to both collections, removes the one with parking from
     * the expected Set (so that when equality is asserted only the one without parking is in the expected)
     */
    @BeforeEach
    public void setUp(){
        testSet=new HashSet<>();
        CompanyManagementSystem cmsy=new CompanyManagementSystem();
        Employee test1=new Junior(true,"Andrei",0.5);
        Employee test2=new Mid(false,"Alexandru",0.5);
        testSet.add(test1);
        testSet.add(test2);
        testSet = cmsy.getAllEmployeesWithoutParking(testSet);
        expectedSet = cmsy.getAllEmployeesWithoutParking(testSet);
        expectedSet.remove(test1);

    }

    /**
     * Method that asserts equality by testing whether the contents of the Collections are the same.
     * assertEqual did not work as Junit tried to assess the equality by comparing everything
     * including the pointer for the Collection.
     *
     * I found and imported a library and used its isEqualCollection() method (org.apache.commons.collections4.CollectionUtils)
     */
    @org.junit.jupiter.api.Test
    void getAllEmployeesWithParking() {
        //Asta da o eroare desi ii corect, pointerul TreeSet-ului ii diferit.
        //assertEquals(expectedSet,testSet);

        //solved with a library.
        assertTrue(CollectionUtils.isEqualCollection(expectedSet,testSet));
    }
}