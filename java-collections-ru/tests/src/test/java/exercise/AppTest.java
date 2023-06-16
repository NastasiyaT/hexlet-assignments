package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(9);
        items.add(16);
        items.add(32);
        items.add(46);

        int size = 3;

        List<Integer> results = App.take(items, size);

        assertThat(results)
                .isNotEmpty()
                .hasSize(3)
                .contains(5, 16);
        // END
    }
}
