import java.util.*;
public class compararPw {
	static Scanner sc = new Scanner (System.in);
	 public static void main (String args []) {
		 System.out.println("Introduce longitud de la contraseña");
			int n = sc.nextInt();
		System.out.println("La primera contraseña es: "+password2.generarPw(n)+" "+comp1(password2.generarPw(n)));
		System.out.println("La segunda contraseña es: "+Password1.generarPassword(n)+" "+comp2(Password1.generarPassword(n)));
	 }
	 
	 public static  boolean comp1 (String contraseña){
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
		    if(minusculas >= 1 && mayusculas > 2 && numero > 5){
		    return true;
		    }
		    else{
		     return false;
		    }
	 }
	 public static  boolean comp2 (String contraseña){
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
		    if(minusculas >= 1 && mayusculas > 2 && especial >= 1){
		    return true;
		    }
		    else{
		     return false;
		    }
	 }
}
