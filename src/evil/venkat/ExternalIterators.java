package evil.venkat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExternalIterators {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        for( int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(int e:list){
//            System.out.println(e);
//        }
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
        //list.forEach(( integer)->System.out.println(integer));
       // list.forEach(System.out::println);
        //list.forEach(e-> System.out.println(e));
//        list.stream()
//                .map(e->String.valueOf(e))
//                .forEach(System.out::println);

//        int result =0;
//        for(int e:list){
//            if (e % 2 ==0){
//                result += e*2;
//            }
//        }
//        System.out.println(result);
        System.out.println(
        list.stream()
                .filter(e-> e %2 ==0)
                .map(e->e*2)
                .reduce(0, Integer::sum));
    }
}
