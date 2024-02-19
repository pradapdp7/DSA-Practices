import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for(int i=0;i<3;i++){
            al.add(new ArrayList<>());
        }
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                al.get(j).add(in.nextInt());
            }
        }
        System.out.print(al);
    }



}
