import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge1 {

    File file = new File("src\\input1.txt");
    ArrayList<Integer> input = new ArrayList<>();

    public Challenge1(){
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                input.add(sc.nextInt());
            }
            sc.close();
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
        challenge1.solve();
    }
}
