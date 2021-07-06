import java.util.Scanner;
public class q5 {
    public static void main(String []args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("enter a number :");
        int num=myScanner.nextInt();
        int num1=mul_num(num);
        System.out.println(num1);
    }
    private static int mul_num(int a){
        int count=1;
        int factorial=1;
        while (count<a){
            count=count+1;
            factorial=factorial*(count);

        }
        return factorial;
    }
}
