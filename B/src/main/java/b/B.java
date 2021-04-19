package b;

import a.A;
import com.google.gson.Gson;

public class B {
    public static void main(String[] args) {
        new B();
    }

    public B() {
        new Gson();
        new A();
        System.out.println(this.getClass().getName());
    }
}