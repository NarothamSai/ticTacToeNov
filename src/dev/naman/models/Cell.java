package dev.naman.models;

public class Cell {
    int x;
    int y;
    Symbol symbol; // null -> empty.

    Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.symbol = new Symbol('_');
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
