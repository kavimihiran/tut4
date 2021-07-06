//add 3 and 2. Because they have called only addition method.

public class q8 {
    public static void main(String[] args) {
        double Num1 = 3.0;
        int Num2 = 2;
        int total;
        total = processA( Num1, Num2);
        System.out.println(total);
    }
    private static int processA(double Sum, int Count) {
        int newAnswer = (int)Sum +  Count;
        return newAnswer;
    } //this program continues on next page >
    private static double processA(int Sum, double Count) {
        double newAnswer = (double) Sum * Count;
        return newAnswer;
    }


}
