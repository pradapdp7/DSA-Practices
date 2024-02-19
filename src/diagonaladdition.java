import java.util.Scanner;

public class diagonaladdition {
    public static void main(String[] args) {
        int a;
        Scanner ip = new Scanner(System.in);
        a = ip.nextInt();
        int arr[] = new int[a];
        for (int c = 0; c < a; c++) {
           {
                arr[c] = ip.nextInt();
            }
        }
        float pos=0,neg=0,zero=0;
        for(int i=0;i<a;i++){
                if(arr[i]>0){
                    pos++;
                }
                else if(arr[i]<0){
                    neg++;
                }
                else if(arr[i]==0){
                    zero++;
            }
        }
        System.out.println(pos +" "+ neg +" "+ zero);
        System.out.printf("%1.4f",pos/a);
        System.out.printf("%1.4f",neg/a);
        System.out.printf("%1.4f",zero/a);
    }
}
