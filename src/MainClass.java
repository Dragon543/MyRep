

import java.util.Random;
import java.util.Scanner;

/**
 * Created by taras_000 on 5/28/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter value from 0 to 20 ");
        String entervalue = sc.next();
        String out;
        String exit = "yes";
        String result = String.valueOf(rand.nextInt(20));
        do {
            if (result == entervalue) {
                System.out.print("You win\n");
                System.out.print("Wont out?");
                out=sc.next();
            } else {
                System.out.print("You loose\n");
                System.out.print("Wont out?");
                out=sc.next();
                if(out == "yes"){
                    System.exit(0);
                }
                if(out == "no"){
                    continue;
                }
                else {
                    return;
                }
            }
        }
        while (exit == out);
        System.out.print("Your value= " + entervalue + ", " + "PC value= " + result + "\n");
    }
}
