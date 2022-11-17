package Home_Work6.Pr8_3;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        Task3.Three SportSpaceShip = task3.new Three();
        SportSpaceShip.start();
        SportSpaceShip.up();
        SportSpaceShip.down();
        SportSpaceShip.right();
        SportSpaceShip.left();
        SportSpaceShip.stop();
        System.out.println();



        Task3.Three WarSpaceShip = task3.new Three();
        WarSpaceShip.start();
        WarSpaceShip.stop();
        System.out.println();

        Task3.Three AvtozakSpaceShip = task3.new Three();
        AvtozakSpaceShip.up();
        AvtozakSpaceShip.down();
        AvtozakSpaceShip.right();
        AvtozakSpaceShip.left();
    }

    class Engine{
        void start(){
            System.out.println("Start");
        }
        void stop(){
            System.out.println("Stop");
        }
    }

    class ControlPanel{

        void up(){
            System.out.println("Up");
        }
        void down(){
            System.out.println("Down");
        }
        void right(){
            System.out.println("Right");
        }
        void left(){
            System.out.println("Left");
        }
    }
    class Three{
        Engine a = new Engine();
        ControlPanel b = new ControlPanel();
        void start(){
            a.start();
        }
        void stop(){
            a.stop();
        }
        void up(){
            b.up();
        }
        void down(){
            b.down();
        }
        void right(){
            b.right();
        }
        void left(){
            b.left();
        }
    }

    }

