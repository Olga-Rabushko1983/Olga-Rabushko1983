package by.itstp.OlgaRabushko.Stage12.model.logic;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChessLogicTest {
    @Test
    public void checkRockTest() {
        int x1 = 4;
        int x2 = 4;
        int y1 = 4;
        int y2 = 3;
        boolean expected = true;

        boolean actual = ChessLogic.checkRock(x1, x2, y1, y2);
        assertEquals(expected,actual);
        }
    }


