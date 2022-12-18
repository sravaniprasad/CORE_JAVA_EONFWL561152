package com.ExampleCoverage.ControllerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ExampleCoverage.Controller.Message;

public class TestMessages {

	@Test
    public void testNameDailyCodeBuffer()
    {
        Message obj = new Message();
        Assertions.assertEquals("Hello Daily Code Buffer!", obj.getMessage("Daily Code Buffer"));
    }

    @Test
    public void testNameBlank()
    {
        Message obj = new Message();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    public void testNameNull()
    {
        Message obj = new Message();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }
	
}
