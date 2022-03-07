import java.util.Scanner;
class LinerSearch{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        int outputResponse = LinerSearch1(count, array, key);
        System.out.println(outputResponse);

    }
    static int LinerSearch1(int count, int[] array, int key){
        for(int i = count-1 ; i <= count ; i--){
            if(array[i] == key){
                return i;
            }
        }return -1;

    }
    //write your code here
}