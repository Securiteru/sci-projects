import java.util.Arrays;
import java.util.Random;

public class Mainymain {
    public static void main(String[] args) {

        int[] pArray = new int[10];
        Random rand = new Random();
        int arrayLength = pArray.length;

        Person[] unsorted = new Person[10];

        for (int i = 0; i < arrayLength; i++) {
            pArray[i] = rand.nextInt(50) + 1;
            String name = "Persony" + i+ "Randy";
            unsorted[i]=new Person(name, name, pArray[i]);
        }

//        for (int i = 0; i < unsorted.length; i++) {
//            System.out.println(unsorted[i].getLastName());
//        }

        System.out.println(Arrays.toString(pArray));

        PersonSorter ps = new PersonSorter();


        Person[] sorted = ps.sortPeopleByAge(unsorted);

//        System.out.println(Arrays.toString(sorted));

//        for (Person Persony: sorted) {
//            System.out.println(Persony.getAge());
//
//        }






//        this.pArray=a;
//        this.arrayLength=pArray.length;
//        int temp;
//        for(int i=0;i<arrayLength; i++)
//            for(int j=0;j<arrayLength-1; j++) {
//                if (pArray[j] > pArray[j + 1]) {
//                    temp = pArray[j];
//                    pArray[j] = pArray[j + 1];
//                    pArray[j + 1] = temp;
//                }
//            }
    }

}
