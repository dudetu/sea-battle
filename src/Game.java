   import java.util.Scanner;

   public class Game {

       private int[][] field;


       private int length;

       private int width;

       private int tries;


       public Game(int[][] field, int length, int width, int tries) {


       }

       public void start() {
           Scanner scanner = new Scanner(System.in);
           int points = 0;

           for (int i = 0; i < tries; i++) {
               int first = scanner.nextInt();
               int second = scanner.nextInt();

               if (first < 10 && second < 10 && first >= 0 && second <= 0) {


                   int shot = field[first][second];

                   if (shot == 0) {
                       System.out.println(" Вы не попали");
                   } else if (shot == -1) {
                       System.out.println(" Вы уже сюда стреляли");
                   } else {
                       System.out.println(" Вы попали");
                       points++;
                       field[first][second] = -1;
                   }
               } else {

                   System.out.println("Что-то куда-то не туда");

               }

           }

           System.out.println("Вы набрали : " + points);
       }
   }