class A{
    String model;
    int price;
    A(){
        System.out.println("Class A constructor");
    }
    public String toString(){
        return model+" "+price;
    }
}
public class demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.model = "BMW";
        obj.price = 100000;
        System.out.println(obj);

    }
}
