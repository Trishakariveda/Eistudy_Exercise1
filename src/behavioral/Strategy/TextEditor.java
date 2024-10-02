package behavioral.Strategy;

public class TextEditor {
	private TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        return textFormatter.format(text);
    }
}
