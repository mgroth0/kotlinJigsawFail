package a;

import com.google.gson.Gson;

public class A {
    public static void main(String[] args) {
        new A();
    }

    public A() {
        new Gson();
        System.out.println(this.getClass().getName());
    }
}