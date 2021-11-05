import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Challenge2 {

    File file = new File("src\\level2_4.in");
    HashMap<Integer, Integer> outmap = new HashMap<>();

    public int[] getHighestValueOfLine(String[] stringArr){
        int[] max = {0, 0};
        for(int i = 1; i < stringArr.length; i++){
            if(max[1] < parseInt(stringArr[i])){
                max[0] = parseInt(stringArr[0]);
                max[1] = parseInt(stringArr[i]);
            }
        }
        return max;
    }

    public int[] getLowestValueOfLine(String[] stringArr){
        int[] min = {parseInt(stringArr[0]), parseInt(stringArr[1])};
        for(int i = 1; i < stringArr.length; i++){
            if(min[1] > parseInt(stringArr[i])){
                min[0] = parseInt(stringArr[0]);
                min[1] = parseInt(stringArr[i]);
            }
        }
        return min;
    }

    public Challenge2(){
        try {
            Scanner sc = new Scanner(file);
            sc.nextLine();
            FileWriter writer = new FileWriter("level2_4.out");

            ArrayList<String> inputStrings = new ArrayList<>();

            while(sc.hasNextLine()) {
                inputStrings.add(sc.nextLine());
            }

            for(int i = 0; i < inputStrings.size(); i++){
                String[] stringArrI = inputStrings.get(i).split(" ");

                int[] lowestValue = getLowestValueOfLine(stringArrI);
                int[] highestValue = {0, 0};

                for(int j = 0; j < inputStrings.size(); j++){
                    if(i != j){
                        String[] stringArrJ = inputStrings.get(j).split(" ");
                        if(highestValue[1] < getHighestValueOfLine(stringArrJ)[1]){
                            highestValue = getHighestValueOfLine(stringArrJ);
                        }
                    }
                }

                if(lowestValue[1] == highestValue[1]){
                    writer.write("NO TRADE" + "\n");
                }else {
                    writer.write(lowestValue[0] + " " + lowestValue[1] + " " + highestValue[0] + " " + highestValue[1] + "\n");
                }
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Challenge2 challenge2 = new Challenge2();
    }
}
