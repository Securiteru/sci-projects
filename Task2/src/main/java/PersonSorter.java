public class PersonSorter {
    private Person[] pArray;
    private int arrayLength;

    public PersonSorter(int[] a) {

    }

    public Person[] sortPeopleByAge(Person[] a){
        this.pArray=a;
        this.arrayLength=pArray.length;
        int temp;
        for(int i=0;i<arrayLength; i++)
            for(int j=0;j<arrayLength-1; j++) {
                if (pArray[j] > pArray[j + 1]) {
                    temp = pArray[j];
                    pArray[j] = pArray[j + 1];
                    pArray[j + 1] = temp;
                }
            }
        }
    }
