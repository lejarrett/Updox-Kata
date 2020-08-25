import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersAppTest {

    @Test
    void main() {
    }

    @Test
    void run() {
    }

    @Test
    void parseArgsToNumsTest() {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);

        String[] testArgs = new String[]{"1","10"};
        Assertions.assertArrayEquals(new Integer[]{1,10},app.parseArgsToNums(testArgs));
    }

    @Test
    void parseArgsToNumsInvalidArgs() {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);

        String[] argsWithWord = new String[]{"dog","10"};
        Assertions.assertNull(app.parseArgsToNums(argsWithWord));

        String[] argsWithNull = new String[]{null,"10"};
        Assertions.assertNull(app.parseArgsToNums(argsWithNull));

        String[] argsWithDoubleNull = new String[]{null,null};
        Assertions.assertNull(app.parseArgsToNums(argsWithDoubleNull));

        String[] argsWithBlankAndEmpty = new String[]{" ",""};
        Assertions.assertNull(app.parseArgsToNums(argsWithBlankAndEmpty));

    }
}