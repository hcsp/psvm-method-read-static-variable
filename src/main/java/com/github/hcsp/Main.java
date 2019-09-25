package com.github.hcsp;

public class Main {
    // Create a static member "message" here to store the string "Hello"
    // 在这里创建一个名为"message"的静态成员变量，并存储字符串"Hello"
    // static+成员变量声明，最好在定义的时候就赋好初始值!!!
    // static变量是共享的，类内引用不加限定，类外引用加限定
    static String message = "Hello";

    public static void main(String[] args) {
        // 不要先定义，再赋值，如果赋值的话，只能在方法内进行，不能在类中进行!!!
        // message = "Hello";
        System.out.println(message);
    }

}
