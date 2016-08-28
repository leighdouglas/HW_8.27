package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 8/28/16.
 */
public class ProblemFiveChessboard {
    public static void main(String[] args){
        System.out.println(chessboard(8));
    }
//sooo my solution was super complicated but I'm submitting it anyways

    public static String chessboard(int size){

     StringBuilder startsWithSpace = new StringBuilder();
     StringBuilder startsWithPound = new StringBuilder();
     String board = null;
        for(int i = 1; i<=(size/2); i++){
            startsWithPound.append("# ");
        }

        for (int i = 1; i<=(size/2); i++){
            startsWithSpace.append(" #");
        }

        if (size%2 == 1){
            startsWithPound = startsWithPound.append("#");
            startsWithSpace = startsWithSpace.append(" ");
        }

        for (int i = 1; i<=(size); i++){
             if (i==1){
                 board = startsWithSpace.toString();
             } else if (i%2 ==0){
                board = board + "\n" + startsWithPound.toString();
             } else if(i%2==1){
                board = board + "\n" +startsWithSpace.toString();
             }
        }
        return board;
    }
}


