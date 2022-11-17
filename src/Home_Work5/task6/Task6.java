package Home_Work5.task6;

    public class Task6 {

    }
    class A{
        int a;

        A(int x){
            a = x;
            System.out.println("Constructor of class A with variable a = " +a);
        }
    }

    class B extends A{
        int b;

        B(int x, int y){
            super (x);
            b = y;
            System.out.println("Constructor of class B (the successor of class A) with variable b = " +b);
        }
    }

    class C extends B{
        int c;

        C(int x, int y, int z){
            super (x, y);
            c = z;
            System.out.println("Constructor of class C (successor of class B) with variable c = " +c);
        }
}
