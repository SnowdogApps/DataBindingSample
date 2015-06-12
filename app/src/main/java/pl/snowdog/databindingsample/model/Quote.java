package pl.snowdog.databindingsample.model;

/**
 * Created by bartek on 12.06.15.
 */
public class Quote {
    private String text;
    private String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
