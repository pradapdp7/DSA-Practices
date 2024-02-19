import java.util.Scanner;

public class triplets {
    public static void main(String[] args){
        int arr[] = new int[3], arr2[]=new int[3];
        Scanner ip = new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=ip.nextInt();
        }
        for(int k=0;k<3;k++){
            arr2[k]=ip.nextInt();
        }
        int a=0,b=0;
        for(int i=0;i<3;i++){
            if(arr[i]==arr2[i]){
                a+=0;
                b+=0;
            }
            if(arr[i]>arr2[i]){
                a++;
            } else if (arr[i]<arr2[i]) {
                b++;
            }
        }
        System.out.println(a + " "+ b);
    }
}
