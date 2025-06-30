package metodos_string;

public class StringMetodos {

	public static void main(String[] args) {
		
		String original = " Hoje é sabado, e está CHOVENDO."
				+ "Hoje é dia de estudar.     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(6);
		String s05 = original.substring(6, 14);
		int tamanhoString = original.trim().length();
		String s06 = original.replace('H','i');
		String s07 = original.replace("es","A");

		
		
		System.out.println("Original: " + "-"+ original + "-");
		System.out.println("toLowerCase(): " + "-"+ s01 + "-");
		System.out.println("toUpperCase(): " + "-"+ s02 + "-");
		System.out.println("trim(): " + "-"+ s03 + "-");
		System.out.println("substring(6): " + "-"+ s04 + "-");
		System.out.println("substring(6, 14): " + "-"+ s05 + "-");
		System.out.println("length(): " + "-"+ tamanhoString + "-");
		System.out.println("replace('h','i'): " + "-"+ s06 + "-");
		System.out.println("replace(\"es\",\"A\"): " + "-"+ s07 + "-");
		
			

//		0 1 2 3 4
//		T A D E U - TADEU
	}

}
