import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String verbo;
		//System.out.println("Introduce verbo y tiempo verbal, ejemplo: bailar P");
		
		String[] cadena;
		String tiempoVerb = "";
		
		while(!tiempoVerb.equalsIgnoreCase("T")) {
			
			String entrada = sc.nextLine();
			cadena = entrada.split(" ");
			
			verbo = cadena[0].substring(0, cadena[0].length()-2);
			tiempoVerb = cadena[1];
			
			String acabaEn =  cadena[0].substring(cadena[0].length() -2);
			if(!tiempoVerb.equalsIgnoreCase("T")) {
				conjugar(verbo, tiempoVerb, acabaEn);
			}
			
		}

	}
	
	public static void conjugar(String verbo, String tiempoverbal, String acabaEn){
		String[] acaba = new String[6];
		String personas[] = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};
		switch (tiempoverbal) {
		
		case "A": // Presente
				switch (acabaEn) {
				case "er":
					acaba[0]= "o";
					acaba[1]= "es";
					acaba[2]= "e";
					acaba[3]= "emos";
					acaba[4]= "eis";
					acaba[5]= "en";
					break;
					
				case "ir":
					acaba[0]= "o";
					acaba[1]= "es";
					acaba[2]= "e";
					acaba[3]= "imos";
					acaba[4]= "is";
					acaba[5]= "en";
					break;

				default:
					acaba[0]= "o";
					acaba[1]= "as";
					acaba[2]= "a";
					acaba[3]= "amos";
					acaba[4]= "ais";
					acaba[5]= "an";
					break;
				}
			
		
			break;
			
		case "F": // Futuro
			switch (acabaEn) {
				case "er":
					acaba[0]= "ere";
					acaba[1]= "eras";
					acaba[2]= "era";
					acaba[3]= "eremos";
					acaba[4]= "ereis";
					acaba[5]= "eran";
					break;
					
				case "ir":
					acaba[0]= "ire";
					acaba[1]= "iras";
					acaba[2]= "ira";
					acaba[3]= "iremos";
					acaba[4]= "ireis";
					acaba[5]= "iran";
					break;
	
				default:
					acaba[0]= "are";
					acaba[1]= "aras";
					acaba[2]= "ara";
					acaba[3]= "aremos";
					acaba[4]= "areis";
					acaba[5]= "aran";
					break;
			}
			break;
			
		case "P": // Preterito Perfecto Simple
	
			switch (acabaEn) {
				case "er":
					acaba[0]= "i";
					acaba[1]= "iste";
					acaba[2]= "io";
					acaba[3]= "imos";
					acaba[4]= "isteis";
					acaba[5]= "ieron";
					break;
					
				case "ir":
					acaba[0]= "i";
					acaba[1]= "iste";
					acaba[2]= "io";
					acaba[3]= "imos";
					acaba[4]= "isteis";
					acaba[5]= "ieron";
					break;
	
				default:
					acaba[0]= "e";
					acaba[1]= "aste";
					acaba[2]= "o";
					acaba[3]= "amos";
					acaba[4]= "asteis";
					acaba[5]= "aron";
					break;
				}
			
			break;

		default:
			break;
		}
		
		for (int i = 0; i < acaba.length; i++) {
			System.out.println(personas[i] + " " + verbo +  acaba[i]);
		}
		
	}

}
