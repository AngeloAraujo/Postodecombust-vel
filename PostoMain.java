
public class PostoMain {

	public static void main(String[] args) {

		//Bomba
		Bomba b=new Bomba(100, 3.50);
		System.out.println(b.abastecerporlitro(20));
		System.out.println(b.abastecerporvalor(15));
		System.out.println(b);
		
		BombaDiesel diesel = new BombaDiesel(100, 3.70, "S10");
		System.out.println(diesel.abastecerporlitro(50));
		System.out.println(diesel.abastecerporvalor(100));
		System.out.println(diesel);
		
		BombaGasolina gasolina = new BombaGasolina(100, 5.98, "aditivada");
		System.out.println(gasolina.abastecerporlitro(50));
		System.out.println(gasolina.abastecerporvalor(110));
		System.out.println(gasolina);
		
		BombaAlcool alcool=new BombaAlcool(100, 3.47, "milho");
		System.out.println(alcool.abastecerporlitro(50));
		System.out.println(alcool.abastecerporvalor(100));
		System.out.println(alcool);
		
				
	
	}

}
