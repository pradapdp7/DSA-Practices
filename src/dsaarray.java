import java.util.Scanner;

public class dsaarray {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int array[] = new int[b];
        for(int i=0;i<b;i++){
            array[i]= a.nextInt();
        }
        for(int j=b-1;j>=0;j--){
            System.out.print(array[j] + " ");
        }

    }

}
