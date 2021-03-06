package model.components;

// Represents a printed circuit board within a keyboard having a size
public class PrintedCircuitBoard {
    private String pcbSize;

    // EFFECTS: Constructs a printed circuit board with no pcbSize
    public PrintedCircuitBoard() {
        pcbSize = "";
    }

    // Getters
    // EFFECTS: gets the size of the printed circuit board
    public String getPcbSize() {
        return pcbSize;
    }

    // Setters
    // MODIFIES: this
    // EFFECTS: sets the size of the printed circuit board
    public void setPcbSize(String pcbSize) {
        this.pcbSize = pcbSize;
    }
}
