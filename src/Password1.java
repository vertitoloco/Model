import java.util.Scanner;

public class Password1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.println("Introduzca la longitud de la contrase�a");
		int n = sc.nextInt();
		String pass = null;
		
		int opcion;
		
		do {
			
		
		System.out.println("1-Generar contrase�a. \n2-Validar contrase�a");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			pass = generarPassword(n);
			System.out.println("La contrase�a generada es la siguiente: "+pass);
		break;
		case 2:
			System.out.println(pass);
			System.out.println(passwordValida(pass)); 
		}
		}while(opcion <1 || opcion>=1);	
			
		
	}
	public static boolean passwordValida(String contrase�a) {
		int comprobar = 0;
		int mayusculas = 0;
		int minusculas = 0;
		int numero = 0;
		
		for(int i = 0; i<contrase�a.length(); i++) {
			if(Character.isUpperCase(contrase�a.charAt(i))){
				mayusculas++;
			}
		}
		for(int i = 0; i<contrase�a.length(); i++) {
			if(Character.isLowerCase(contrase�a.charAt(i))){
				minusculas++;
			}
		}
		
		for(int i = 0; i<contrase�a.length(); i++) {
			
			if(contrase�a.contains("1") || contrase�a.contains("2") || contrase�a.contains("3") || contrase�a.contains("4") || contrase�a.contains("5")||(contrase�a.contains("6") || contrase�a.contains("7")
					|| contrase�a.contains("8") || contrase�a.contains("9")|| contrase�a.contains("0"))){
				numero++;
			}
		}
		
		if(mayusculas >=1) {
			comprobar++;
		}
		if(minusculas >=2) {
			comprobar++;
		}
		if (numero >= 1) {
			comprobar++;
		}
		
		if(comprobar >= 3) {
			return true;
		}else {
		return false;
		}

	
	}
	
	public static String generarPassword(int i) {
        String AlfaNumericos;
        StringBuilder builder;
        
        AlfaNumericos = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ"
                                    + "abcdefghijklmn�opqrstuvwxyz" + "0123456789"; 

        
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

           
            int myindex 
                = (int)(AlfaNumericos.length() 
                        * Math.random()); 

           
            builder.append(AlfaNumericos 
                        .charAt(myindex)); 
        } 

        return builder.toString(); 
    } 	
	
}
