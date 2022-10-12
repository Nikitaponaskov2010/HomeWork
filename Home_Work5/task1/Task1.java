package Home_Work5.task1;

     enum Day{
         Monday, Tuesday, Wednesday, Thursday,Friday, Saturday, Sunday
     }
     public class Task1 {
         public static void main(String[] args) {
             Day day;
             System.out.println("День недели: ");
             Day arr [] = Day.values();
             for(Day one: arr)
                 System.out.println(one);
             System.out.println();
             day = Day.valueOf("Friday");
             System.out.println("day is " + day);
             int x = Integer.parseInt("6");
             double y = Double.parseDouble("6");
             int z = Integer.parseInt("222", 16);
             System.out.println(x);
             System.out.println(y);
             System.out.println(z);
         }
}
