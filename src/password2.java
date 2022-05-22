
import java.util.Scanner;


public class password2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Introduce longitud de la contrase�a");
		int n = sc.nextInt();
		String contrase�a = null;
		int opcion;
		do {
		System.out.println("1.Generar Contrase�a \n2-Validar contrase�a.");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			contrase�a = generarPw(n);
			System.out.println("La contrase�a generada es la siguiente: "+contrase�a);
		break;
		
		case 2:
			System.out.println(contrase�a);
			System.out.println(validarPw(contrase�a)); 
		}
		
		}while(opcion <1 || opcion>=1);	
}
	
	
	public static String generarPw(int i) {
        String caracteres;
        StringBuilder builder;
        caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ._*��" + "abcdefghijklmn�opqrstuvwxyz._*��"; 
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) {
            int myindex 
                = (int)(caracteres.length() 
                        * Math.random());
            builder.append(caracteres.charAt(myindex)); 
            
        }return builder.toString(); 
    } 
	
	public static boolean validarPw(String contrase�a) {
		int comprobar = 0;
		int mayusculas = 0;
		int minusculas = 0;
		int especial = 0;
		
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
			if(contrase�a.contains(".") || contrase�a.contains("_") || 
					contrase�a.contains("*") || contrase�a.contains("�") ||
					contrase�a.contains("�")){
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
