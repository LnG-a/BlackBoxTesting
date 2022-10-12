import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDiceTest {
    //Boundary Value Analysis (BVA)
    @Test
    void BVA1() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(3,7);});
    }

    @Test
    void BVA2() {
        assertFalse(CheckDice.check(3,6));
    }

    @Test
    void BVA3() {
        assertFalse(CheckDice.check(3,5));
    }

    @Test
    void BVA4() {
        assertTrue(CheckDice.check(3,3));
    }

    @Test
    void BVA5() {
        assertFalse(CheckDice.check(3,2));
    }

    @Test
    void BVA6() {
        assertFalse(CheckDice.check(3,1));
    }

    @Test
    void BVA7() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(3,0);});
    }

    @Test
    void BVA8() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(7,3);});
    }

    @Test
    void BVA9() {
        assertFalse(CheckDice.check(6,3));
    }

    @Test
    void BVA10() {
        assertFalse(CheckDice.check(5,3));
    }

    @Test
    void BVA11() {
        assertFalse(CheckDice.check(2,3));
    }

    @Test
    void BVA12() {
        assertFalse(CheckDice.check(1,3));
    }

    @Test
    void BVA13() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(0,3);});
    }

    //Equivalence Partitioning Testing (EPT)
    @Test
    void EPT1() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(0,0);});
    }

    @Test
    void EPT2() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(0,7);});
    }

    @Test
    void EPT3() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(0,5);});
    }

    @Test
    void EPT4() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(5,0);});
    }

    @Test
    void EPT5() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(5,7);});
    }

    @Test
    void EPT6() {
        assertTrue(CheckDice.check(5,5));
    }

    @Test
    void EPT7() {
        assertFalse(CheckDice.check(5,4));
    }

    @Test
    void EPT8() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(7,0);});
    }

    @Test
    void EPT9() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(7,7);});
    }

    @Test
    void EPT10() {
        assertThrows(IllegalArgumentException.class,()->{CheckDice.check(7,5);});
    }
}