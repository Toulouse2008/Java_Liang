public class Test {
    public static void main(String[] args){
        int j, k;
        int i = j = k = 2;
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("100 miles equals to " + kilometers + "kilometers.");
        System.out.println(kilometers);
        double x = 5;
        System.out.println(i);
        // can not redefine a variable as another type::: double i = 2.09;
        System.out.println(i);
        System.out.println(x / 2);
        System.out.println(5 / 2);

    }
}
