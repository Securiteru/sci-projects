public class PersonSorter {
    private Person[] pArray;
    private int arrayLength;


    public Person[] sortPeopleByAge(Person[] a){
        this.pArray=a;
        this.arrayLength=pArray.length;
        boolean swapped=false;

        Person temp;

            for (int j = 0; j <= arrayLength; j++) {
                if (((pArray[j].getAge()) > ((pArray[j+1].getAge())))) {
                    System.out.println(pArray[j].getAge());

                    temp = pArray[j];
                    pArray[j] = pArray[j+1];
                    pArray[j+1] = temp;

                }
            }
      return pArray;
    }
}


//
//    public Person[] sortPeopleByAge(Person[] a){
//        this.pArray=a;
//        this.arrayLength=pArray.length;
//        Person temp;
//        for(int i=1;i<arrayLength; i++) {
//            for (int j = 0; j < arrayLength - i; j++) {
//                if (((a[j].getAge()).compareTo((pArray[j + 1].getAge()))) > 0) {
//                    temp = pArray[j];
//                    pArray[j] = pArray[j + 1];
//                    pArray[j + 1] = temp;
//                }
//
//            }
//        }
//        return pArray;
//    }