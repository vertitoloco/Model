import java.util.*;
public class compararPw {
	static Scanner sc = new Scanner (System.in);
	 public static void main (String args []) {
		 System.out.println("Introduce longitud de la contrase�a");
			int n = sc.nextInt();
		System.out.println("La primera contrase�a es: "+password2.generarPw(n)+" "+comp1(password2.generarPw(n)));
		System.out.println("La segunda contrase�a es: "+Password1.generarPassword(n)+" "+comp2(Password1.generarPassword(n)));
	 }
	 
	 public static  boolean comp1 (String contrase�a){
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
		    if(minusculas >= 1 && mayusculas > 2 && numero > 5){
		    return true;
		    }
		    else{
		     return false;
		    }
	 }
	 public static  boolean comp2 (String contrase�a){
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
		    if(minusculas >= 1 && mayusculas > 2 && especial >= 1){
		    return true;
		    }
		    else{
		     return false;
		    }
	 }
}
