
public class Bomba {

	private double qtd;
	private double preco;
	private double litrosvendidos;
	
	public Bomba(double qtd, double preco) {
		setQtd(qtd);
		setPreco(preco);
	}		

	
	public double getQtd() {
		return qtd;
	}
	public void setQtd(double qtd) {
		if(qtd>=0)
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(qtd>=0)
		this.preco = preco;
	}
	public double getLitrosvendidos() {
		return litrosvendidos;
	}
	public void setLitrosvendidos(double litrosvendidos) {
		this.litrosvendidos = litrosvendidos;
	}

	private double valorparalitros(double valor) {
		return (valor/preco);
	}
	
	public boolean abastecerporlitro(double litros){
		if(litros <= getQtd()) {
			setQtd(getQtd()-litros);
			setLitrosvendidos(getLitrosvendidos()+litros);
			return true;
		}else 
			
		return false;
	}
		
	public boolean abastecerporvalor(double valor){
		double valorLitros=valorparalitros(valor);
			return abastecerporlitro(valorLitros);
		}
	
	
	public double faturamento() {
		return (getLitrosvendidos()*getPreco());
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba: Quantidade de combustível =");
		builder.append(qtd);
		builder.append(", preço=");
		builder.append(preco);
		builder.append(", litrosvendidos =");
		builder.append(litrosvendidos);
		builder.append(", faturamento da bomba=");
		builder.append(faturamento());
		return builder.toString();
	}


	








	
	
}
