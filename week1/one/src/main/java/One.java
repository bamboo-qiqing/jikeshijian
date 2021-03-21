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

/*    javac在编译java文件为class文件时：

            1.会在class信息中标注一个方法需要的参数，栈深，局部变量表的数量和大小，以便在创建对象时在读取对象模型的时候就知道这个对象需要大概多少内存。
            2.如果是一个常量，会进行标量转换。
            3.代码得优化在于，字节码优化数量以及栈深和局部变量表的大小，优化占用内存的大小和执行指令的次数。
            4.相对于基本类型会比引用类型更加快速的原因，是因为引用类型最后都会转换为基本类型，而使用基本类型则不需要转换。
            5.栈深时指一个方法在执行指令是最大的深度，局部变量表与之交互，产生方法计算后的结果。
            */
}
