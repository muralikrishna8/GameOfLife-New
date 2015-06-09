package com.twu.gameoflife;

public class Cell {

    private boolean state;

    public Cell(boolean state) {
        this.state = state;
    }

    public char state() {
        if(state) {
            return 'A';
        }else {
            return 'D';
        }
    }
}
