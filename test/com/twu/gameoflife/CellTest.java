package com.twu.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {
    @Test
    public void specToCheckTheStateOfCell(){
        Cell cell = new Cell();

        boolean actualState = cell.state();

        assertFalse(actualState);
    }
}