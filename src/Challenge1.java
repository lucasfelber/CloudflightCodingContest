import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Challenge1 {

    File file = new File("src\\level2_example.in");
    HashMap<Integer, Integer> outmap = new HashMap<>();

    public Challenge1(){
        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while(sc.hasNextLine()){
                String[] stringArr = sc.nextLine().split(" ");
//                for(String s : stringArr){
//                    System.out.println(s);
//                }
                int value = 0;
                for(int i = 1; i < stringArr.length; i++){
                    value += parseInt(stringArr[i]);
                }
                outmap.put(parseInt(stringArr[0]), value);
            }
            sc.close();
            for(Map.Entry entry : outmap.entrySet()){
                System.out.println(entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void solve(){
//        System.out.println("Hello World!");
//        for(int i : input){
//            System.out.println(input.indexOf(i) + ": " +i);
//        }

    }

    public static void main(String[] args){
        Challenge1 challenge1 = new Challenge1();
    }
}
