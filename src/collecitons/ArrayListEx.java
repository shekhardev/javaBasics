package collecitons;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(13);
        numbers.add(34);

        System.out.println(numbers.get(2));
        System.out.println("# 1st Iteration ");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("#2nd Iteration");
        for (Integer values: numbers){
            System.out.println(values);
        }
    }
}
