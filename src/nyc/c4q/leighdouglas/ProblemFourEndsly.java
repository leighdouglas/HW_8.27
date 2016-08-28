package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 8/28/16.
 */
public class ProblemFourEndsly {

    public static void main(String[] args){

        System.out.println(endsly("endsly"));
    }

    public static boolean endsly(String input){
        return input.endsWith("ly");
    }

// personal comment: you can just return the boolean itself instead of creating an if statement, default is false.

// Below is my original code, I didn't realize question was that simple :)

// boolean endsInLy;

// if(input.charAt(input.length() - 2) == 'l' && input.charAt(input.length() - 1) == 'y'){
//   endsInLy = true;
// } else {
//   endsInLy = false;
// }
// return endsInLy;

    }

