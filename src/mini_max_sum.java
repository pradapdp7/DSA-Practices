import java.util.Scanner;

public class mini_max_sum {
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner a= new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]= a.nextInt();
        }
        int temp=0;
        for(int j=1;j<5;j++){
            if(arr[j]<temp){
                temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
        int min =0, max =0;
        for(int k=0;k<4;k++){
            min+=arr[k];
        }
        for(int m=1;m<5;m++){
            max+=arr[m];
        }
        System.out.println(min + " " + max);
    }
}
