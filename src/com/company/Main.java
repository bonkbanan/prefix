package com.company;

public class Main {

    public static String getPrefix(String[] array) {
        String prefix = "";
        String shortest = getShortest(array);
        for (int i = 0; i < shortest.length(); i++) {
            char sybmbol = shortest.charAt(i);
            for (int j = 0; j < array.length; j++) {
                if(sybmbol!=array[j].charAt(i)){
                    return prefix;
                }
            }
            prefix += sybmbol;
        }
        return prefix;
    }

    public static String getShortest(String[] array){
        String shortest = array[0];
        for (int i = 0; i < array.length; i++) {
            if(shortest.length() > array[i].length()){ shortest = array[i]; }
        }
        return shortest;
    }

    public static String getPrefix2(String[] array) {
        int length = 0;
        int i = 0,j = 0;
        while (true){
            char symbol = array[i].charAt(j);
        }
        
    }

        public static void main(String[] args) {
        String[] array = new String[]{"abkd","abcd","abd","abxy","aba","ak"};
        System.out.println(getPrefix(array));
    }
}
