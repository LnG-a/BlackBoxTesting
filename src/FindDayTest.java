import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDayTest {

    @Test
    void findDay1() {
        assertEquals("Thu 5",FindDay.findDay(27,10,2022));
    }

    @Test
    void findDay2() {
        assertEquals("Chu nhat",FindDay.findDay(13,2,2022));
    }

    @Test
    void findDay3() {
        assertEquals("Thu 7",FindDay.findDay(1,2,2020));
    }

    @Test
    void findDay4() {
        assertEquals("Thu 4", FindDay.findDay(22, 4, 2020));
    }
}