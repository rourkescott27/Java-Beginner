package classWork;

public class Ternary {
    public static void main ( String[] args ) {
        int x = 2, y = 5, z = 0;

        z = (y < x) ? x : y;
        System.out.println(z);

        int numGoals = 10;
        String s = (numGoals == 1 ? "goal" : "goals");
        System.out.println("I scored "+ numGoals + " " + s);
    }
}
