//package hashMap;
//
//import com.sun.activation.registries.MailcapParseException;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class LinkedHashMapUniqueCharacter {
//    public static void main(String arg[]) {
//
//        Scanner in = new Scanner(System.in);
//
//        //storing the input string to String variable "str"
//        String str = in.nextLine();
//        //write your code here
//        Map<Character, String > h = new LinkedHashMap<>();
//        for(int i =0 ; i< str.length(); i++){
//        char ch = str.charAt(i);
//            for( Character c : h.keySet()){
//            if(h.get(c) == 1){
//                System.out.println(c);
//                break;
//            }
//        }
//        }
//    }
//}
