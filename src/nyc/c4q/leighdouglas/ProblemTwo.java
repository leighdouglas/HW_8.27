package nyc.c4q.leighdouglas;

/**
 * returning just runs the method but it doesn't do anything with that information. system.out.println shows that information.
 */
public class ProblemTwo {
    public static void main (String[] args){
        System.out.println(calculateAge(1990, 2016));
    }

    public static String calculateAge(int birthYear, int currentYear){
        int firstAge = currentYear - birthYear;
        String Answer = "You are either " + (firstAge - 1) + " or " + firstAge + ".";
        return Answer;
    }

}

