package Home_Work5.task3;

import java.util.Arrays;

    public class Task3 {
        public static void main(String[] args) {
            Task3 start = new Task3();
            start.arr();
        }
        public void arr(){
            int [] [] oneArray = new int [3] [];
            oneArray[0] = new int[] {1,2,3,4,5};
            oneArray[1] = new int [] {2,3,4,5,6};
            oneArray[2] = new int [] {3,4,5,6,7};
            System.out.println(Arrays.deepToString(oneArray));
            System.out.println();

            int [] [] [] twoArray = new int [5][5][5];
            twoArray[0] = oneArray;
            System.out.println(Arrays.deepToString(twoArray));

        }
}
