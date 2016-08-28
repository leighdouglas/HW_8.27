package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 8/28/16.
 */
public class ProblemFiveChessBoardInClass {
        public static void main(String[] args){

            System.out.println(chessBoard(8));
        }

        public static String chessBoard(int size){

            String board = "";

            for (int j = 0; j < size; j++) {

                if (j%2==0){
                    board += " ";
                } // adds a space to every other line

                for (int i = 0; i < size; i++) {
                    // adds a space or a hash horizontally to the line, prints each time the first loop runs
                    if (i % 2 == 0) {
                        board += "#";
                    } else {
                        board += " ";
                    }
                }

                board += "\n"; // creates a new line every time we run through the first loop

            }
            return board;
        }
}

