/**
 * A ChildPass extends the Pass class as part of the mock demo.
 *
 * @author Jack
 * @version 29/12/2022
 */
public class ChildPass extends Pass {
    private String adult;

    /**
     * Constructs a ChildPass object.
     *
     * @param passId    The pass id.
     * @param name      The person's name.
     * @param luxury    The pass' luxury rating.
     * @param adultName The adult responsible for this child.
     */
    public ChildPass(int passId, String name, int luxury, String adultName) {
        super(passId, name, luxury, 0);
        adult = adultName;
    }

    /**
     * Uses the ferry if possible.
     */
    public void useFerry() {
        if (getCredits() >= 3) {
            removeCredits(0);
        }
    }
}
