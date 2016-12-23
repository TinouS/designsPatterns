package builder;

public class StringBuilder implements Builder<String>{
	
	private String statment="";

	@Override
	public void setTitle(String s) {
		statment +="Title: "+s;	
	}
	
	@Override
	public void beginParagraph(String s) {
		statment+=" \n begin paragraph : \n "+s;
	}

	@Override
	public void beginParagraph() {
		statment+="\n";
	}

	@Override
	public void endParagraph() {
		statment+="\n";
	}

	@Override
	public String getStatment() {
		return statment;
	}

}
