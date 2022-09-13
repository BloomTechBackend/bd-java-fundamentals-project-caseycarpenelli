package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class Hole {
    HoleContent hCont = new HoleContent();
    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */

    public Hole(Key content) {

    }



    public boolean isCovered() {
        //TODO This value should come from HoleContent
        return hCont.isCovered();
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update HoleContent's isCovered property.
        if (hCont.isCovered()) {
            hCont.setIsCovered(false);
        }
    }

    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     * @return the key if the hold is uncovered.
     */
    private Key getKeyIfPossible() {
        //TODO Get the HoleContent's content only if the hole is uncovered.
        if (hCont.isCovered()) {
            return hCont.getKey();
        }
        return null;
    }

    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {

        if (!hCont.isCovered()) {
            return getKeyIfPossible();
        }
        return null;

    }
}
