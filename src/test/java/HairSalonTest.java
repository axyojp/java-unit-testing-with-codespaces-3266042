import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = new String[] { "Monday", "Tuesday" };

        String[] actual = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        boolean expected = true;
        boolean actual = hairSalon.isOpen("Monday");

        assertEquals(expected, actual);
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        boolean expected = false;
        boolean actual = hairSalon.isOpen("Wednesday");

        assertEquals(expected, actual);
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("hoge"));

        String expected = "only weekdays are valid";
        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

}