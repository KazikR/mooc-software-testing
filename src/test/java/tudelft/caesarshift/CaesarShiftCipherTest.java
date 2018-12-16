package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    void abc3() {
        CaesarShiftCipher a = new CaesarShiftCipher();
        Assertions.assertEquals("def", a.CaesarShiftCipher("abc", 3));
    }

    @Test
    void xyz3() {
        CaesarShiftCipher a = new CaesarShiftCipher();
        Assertions.assertEquals("abc", a.CaesarShiftCipher("xyz", 3));
    }

}
