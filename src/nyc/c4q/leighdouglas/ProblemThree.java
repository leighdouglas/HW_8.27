package nyc.c4q.leighdouglas;

public class ProblemThree {
    public static void main(String[] args) {

        System.out.println(sameXo("xoxo"));
    }

    public static boolean sameXo(String xo){
        int numOfX = 0;
        int numOfO = 0;
        boolean sameNumOfXAndO = false;
        for (int i = 0; i < xo.length(); i++){
            switch(Character.toLowerCase(xo.charAt(i))){
                case 'x':
                    ++numOfX;
                    break;
                case 'o':
                    ++numOfO;
                    break;

                default:
            }
        }
        return numOfO == numOfX;
    }

}

