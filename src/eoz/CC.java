package eoz;
import java.util.Scanner;

public class CC {

	public static void main(String[] args) {
		int var1 = 0;
		int juego = 1;
		double galletas = 0;
		double abuelas = 0;
		char hgalletas;
		char char1;
		char char2;
		double pdabuelas = 10;
		double granjas = 0;
		double pdgranjas = 60;
		Scanner input = new Scanner (System.in);
		while(juego == 1){
			var1 = var1 + 6;
			galletas = galletas + abuelas * 1;
			galletas = galletas + granjas * 5;
			while (var1 > 6){
				var1 = var1 - 1;
				System.out.println("");
			}
			System.out.println("Galletas: ["+galletas+"]                                       Precios");
			System.out.println("Abuelas:  ["+abuelas+"]/                                      /["+pdabuelas+"]");
			System.out.println("Granjas:  ["+granjas+"]/                                      /["+pdgranjas+"]");
			System.out.print("Producir galletas Y/N: ");
			hgalletas = input.next().charAt(0);
				if (hgalletas == 'y')
					galletas = galletas + 1;
					galletas = galletas;
			if (galletas>=pdabuelas){
				System.out.print("Comprar Abuela (-"+pdabuelas+" galletas)Y/N: ");
				char1 = input.next().charAt(0);

				if (char1 == 'y')
					abuelas = abuelas + 1;
					galletas = galletas - pdabuelas;
					pdabuelas = pdabuelas + abuelas * (3.5);
				if (char1 == 'n')
					abuelas = abuelas;
			}else{
				galletas = galletas;
			}
			if (galletas>=pdgranjas){
				System.out.print("Comprar Granja (-"+pdgranjas+" galletas)Y/N: ");
				char2 = input.next().charAt(0);

				if (char2 == 'y')
					granjas = granjas + 1;
					galletas = galletas - pdgranjas;
					pdgranjas = pdgranjas + granjas * (5);
				if (char2 == 'n')
					granjas = granjas;
			}else{
				galletas = galletas;
			}

		}

	}

}
