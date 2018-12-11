package tudelft.gettingstarted;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Choc {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBoxes = goal / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        goal -= (bigBoxesWeCanUse * 5);
//        replaced "<=" with "<" :
        if (small < goal)
            return -1;
        return goal;
    }

    @Test
    public void t1() {
        Assertions.assertEquals(4, makeChocolate(4, 1, 9));
    }

    @Test
    public void t2() {
        Assertions.assertEquals(-1, makeChocolate(4, 1, 10));
    }

    @Test
    public void t3() {
        Assertions.assertEquals(2, makeChocolate(4, 1, 7));
    }
}
