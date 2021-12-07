package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     * creates Hole Content.
     * @param key object
     */

    public HoleContent(Key key) {
        this.content = key;
    }

    /**
     * Hole Content2.
     */
    public HoleContent() {

    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }
    public boolean isCovered() {

        return isCovered;
    }

    public Key getKey() {
        return content;
    }
}
