package com.test.countoff;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountOffTest {
    @Test
    public void should_display_1_when_input_1_and_1() throws Exception {
        int countNum = 1;
        int totalNum = 1;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "1";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_11_when_input_1_and_2() throws Exception {
        int countNum = 1;
        int totalNum = 2;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "11";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_123_when_input_3_and_3() throws Exception {
        int countNum = 3;
        int totalNum = 3;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "123";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_123123_when_input_3_and_6() throws Exception {
        int countNum = 3;
        int totalNum = 6;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "123123";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_as_expect_when_input_3_and_18() throws Exception {
        int countNum = 3;
        int totalNum = 18;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "123123123123123123";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_as_expect_when_input_3_and_19() throws Exception {
        int countNum = 3;
        int totalNum = 19;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "1231231231231231231";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_as_expect_when_input_3_and_20() throws Exception {
        int countNum = 3;
        int totalNum = 20;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "12312312312312312312";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }
    @Test
    public void should_display_as_expect_when_input_4_and_15() throws Exception {
        int countNum = 4;
        int totalNum = 15;
        CountOff countOff = new CountOff(countNum, totalNum);
        String expect = "123412341234123";
        String actual = countOff.count();
        assertThat(actual,is(expect));
    }

}
