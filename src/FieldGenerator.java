
import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;

    private int shipsPerile;

    public FieldGenerator(int length, int width, int shipsPerile) {
        this.length = length;
        this.width = width;
        this.shipsPerile = shipsPerile;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShips = 0;
        while (countOfShips < shipsPerile) {
            int a = random.nextInt(0, length - 1);
            int b = random.nextInt(0, width - 1);
            boolean horizontal = random.nextBoolean();

               if (horizontal) {
                if (checkCollisionHorizontal(field, a, b)) {
                    field[a][b] = 2;
                    field[a][b + 1] = 2;
                    countOfShips++;
                }
            }

        else {
                   if (checkCollisionVertical(field, a, b)) {
                       field[a][b] = 2;
                       field[a + 1][b] = 2;
                       countOfShips++;
                   }
               }
        }
                return field;

            }

        private boolean checkCollisionHorizontal ( int[][] field, int a, int b){
            return field[a][b] == 0 && field[a][b + 1] == 0;

        }
        private boolean checkCollisionVertical ( int[][] field, int a, int b){
            return field[a][b] == 0 && field[a + 1][b] == 0;
            }

    }







