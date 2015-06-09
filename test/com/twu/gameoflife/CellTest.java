package com.twu.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {
    @Test
    public void specToCheckTheStateOfCellWhenDead(){
        Cell cell = new Cell(false);

        char actualState = cell.state();

        assertEquals(actualState, 'D');
    }

    @Test
    public void specToCheckTheStateOfCellWhenAlive(){
        Cell cell = new Cell(true);

        char actualState = cell.state();

        assertEquals(actualState, 'A');
    }
}