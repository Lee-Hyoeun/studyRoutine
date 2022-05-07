package etc;

class A {

    int a;

    int b;

}

public class test2 {

    static void func1(A m){

            m.a *= 10;

    }

    static void func2(A m){

            m.a += m.b;

    }

    public static void main(String args[]){

            A m = new A();

            m.a = 100;

            func1(m);

            m.b = m.a;

            func2(m);

            System.out.printf("%d", m.a);

    }

}