public class demo{
    public static void main(String[] args){
        int num=7;
        // //boxing
        // Integer num1= new Integer(num1);
        //autoboxing
        Integer num1 = num;
        int num2 = num1; //unboxing
        System.out.println(num2);





        String str = "123";
        // System.out.println(str*2);
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}