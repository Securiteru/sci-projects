package edu.string.utils;

public class Main {

    public static void main(String[] args) {

        String test1="I have four apples \n";
        String test2="I want twenty-nine dollars";
        String test3="I want twenty nine dollars";
        String test4="Five six SEVEN eiGHt !! ";

        StringUtility stringy=new StringUtility();
        System.out.println(stringy.numberReplace(test1));
        System.out.println(stringy.numberReplace(test2));
        System.out.println(stringy.numberReplace(test3));
        System.out.println(stringy.numberReplace(test4));
//        System.out.println(stringy.removeSpace(test1));
//        System.out.println("Testing");





    }
}
