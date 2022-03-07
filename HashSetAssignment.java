import java.util.*;

public class HashSetAssignment {

    public static void symmetricPair(int[][] arr) {
        // Write code here
        HashMap<Integer, Integer[]> unmatched = new HashMap<Integer, Integer[]>();
        List<Integer[]> pairs = new ArrayList<Integer[]>();

        for(int i = 0; i < arr.length; ++i) {

            if(unmatched.containsKey(arr[i][1])) {

                Integer[] match = unmatched.get(arr[i][1]);
                if(match[1] == arr[i][0]) {
                    pairs.add(match);
                    unmatched.remove(arr[i][1]);
                } else {
                    unmatched.put(arr[i][0], new Integer[]{ arr[i][0], arr[i][1] });
                }
            } else {
                unmatched.put(arr[i][0], new Integer[]{ arr[i][0], arr[i][1] });
            }
        }

        for(int i = 0; i < pairs.size(); ++i) {
            System.out.println(pairs.get(i)[0] + " " + pairs.get(i)[1]);
        }
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }

}