import java.util.*;
public class compararPw {
	static Scanner sc = new Scanner (System.in);
	 public static void main (String args []) {
		 System.out.println("Introduce longitud de la contraseņa");
			int n = sc.nextInt();
		System.out.println("La primera contraseņa es: "+password2.generarPw(n)+" "+comp1(password2.generarPw(n)));
		System.out.println("La segunda contraseņa es: "+Password1.generarPassword(n)+" "+comp2(Password1.generarPassword(n)));
	 }
	 
	 public static  boolean comp1 (String contraseņa){
			int mayusculas = 0;
			int minusculas = 0;
			int numero = 0;
			
			for(int i = 0; i<contraseņa.length(); i++) {
				if(Character.isUpperCase(contraseņa.charAt(i))){
					mayusculas++;
				}
			}
			for(int i = 0; i<contraseņa.length(); i++) {
				if(Character.isLowerCase(contraseņa.charAt(i))){
					minusculas++;
				}
			}
			
			for(int i = 0; i<contraseņa.length(); i++) {
				
				if(contraseņa.contains("1") || contraseņa.contains("2") || contraseņa.contains("3") || contraseņa.contains("4") || contraseņa.contains("5")||(contraseņa.contains("6") || contraseņa.contains("7")
						|| contraseņa.contains("8") || contraseņa.contains("9")|| contraseņa.contains("0"))){
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
	 public static  boolean comp2 (String contraseņa){
			int mayusculas = 0;
			int minusculas = 0;
			int especial = 0;
			
			for(int i = 0; i<contraseņa.length(); i++) {
				if(Character.isUpperCase(contraseņa.charAt(i))){
					mayusculas++;
				}
			}
			for(int i = 0; i<contraseņa.length(); i++) {
				if(Character.isLowerCase(contraseņa.charAt(i))){
					minusculas++;
				}
			}
			
			for(int i = 0; i<contraseņa.length(); i++) {
				if(contraseņa.contains(".") || contraseņa.contains("_") || 
						contraseņa.contains("*") || contraseņa.contains("ņ") ||
						contraseņa.contains("Ņ")){
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
