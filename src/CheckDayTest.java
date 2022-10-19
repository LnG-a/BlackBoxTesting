import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDayTest {

    @Test
    void checkDay1() {
        assertFalse(CheckDay.checkDay(30,13,2000));
    }

    @Test
    void checkDay2() {
        assertTrue(CheckDay.checkDay(31,1,2000));
    }

    @Test
    void checkDay3() {
        assertFalse(CheckDay.checkDay(32,1,2000));
    }

    @Test
    void checkDay4() {
        assertTrue(CheckDay.checkDay(29,2,2000));
    }

    @Test
    void checkDay5() {
        assertFalse(CheckDay.checkDay(31,2,2001));
    }

    @Test
    void checkDay6() {
        assertFalse(CheckDay.checkDay(31,4,2000));
    }

    @Test
    void checkDay7() {
        assertTrue(CheckDay.checkDay(30,6,2000));
    }

    @Test
    void checkDay8() {
        assertFalse(CheckDay.checkDay(31,2,2004));
    }

    @Test
    void checkDay9() {
        assertTrue(CheckDay.checkDay(28,2,2001));
    }
}