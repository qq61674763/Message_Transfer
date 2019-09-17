package com.xljt.service.transformImpl;

import com.xljt.pojo.MessageCarPojo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author : XU <br>
 * @version : 1.0 <br>
 * @description : MessageCarTransformImlTest <br>
 * @date : 2019/9/16 15:07 <br>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageCarTransformImlTest {

    String message;
    @Autowired
    private MessageCarTransformIml messageCarTransformIml;

    @Before
    public void setUp() throws Exception {
        message = "232302FE4C4137314155483433483030313434333801014C1309100B050A050006EEA07B0261C2BE01010301022E000830E00F7F271F3A01044CF40000020101045455724E20680FE6271A07000000000000000000090101001443424243424243424242424242424242424242420801010F7F271F006A00016A0E790E7F0E7D0E830E7F0E7D0E7D0E7C0E7A0E7C0E7C0E7D0E740E7D0E7C0E7C0E800E7D0E7F0E7A0E890E8B0E890E8B0E920E8F0E920E800E920E940E940E920E950E920E950E920E920E940E8F0E920E940E980E970E950EA30EA30EA40EA10EA40EA40EA10EA60E910E9D0EA70EA30E800E820E830E830E830E830E830E830E7F0E760E820E850E820E830E800E820E7F0E830E800E7F0E800E7F0E790E7F0E7D0E800E7F0E7D0E7F0E7D0E7D0E7F0E7C0E7D0E7C0E7C0E7F0E800E800E7C0E7C0E800E7D0E7D0E7A0E7C0E7C0E7F0E790E700601370EA7016A0E700101430102428000043D160B09B7";
    }

    @Test
    public void getMessageCar() {
        MessageCarPojo messageCar = messageCarTransformIml.getMessageCar(message, 82);
        System.out.println(messageCar);
    }
}