import  java.util.Arrays;

public class FieldPinter {

    private int length;


    public FieldPinter(int length){
        this.length = length;
    }

    public void printField(int[][] field){
        for (int i = 0 ; i < length ; i++){
            System.out.println(Arrays.toString(field[i]));
        }

    }
}
