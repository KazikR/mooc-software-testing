package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void xxggxx() {
        GHappy h = new GHappy();
        Assertions.assertEquals(true, h.gHappy("xxggxx"));
    }

    @Test
    public void xxgxx() {
        GHappy h = new GHappy();
        Assertions.assertEquals(false, h.gHappy("xxgxx"));
    }

    @Test
    public void xxggyygxx() {
        GHappy h = new GHappy();
        Assertions.assertEquals(false, h.gHappy("xxggyygxx"));
    }

    @Test
    public void TwoGsAtAlmostBegginingAndManyOtherChars() {
        GHappy h = new GHappy();
        Assertions.assertEquals(true, h.gHappy("xxggyyzxx"));
    }

    @Test
    public void shortestHappyG() {
        GHappy h = new GHappy();
        Assertions.assertEquals(true, h.gHappy("gg"));
    }

    @Test
    public void shortestUnhappyG() {
        GHappy h = new GHappy();
        Assertions.assertEquals(false, h.gHappy("g"));
    }

    @Test
    public void noGshortest() {
        GHappy h = new GHappy();
        Assertions.assertEquals(false, h.gHappy("x"));
    }

    @Test
    public void noGsAnd10RandomChars() {
        GHappy h = new GHappy();
        Assertions.assertEquals(false, h.gHappy("aqwertyuio"));
    }

    @Test
    public void First2CharsAreGs() {
        GHappy h = new GHappy();
        Assertions.assertEquals(true, h.gHappy("ggei"));
    }
}
