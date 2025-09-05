class A {
    public void show() {
        System.out.println("in A line");
    }
}
class B extends A {
    public void show() {
        System.out.println("in B line");
    }
}
class C extends B{
    public void show() {
        System.out.println("in C line");
    }
}
public class demo {
    public static void main(String[] args){
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
