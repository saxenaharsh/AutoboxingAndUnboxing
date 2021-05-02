package com.HarshSaxena;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[5];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tom");

        //ArrayList<int> intArrayList = new ArrayList<int>();
//        ArrayList<intValue> intValueArrayList = new ArrayList<intValue>();
//        intValueArrayList.add(new intValue(65));

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
    /*    for(int i = 0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));
            System.out.println(i + "---->" + integerArrayList.get(i).intValue());
        }*/

//        Integer myIntValue = 56;  //Integer.valueof(56);
//        int myInt = myIntValue.intValue();

        ArrayList<Double> dblArrayList = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <=10.0; dbl += 0.5){
            dblArrayList.add(Double.valueOf(dbl));
        }
        for(int i = 0; i <= dblArrayList.size(); i++){
            double value = dblArrayList.get(i).doubleValue();
            System.out.println(i + "---->" + value);
        }










    }
}
