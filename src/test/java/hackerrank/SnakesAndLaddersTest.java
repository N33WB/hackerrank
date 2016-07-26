package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class SnakesAndLaddersTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/snakes-and-ladders/test1.txt"));
        SnakesAndLadders.main(new String[]{});
    }

    @Test
    public void test2() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/snakes-and-ladders/test2.txt"));
        SnakesAndLadders.main(new String[]{});
    }

    @Test
    public void test3() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/snakes-and-ladders/test3.txt"));
        SnakesAndLadders.main(new String[]{});
    }
}