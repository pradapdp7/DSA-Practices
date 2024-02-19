import java.util.Scanner;

public class stairs {
    public void main(String[] args){
        Scanner ip= new Scanner(System.in);
        int a = ip.nextInt();
        for (int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                if(i>=j) System.out.print("#");
                else System.out.print(" ");
            }System.out.println();
        }
    }
}
