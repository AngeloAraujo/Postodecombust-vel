
public class BombaAlcool extends Bomba {

	private String fonte;
	
	public BombaAlcool(double qtd, double preco,String fonte ) {
		super(qtd, preco);
		setFonte(fonte);
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		if("cana-de-açucar".equalsIgnoreCase(fonte)||"milho".equalsIgnoreCase(fonte))
		this.fonte = fonte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaAlcool fonte=");
		builder.append(fonte);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	

}
