package com.xljt.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageFormatTest <br>
 * @date : 2019/9/12 15:47 <br>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageFormatTest {

    @Test
    public void numberTransformString() {
        String s = "57656c636f6d6520746f203569787565786977616e672e636f6d21";
        Assert.assertEquals("Welcome to 5ixuexiwang.com!",MessageFormat.numberToString(s));
    }

    @Test
    public void stringTransformNumber() {
        String s = "Welcome to 5ixuexiwang.com!";
        Assert.assertEquals("57656c636f6d6520746f203569787565786977616e672e636f6d21",MessageFormat.stringToNumber(s).toLowerCase());
    }

    @Test
    public void numberTransformInt() {
        String number = "e";
        Assert.assertEquals("14",MessageFormat.numberToInt(number));
    }

    @Test
    public void intTransformNumber() {
        int number = 14;
        Assert.assertEquals("e",MessageFormat.intToNumber(number));
    }

}