package Home_Work5.task5;

    class One{
    int x;
    String str;
    void printOne(){
        System.out.println("int - " + x + " " + "string - " + str);
    }
}
class Two {
    int a;
    int b;

    Two(){
        a = 1;
        b = 1;
        System.out.println("a = "+ a + " "+ "b = "+b);
    }
    Two(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("a = " + a + " " + "b = " + b);
    }
}
class Name{
    String olya;
    Name(){
        olya = "not Olya";
    }
    Name(int x){
        olya = "says";
    }
    Name(double y){
        olya = "sing";
    }
    Name(int x, double y){
        olya = "says";
    }
    Name(double y, int x){
        olya = "sing";
    }
    void result(){
        System.out.println("Name" + olya);
    }
}
class Tree{
    void meth1(){
        System.out.println("Method one");
    }
    void meth2(){
        System.out.println("Method two");
        meth1();
        this.meth2();
    }
}
class Four{
    int a;
    int b;
    Four(int v, int w){
        a = v;
        b = w;
        System.out.println("Multiplication = " + (a*b));
    }
    Four(int c){
        this(c,c);
    }
}
public class Task5 {


}
