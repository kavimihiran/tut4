public class q7c {
    static int aValue = 5;
    public static void main(String[] args) {
        int aValue = 6;
        int bValue = 4;
        double name=process(bValue);
        System.out.println(name);
        System.out.println(aValue);

    }
    private static double process(int aValue) { //AA
        aValue = aValue + 4;
        return aValue;
    }

}