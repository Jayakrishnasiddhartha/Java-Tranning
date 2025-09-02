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
        // final A obj = new A();
        // obj.show();
        // obj = new B();
        // obj.show();
        A obj1 = new A();
        obj1.show();
        A obj2 = new B();
        obj2.show();
        A obj3 = new C();
        obj3.show();
        
    }
}
