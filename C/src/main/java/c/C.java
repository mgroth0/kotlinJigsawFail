package c;

import a.A;
import b.B;
import com.google.gson.Gson;

public class C {
    public static void main(String[] args) {
        new C();
    }

    public C() {
        new Gson();
        new A();
        new B();
        System.out.println(this.getClass().getName());
    }
}