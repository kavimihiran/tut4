public class q7b {
    static int aValue = 5;
    public static void main(String[] args) {
        int aValue = 6;
        int bValue = 4;
        int name=process(bValue);
        System.out.println(name);
        System.out.println(aValue);

    }
    private static int process(int aValue) { //AA
        aValue = aValue + 4;
        return aValue;
    }

}