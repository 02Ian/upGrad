package hashMap;

import java.util.*;
import java.util.stream.Collectors;

public class GradedQuestionMap {

    //Method to print distinct values
    public static void printValues(Map<Integer,String> map) {
        //Write your code here
        final Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();
        final HashSet<String> valueSet = new HashSet<>();
        while (iter.hasNext()) {
            final Map.Entry<Integer, String> next = iter.next();
            if (!valueSet.add(next.getValue())) {
                iter.remove();
            }
        }
        for (String data: valueSet
             ) {
            System.out.print(data+" ");
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
