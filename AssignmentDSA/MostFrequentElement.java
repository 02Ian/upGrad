package AssignmentDSA;
/*Input:
8
1 3 2 5 2 1 9 2
Output:
2

Input:
8
10 15 12 11 13 12 11 11
Output:
11*/

import java.util.*;

public class MostFrequentElement {
    public static int mostFrequentElement(int[] arr) {
        HashMap<Integer, Integer> getData = new HashMap<>();  //HapMap Declaration
        Set<Integer> integerSet = new HashSet<>();            // Set Initialisation
        for (Integer arrElement : arr) {
            if (integerSet.contains(arrElement)) {
                getData.put(arrElement, getData.get(arrElement) + 1);
            } else {
                getData.put(arrElement, 1);
                integerSet.add(arrElement);
            }
        }
        System.out.println(getData);
        Integer key = Collections.max(getData.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();       // Collection Comparator.
        return key;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}