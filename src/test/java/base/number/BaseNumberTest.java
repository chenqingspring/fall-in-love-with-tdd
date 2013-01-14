package base.number;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BaseNumberTest {
    @Test
    public void should_display_true_when_input_1() throws Exception {
        int number = 1;
        BaseNumberCalculator baseNumberCalculator = new BaseNumberCalculator();

        boolean isBaseNumber = baseNumberCalculator.calculate(number);

        assertThat(isBaseNumber,is(true));
    }
    @Test
    public void should_display_true_when_input_2() throws Exception {
        int number = 2;
        BaseNumberCalculator baseNumberCalculator = new BaseNumberCalculator();

        boolean isBaseNumber = baseNumberCalculator.calculate(number);

        assertThat(isBaseNumber,is(true));
    }
    @Test
    public void should_display_true_when_input_3() throws Exception {
        int number = 3;
        BaseNumberCalculator baseNumberCalculator = new BaseNumberCalculator();

        boolean isBaseNumber = baseNumberCalculator.calculate(number);

        assertThat(isBaseNumber,is(true));
    }
    @Test
    public void should_display_true_when_input_4() throws Exception {
        int number = 4;
        BaseNumberCalculator baseNumberCalculator = new BaseNumberCalculator();

        boolean isBaseNumber = baseNumberCalculator.calculate(number);

        assertThat(isBaseNumber,is(false));
    }
    @Test
    public void should_display_true_when_input_17() throws Exception {
        int number = 17;
        BaseNumberCalculator baseNumberCalculator = new BaseNumberCalculator();

        boolean isBaseNumber = baseNumberCalculator.calculate(number);

        assertThat(isBaseNumber,is(true));
    }

}
