import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    /**
     * Creating an array of ints, measuring its length in order to
     * instantiate the unsorted array of Person objects using
     * RNG ages and RNG names composed of chars.
     *
     */

    Random rand = new Random();
    int[] pArray = new int[10];
    int arrayLength = pArray.length;
    Person[] unsorted = new Person[10];

    /**
     * For Loop that creates the instances of Person using
     * RNG age and RNG names using the previously created
     * random array
     *
     */

    for (int i = 0; i < arrayLength; i++) {
      pArray[i] = rand.nextInt(50) + 1;
      String name = "Persony" + i + "Randy";
      unsorted[i] = new Person(name, name + "lasty", pArray[i]);
    }

    /**
     * Returns each instance's age. Used to check initially how the
     * array looked
     *
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i].getAge());
        }

     */


    /**
     * Instantiating a PersonSorter class.
     * Call the PS's method sortPeopleByAge on an empty
     * sorted Person array using an unsorted array as
     * a method argument and then outputting the content
     * for each person
     *
     */
    PersonSorter ps = new PersonSorter();

    Person[] sorted = ps.sortPeopleByAge(unsorted);

//    System.out.println(Arrays.toString(sorted));


    /**
     * Check used to compare the first form [unsorted] of the array
     * and the last form of the array [sorted
     *
     */
    System.out.println(Arrays.toString(pArray));

    for (Person Persony : sorted) {
      System.out.println(Persony.getAge());

    }


  }

}
