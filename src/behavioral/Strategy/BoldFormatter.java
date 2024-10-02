package behavioral.Strategy;

public class BoldFormatter implements TextFormatter {
	@Override
    public String format(String text) {
        return "<b>" + text + "</b>";
    }

}
