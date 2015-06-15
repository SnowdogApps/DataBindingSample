package pl.snowdog.databindingsample.event;

/**
 * Created by bartek on 15.06.15.
 */
public class ItemClickEvent {
    private int position;

    public ItemClickEvent(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
