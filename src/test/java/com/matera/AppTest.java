package com.matera;

import static org.junit.Assert.assertTrue;

import lombok.Getter;
import lombok.Setter;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Setter
@Getter
public class AppTest 
{
    private String s;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        CoreMatchers.anything();
        assertTrue( true );
        AppTest t = new AppTest();
        t.setS("S");
    }
}
