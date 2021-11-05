
public class BombaDiesel extends Bomba {

	private String tipo;
	
	public BombaDiesel(double qtd, double preco, String tipo) {
		super(qtd, preco);
		setTipo(tipo);
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if("S10".equalsIgnoreCase(tipo)||"S50".equalsIgnoreCase(tipo)||"S500".equalsIgnoreCase(tipo)||"S1800".equalsIgnoreCase(tipo))
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDiesel Tipo=");
		builder.append(tipo);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	

}
