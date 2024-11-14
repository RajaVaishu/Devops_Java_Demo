package com.helloworld;

import javax.servlet.http.HttpSession;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.GuessGame;

public class GuessGameTest {

    @Test
    public void testCompareGuessTooLow() {
        String result= "Successful";
         assertEquals("Successful1", result);
    }

    
}
