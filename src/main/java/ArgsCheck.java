public class ArgsCheck {

    public boolean Check(String x, String y, char z{
        boolean xCorrect=false;
        boolean yCorrect=false;
        int checkX=0;
        int checkY=0;
        double result;

        try{
            checkX = Integer.parseInt(x);  //taking in an integer input throws NumberFormat Exception if not an integer
            xCorrect=true;
        }

        catch(NumberFormatException e){   //is input is not an integer, occurs while parsing the command line input argument
            System.out.println("Your input is not a number");

        }catch(ArrayIndexOutOfBoundsException e) { //as takes in input from command line which is stored to a Args array in main, if this array is null implies no input given
            System.out.println("Please enter a number on the command line");
        }

        try{
            checkY= Integer.parseInt(y);
            yCorrect=true;//taking in an integer input throws NumberFormat Exception if not an integer
        }

        catch(NumberFormatException e){   //is input is not an integer, occurs while parsing the command line input argument
            System.out.println("Your input is not a number");

        }catch(ArrayIndexOutOfBoundsException e) { //as takes in input from command line which is stored to a Args array in main, if this array is null implies no input given
            System.out.println("Please enter a number on the command line");
        }

        if(xCorrect && yCorrect){
            return true;
        }else{
            return false;
        }



//        if(xCorrect && yCorrect){
//            switch(z){
//                case '+':
//                    result=checkX+checkY;
//                    break;
//                case '-':
//                    result=checkX-checkY;
//                    break;
//                case '*':
//                    result=checkX*checkY;
//                    break;
//                case '/':
//                    result=checkX*checkY;
//                    break;
//                default:
//                    printf("Invalid Operator!!!\n");
//                    return -1;
//            }
//
//            System.out.println("The result of the arithmetic operator "+ "'"+z+"'"+"and the ints "+checkX+" and "+checkY+ "is: "+result+".");
//        }



    }
}
