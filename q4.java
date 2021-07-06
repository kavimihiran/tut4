import java.util.Scanner;
public class q4 {
    public static void main(String []args){
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=myscanner.nextInt();
        int name=doublling(num);
        System.out.println(name);
    }
    private static int doublling(int a){
        a=a*2;
        return a;
    }
}