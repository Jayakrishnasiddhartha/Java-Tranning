// class demo {
//     public static void main(String[] args) {
//         double i=4.5;
//         //typecasting
//         int j=(int)i;
//         System.out.println(j);
//     }
// }
class a{
    public void show1(){
        System.out.println("Class A show method");
    }
}
class b extends a{
    public void show2(){
        System.out.println("Class B show method");
    }
}
public class demo {
    public static void main(String[] args) {
        a obj =(a) new b();//upcasting  
        obj.show1();    
        // obj.show2(); //error 
        System.out.println("**********");
        b obj2=(b)obj;//downcasting
        obj2.show2();
        obj2.show1();
    }
}   
