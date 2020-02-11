package model.Components;

// Represents the keycaps of a keyboard having a material type
public class Keycaps {
    private static String keycapsMaterial;

    // EFFECTS: Constructs keycaps with no keycapsMaterial
    public Keycaps() {
        keycapsMaterial = "";
    }

    // Getters
    // EFFECTS: returns the material of the keycaps
    public String getKeycapsMaterial() {
        return keycapsMaterial;
    }

    // Setters
    // MODIFIES: this
    // EFFECTS: sets the material of the keycaps
    public static void setKeycapsMaterial(String keycapsMaterial) {
        Keycaps.keycapsMaterial = keycapsMaterial;
    }
}
