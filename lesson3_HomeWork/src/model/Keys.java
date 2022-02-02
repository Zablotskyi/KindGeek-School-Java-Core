package model;

public class Keys {
    private boolean keys = false;

    public boolean isKeys() {
        return keys;
    }

    private void assignKeys() {
        if (keys) {
            keys = true;
        }
    }
}
