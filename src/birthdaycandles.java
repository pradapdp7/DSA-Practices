import java.util.Scanner;

public class birthdaycandles {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = ip.nextInt();
        }int arr2[]=new int[a-1];
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i!=j) {
                    sum += arr[j];
                }
            }
            arr2[i]=sum;
            sum=0;
        }
    }
}
