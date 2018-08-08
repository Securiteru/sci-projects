public class PersonSorter {
    private Person[] pArray;
    private int arrayLength;

    public PersonSorter(int[] a) {

    }

    public Person[] sortPeopleByAge(Person[] a){
        this.pArray=a;
        this.arrayLength=pArray.length;
        Person temp;
        for(int i=1;i<arrayLength; i++) {
          for (int j = 0; j < arrayLength - i; j++) {
//            System.out.println(a[j].getAge());
            if (((a[j].getAge()).compareTo((pArray[j + 1].getAge()))) > 0) {
              temp = pArray[j];
              pArray[j] = pArray[j + 1];
              pArray[j + 1] = temp;
            }

          }
        }
      return pArray;
    }
    }
