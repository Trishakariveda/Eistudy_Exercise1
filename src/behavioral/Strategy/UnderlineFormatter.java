package behavioral.Strategy;

public class UnderlineFormatter implements  TextFormatter{
	@Override
    public String format(String text) {
        return "<u>" + text + "</u>";
    }
}
