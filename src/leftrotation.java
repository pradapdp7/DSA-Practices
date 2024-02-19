import java.util.Scanner;

public class leftrotation {
    public static void main(String[] args){
        int a,b;
        Scanner ip = new Scanner(System.in);
        a= ip.nextInt();
        b= ip.nextInt();
        int arr[]=new int[a];
        for(int c=0;c<a;c++){
            arr[c]=ip.nextInt();
        }
        for(int i = 0; i < b; i++){
            int j, first;
            first = arr[0];

            for(j = 0; j < a-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int m=0;m<a;m++){
            System.out.print(arr[m] + " ");
        }
    }
}
