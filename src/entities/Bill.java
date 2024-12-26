package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int sofDrink;
	
	public Bill (char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer =  beer;
		this.barbecue = barbecue;
		this.sofDrink = softDrink;
	}
	
	
	public double cover() {
		double consumption = feeding();
		if(consumption > 30) {
			
			return 0.0;			
		}
		else {						
			return 4.0;
		}
		
	}
	
	public double feeding() {
		return beer * 5 + barbecue * 7 + sofDrink * 3;
	}
	
	public double ticket() {
		if (gender == 'M') {
			return 10.0;			
		}
		else {
			return 8.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
				
	}
	
	public void printReport() {
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", feeding());
        if (cover() == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", cover());
        }
        System.out.printf("Ingresso = R$ %.2f%n", ticket());
        System.out.printf("Valor a pagar = R$ %.2f%n", total());
    }

}
