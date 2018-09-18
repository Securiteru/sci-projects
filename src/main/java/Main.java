import people.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        CompanyManagementSystem cms=new CompanyManagementSystem();

        HashSet<Employee> allly=cms.populateHashSet(5);

        Set<Employee> emploWithout=cms.getAllEmployeesWithoutParkingFromInternalList();

        Set<Employee> emploWithoutfromList=cms.getAllEmployeesWithoutParking(allly);

        Iterator<Employee> returnWithout = emploWithoutfromList.iterator();

        Iterator<Employee> employeeIteratorWithoutParking = emploWithout.iterator();

        Set<Employee> returnJuni=cms.returnJuniorSet();

        Iterator<Employee> returnJuniIter = returnJuni.iterator();

        //Iterator for returning Juniors (to showcase return per role objective)
        while (returnJuniIter.hasNext()) {
            System.out.println(returnJuniIter.next());
        }

        //Iterator for returning employees without parking(from internally populated list)
        while (employeeIteratorWithoutParking.hasNext()) {
            System.out.println(employeeIteratorWithoutParking.next());
        }

        //Iterator for returning employees without parking(from externally populated list)
        while (returnWithout.hasNext()) {
            System.out.println(returnWithout .next());
        }


    }

}
