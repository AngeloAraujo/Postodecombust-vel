
public class BombaGasolina extends Bomba {

	private String tipo;
	public BombaGasolina(double qtd, double preco, String tipo) {
		super(qtd, preco);
		setTipo(tipo);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if("normal".equalsIgnoreCase(tipo)||"aditivada".equalsIgnoreCase(tipo))
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina Tipo=");
		builder.append(tipo);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

	
}
