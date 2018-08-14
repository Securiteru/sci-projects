/**
 * Person Class with getters, setters and constructors.
 *
 * @author Adrian Padurean
 */


public class Person {
  /**
   * Represents the Person’s first name.
   */
  private String firstName;
  /**
   * Represents the Person’s last name.
   */
  private String lastName;
  /**
   * Represents the Person’s age.
   */
  private Integer age;

  /**
   * Creates an Person with the specified names and age.
   *
   * @param firstName The Person’s first name.
   * @param lastName  The Person’s last name.
   * @param age       The Person’s age.
   */


  public Person(String firstName, String lastName, Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  /**
   * Gets the Person’s first name.
   *
   * @return A string representing the Person’s first
   * name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the Person’s first name.
   *
   * @param firstName A String containing the Person’s
   *                  first name.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the Person’s last name.
   *
   * @return A string representing the Person’s last
   * name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the Person’s last name.
   *
   * @param lastName A String containing the Person’s
   *                 last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the Person’s age.
   *
   * @return An int representing the Person’s age
   */
  public Integer getAge() {
    return age;
  }

  /**
   * Sets the Person’s age.
   *
   * @param firstName An int containing the Person’s
   *                  age.
   */
  public void setAge(Integer age) {
    this.age = age;
  }
}
