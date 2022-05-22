import java.util.Scanner;

public class Password1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.println("Introduzca la longitud de la contraseña");
		int n = sc.nextInt();
		String pass = null;
		
		int opcion;
		
		do {
			
		
		System.out.println("1-Generar contraseña. \n2-Validar contraseña");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			pass = generarPassword(n);
			System.out.println("La contraseña generada es la siguiente: "+pass);
		break;
		case 2:
			System.out.println(pass);
			System.out.println(passwordValida(pass)); 
		}
		}while(opcion <1 || opcion>=1);	
			
		
	}
	public static boolean passwordValida(String contraseña) {
		int comprobar = 0;
		int mayusculas = 0;
		int minusculas = 0;
		int numero = 0;
		
		for(int i = 0; i<contraseña.length(); i++) {
			if(Character.isUpperCase(contraseña.charAt(i))){
				mayusculas++;
			}
		}
		for(int i = 0; i<contraseña.length(); i++) {
			if(Character.isLowerCase(contraseña.charAt(i))){
				minusculas++;
			}
		}
		
		for(int i = 0; i<contraseña.length(); i++) {
			
			if(contraseña.contains("1") || contraseña.contains("2") || contraseña.contains("3") || contraseña.contains("4") || contraseña.contains("5")||(contraseña.contains("6") || contraseña.contains("7")
					|| contraseña.contains("8") || contraseña.contains("9")|| contraseña.contains("0"))){
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
        
        AlfaNumericos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
                                    + "abcdefghijklmnñopqrstuvwxyz" + "0123456789"; 

        
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
