package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;



    public HoleContent(Key key) {
        this.content = key;
    }

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
