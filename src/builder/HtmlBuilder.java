package builder;

public class HtmlBuilder implements Builder<String> {

	private String statment="";

	@Override
	public void setTitle(String s) {
		statment += "<H1>" + s + "</H1>";
	}

	@Override
	public void beginParagraph(String s) {
		statment += "<br> <p>"+s;
	}

	@Override
	public void beginParagraph() {
		statment += "<br> <p>";
	}

	@Override
	public void endParagraph() {
		statment += "</p>";
	}

	@Override
	public String getStatment() {
		return statment;
	}

}
