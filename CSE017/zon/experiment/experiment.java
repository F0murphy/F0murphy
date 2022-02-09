/**
 * experiment
 */
import java.util.*;
public class experiment {

    public static void main(String[] args) {
        ArrayList<Integer> Score = new ArrayList<Integer>();
        Score.add(1);
        Score.add(2);
        Score.remove((Integer) 1);
        System.out.println(Score.get(0));
    }
}