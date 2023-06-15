package enumerators;

public class Main {

    public static void main(String[] args) {

        AILevel[] level = new AILevel[3];
        level[0] = AILevel.EASY;
        level[1] = AILevel.MEDIUM;
        level[2] = AILevel.HARD;

        for (AILevel l : level) {
            System.out.println(l);
        }
    }
}
