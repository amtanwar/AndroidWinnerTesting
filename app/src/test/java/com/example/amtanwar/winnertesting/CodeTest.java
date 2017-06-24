package com.example.amtanwar.winnertesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by AmTanwar on 24/6/17.
 */

public class CodeTest {

    Winner w = new Winner();
    @Test
    public void barcaWinning() {
        String score = w.winner("5", "4");
        assertEquals(w.winner("5","4"), score);
    }

    @Test
    public void madWinning() {
        String score = w.winner("1", "3");
        assertEquals(w.winner("1","3"), score);
    }

    @Test
    public void drawTest() {
        String score = w.winner("1", "1");
        assertEquals (w.winner("1","1"), score);
    }

}

