package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SymetricData {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        HashMap<Integer, Integer> symmetricData = new HashMap<>();
        boolean flag = false;

        for (int i =0 ; i < arr.length; i++){
                int first1 = arr[i][0];
                int last1 = arr[i][1];
                Integer data = symmetricData.get(last1);

                if(data != null && data == first1){
                    System.out.println(last1 +"   "+ first1);
                    flag = true;
                }else
                    symmetricData.put(first1,last1);
        }
        if(!flag){
            System.out.println("No Symmetric pair");
        }
    }
}
