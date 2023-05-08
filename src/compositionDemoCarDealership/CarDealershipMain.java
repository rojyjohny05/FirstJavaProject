package compositionDemoCarDealership;

public class CarDealershipMain {

	public static void main(String[] args) {
		
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		
		Dealership ds = new Dealership();
		
//		ds.addCarToDelaership(hondaCivic);
		
		Car kiaSeltos = new Car("Kia", "Blue", 5, 20000);
		
//		ds.addCarToDelaership(kiaSeltos);
		
//		ds.getCarName();
		
		ds.addCarsToDealership(hondaCivic);
		ds.addCarsToDealership(kiaSeltos);
		

	}

}
