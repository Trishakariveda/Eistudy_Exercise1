package behavioral.Strategy;

public class ItalicFormatter implements TextFormatter {
	 @Override
	    public String format(String text) {
	        return "<i>" + text + "</i>";
	    }
}
