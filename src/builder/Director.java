package builder;

public class Director {
	public String createBuilder(Builder<String> b){
		b.setTitle("Tit");
		b.beginParagraph("mon paragraph ici ........ !!!!! ");
		b.endParagraph();
		return b.getStatment();
	}
}
