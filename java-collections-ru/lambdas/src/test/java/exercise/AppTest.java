package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testApp() {
        String[][] items = new String[][] {{"=", "*", " "}, {" ", "=", "*"}};
        String[][] results = App.enlargeArrayImage(items);
        String[][] expected = new String[][] {{"=", "=", "*", "*", " ", " "},
                                              {"=", "=", "*", "*", " ", " "},
                                              {" ", " ", "=", "=", "*", "*"},
                                              {" ", " ", "=", "=", "*", "*"}};
        assertThat(results).isEqualTo(expected);
    }
}
// END
