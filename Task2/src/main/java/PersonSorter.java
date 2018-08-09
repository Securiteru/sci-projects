/**
 * PersonSorter class that sorts an array of Person class using bubble sort
 *
 * @author Adrian Padurean
 */

public class PersonSorter {
  /**
   * Represents the class variable pArray that holds
   * the array of Person instances.
   */
  private Person[] pArray;

  /**
   * Represents the length of the pArray, the length
   * of the Person instances array.
   */
  private int arrayLength;


  /**
   * Creates an Person with the specified names and age.
   *
   * @param a An array of an Person object.
   *
   * @return pArray An array of that object that has been
   * sorted based on the age of the object's instance.
   */

  public Person[] sortPeopleByAge(Person[] a) {
    this.pArray = a;
    this.arrayLength = pArray.length;
    Person temp;
    int j = 0;
    boolean swapped = true;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < arrayLength - j; i++) {
        if (((a[i].getAge()) > ((pArray[i + 1].getAge())))) {
          temp = pArray[i];
          pArray[i] = pArray[i + 1];
          pArray[i + 1] = temp;
          swapped = true;
        }
      }
    }
    return pArray;
  }
}