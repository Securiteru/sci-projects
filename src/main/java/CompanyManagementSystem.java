import people.Employee;
import people.Junior;
import people.Managers;
import people.Mid;

import java.util.*;


/**
 * Company Management System class that has 7 methods that do various operations to populate and retrieve lists based on
 * certain criteria and sorting.
 */

public class CompanyManagementSystem {

    /**
     * Company Management System variables for keeping collections of objects based on the populatedHashSet() method
     * and its sorting by addIntoRightSet()
     */

    private HashSet<Employee> employeeList;
    private HashSet<Employee> JuniorList;
    private HashSet<Employee> MidList;
    private HashSet<Employee> ManagersList;


    /**
     * Function that creates some random Employee objects based on the number input given
     *
     * @param x  input given for the number of Employees
     * @return allEmployees  the populated array
     */
    public HashSet<Employee> populateHashSet(int x){
        int randomCount=x;

        HashSet<Employee> allEmployees=new HashSet<Employee>();

        double[] pArray = new double[randomCount+1];
        Random rand = new Random();

        for (int i = 0; i <= randomCount; i++) {
            boolean randomy=rand.nextBoolean();

            pArray[i] = rand.nextDouble() + 1;
            String name = "RandomGeneratedEmployee" + i+ " Beep-Boop-I-Am-Robot";
            if(i % 3 == 0){
                Employee a=new Junior(randomy, name, pArray[i]);
                allEmployees.add(a);
            }else if(i% 2 == 0){
                Employee a=new Mid(randomy, name,pArray[i]+0.5);
                allEmployees.add(a);
            }else{
                Employee a= new Managers(randomy, name,pArray[i]+1);
                allEmployees.add(a);
            }
        }

        this.addIntoRightSet(allEmployees);
        this.employeeList=allEmployees;
        return allEmployees;

    }

    final Comparator comparator = (Comparator<Employee>) (o1, o2) -> {
        if (o1.getYearsOfExperience() == o2.getYearsOfExperience()) {
            return 1;
        }
        if (o1.getYearsOfExperience() > o2.getYearsOfExperience()) {
            return 0;
        } else {
            return -1;
        }
    };


    /**
     * Function that returns a set with the employees that don't have parking from the
     * INTERNAL list (the private set declared at the top)
     * the list is sorted by age as specified in the requirements
     *
     * @return employeeByAgeTree  the populated array
     */
    public Set<Employee> getAllEmployeesWithoutParkingFromInternalList() {

        Set<Employee> employeeByAgeTree = new TreeSet<>(comparator);

        for (Employee e : employeeList) {
            if (e.isHasPark() == false) {
                employeeByAgeTree.add(e);
            }
        }

        return employeeByAgeTree;
    }

    /**
     * Function that returns a set with the employees that don't have parking from the
     * GIVEN list (the set called from MAIN)
     * the list is sorted by age as specified in the requirements
     *
     * @return employeeByAgeTree  the populated array
     */
    public Set<Employee> getAllEmployeesWithoutParking(Set<Employee> setty) {

        Set<Employee> employeeByAgeTree = new TreeSet<>(comparator);

        for (Employee e : setty) {
            if (e.isHasPark() == false) {
                employeeByAgeTree.add(e);
            }
        }

        return employeeByAgeTree;
    }


    /**
     * Function that places employee based on their class into the appropriate Collections
     * of the Class, this method is called when the big list is generated with
     * populateHashSet();
     *
     * @return N/A
     */
    public void addIntoRightSet(Set<Employee> input){
        HashSet<Employee> scopeMidList=new HashSet<>();
        HashSet<Employee> scopeManagersList=new HashSet<>();
        HashSet<Employee> scopeJuniorList=new HashSet<>();

        for(Employee e: input){
            if(e.getClass()==Mid.class){
                scopeMidList.add(e);
               // System.out.println("Adding mid");
            }

            if(e.getClass()==Junior.class){
                scopeJuniorList.add(e);
               // System.out.println("Adding juni");
            }

            if(e.getClass()==Managers.class){
                scopeManagersList.add(e);
                // System.out.println("Adding managers");
            }
        }
        this.ManagersList=scopeManagersList;
                this.JuniorList=scopeJuniorList;
                        this.MidList=scopeMidList;

    }


    /**
     * Functions that are the getters equivalent for this Class
     *
     * @return JuniorList/MidList/ManagersList
     */

    public HashSet<Employee> returnJuniorSet(){
        return this.JuniorList;
    }

    public HashSet<Employee> returnMidSet(){
        return this.MidList;
    }

    public HashSet<Employee> returnManagersSet(){
        return this.ManagersList;
    }



}
