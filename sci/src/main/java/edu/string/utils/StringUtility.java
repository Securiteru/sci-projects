package edu.string.utils;

public class StringUtility   {
private String inputString;

public String removeSpace(String inputy){
    this.inputString=inputy;

    inputString=inputString.replaceAll("\\s+","");

    return inputString;

}

public String numberReplace(String input){
    this.inputString=input;

    String[] splitted=this.splitIntoArray(input);

    StringBuilder sb= new StringBuilder();

    for(int x=0; x<splitted.length;x++){

            String tempy=null;

            if(splitted[x].matches("[A-Za-z0-9 -]+")) {
                switch (splitted[x].toLowerCase()) {
                    case "one":
                        tempy = "1";
                        break;
                    case "two":
                        tempy = "2";
                        break;
                    case "three":
                        tempy = "3";
                        break;
                    case "four":
                        tempy = "4";
                        break;
                    case "five":
                        tempy = "5";
                        break;
                    case "six":
                        tempy = "6";
                        break;
                    case "seven":
                        tempy = "7";
                        break;
                    case "eight":
                        tempy = "8";
                        break;
                    case "nine":
                        tempy = "9";
                        break;
                    case "zero":
                        tempy = "0";
                        break;
                    case ";":
                        tempy = "!";
                        break;
                    default:
                        tempy = splitted[x];
                        break;
                }

                if (x == splitted.length - 1)  {
                    sb.append(tempy);
                } else {
                    sb.append(tempy + " ");
                }
            }
            else{
                splitted[x]=splitted[x].replace(";","!");
                sb.append(splitted[x]);
            }
    }

    inputString=sb.toString();

    return inputString;
}

public String[] splitIntoArray(String input){

    input=input.replaceAll("!"," ;");

    String[] intermediary=input.split("[\\s ]");

    return intermediary;
}


}
