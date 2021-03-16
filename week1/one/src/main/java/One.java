package main.java;

public class One {

    private int a = 1;
    static double b =2.45;
    private byte c = 100;
    public long d = 3500;
    private float e = 235.33f;
    private double g = 2.35;
    private boolean h = true;
    private static final char i = 'A';
    public  void setValue(int j){
        for (int k = 0; k < 11; k++) {
            g=g+j;
        }
    }

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.a+One.b);
        System.out.println(one.d/one.c);
        System.out.println(one.e*one.g);
        if (one.h){
            System.out.println(One.i);
        }
        one.setValue(2);
        System.out.println(one.g);
    }
}
