
import java.util.Scanner;


public class password2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Introduce longitud de la contraseña");
		int n = sc.nextInt();
		String contraseña = null;
		int opcion;
		do {
		System.out.println("1.Generar Contraseña \n2-Validar contraseña.");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			contraseña = generarPw(n);
			System.out.println("La contraseña generada es la siguiente: "+contraseña);
		break;
		
		case 2:
			System.out.println(contraseña);
			System.out.println(validarPw(contraseña)); 
		}
		
		}while(opcion <1 || opcion>=1);	
}
	
	
	public static String generarPw(int i) {
        String caracteres;
        StringBuilder builder;
        caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ._*ñÑ" + "abcdefghijklmnñopqrstuvwxyz._*ñÑ"; 
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) {
            int myindex 
                = (int)(caracteres.length() 
                        * Math.random());
            builder.append(caracteres.charAt(myindex)); 
            
        }return builder.toString(); 
    } 
	
	public static boolean validarPw(String contraseña) {
		int comprobar = 0;
		int mayusculas = 0;
		int minusculas = 0;
		int especial = 0;
		
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
			if(contraseña.contains(".") || contraseña.contains("_") || 
					contraseña.contains("*") || contraseña.contains("ñ") ||
					contraseña.contains("Ñ")){
				especial++;
			}
		}
		
		if(mayusculas >=1) {
			comprobar++;
		}
			if(minusculas >=2) {
				comprobar++;
		}
				if (especial >= 1) {
					comprobar++;
		}
		
					if(comprobar >= 3) {
						return true;
		}else {
			
		return false;
		}
	}
}
