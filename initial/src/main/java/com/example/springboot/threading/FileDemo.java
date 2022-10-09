import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Mujahid.txt");
        //BufferedReader br = new BufferedReader(fr);
        List<Integer> list = new ArrayList<>();  
        try {

            Scanner input = new Scanner(fr);
            while(input.hasNextLine()){
                System.out.println("before if");
                //while (input.hasNextInt()) {
                    System.out.println("after if");
                    list.add(input.nextInt());
                //}
            }

            //fr.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);

        Collections.reverse(list);
        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        for (int num : res)
            System.out.print(num + " ");
        
            System.out.println();

        FileWriter fw = new FileWriter("Mujahid_reversed.txt");

        try {
            for (int num : res)
                fw.write(String.valueOf(num) + " "); 
            fw.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        List<Integer> list2 = new ArrayList<>();
        FileReader fr2 = new FileReader("Mujahid_reversed.txt");

        try {
            Scanner input = new Scanner(fr2);

            while (input.hasNext()) {
                list2.add(input.nextInt());
            }
        }

        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(list2);
    }
}