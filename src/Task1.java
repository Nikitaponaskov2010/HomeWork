

public class Task1 {
    public static void main(String[] args) {
      Scaner  sc = new Scanner(System.in);
        System.out.println("введите номер дня недели");
        int number = sc.nextInt();
         switch(number){
            case (1) : {
                System.out.println("понедельник");
                break;
            }
            case (2) : {
                System.out.println("вторник");
                break;
            }
             case (3) : {
                 System.out.println("среда");
                 break;
             }
             case (4) : {
                 System.out.println("четверг");
                 break;
             }
                 case (5) :{
                 System.out.println("пятница");
                 break;
             }
             case (6) : {
                 System.out.println("суббота");
                 break;
             }
             case (7) : {
                 System.out.println("воскресенье");
                 break;
             }
         }

    }

}
