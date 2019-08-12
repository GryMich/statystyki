package statystyki;

import java.util.Scanner;

public class statystyki {

	public static Scanner odczyt;
	public static String zawodnik;
	public static int wynik = 0;
		public static void main(String[] args) 
	{
		odczyt = new Scanner(System.in);
		int wybor = 0;	

	System.out.println("Witaj w zestawieniu statystyk MJ i LJ. Wybierz jedn¹ z opcji w celu pokazania statystyk");
	
	do {
		System.out.println("1 - LBJ");
		System.out.println("2 - MJ");
		
		wybor = Integer.parseInt(odczyt.nextLine());
		
		if (wybor == 1) {
		
			
			LBJ koszykarz1;
			{koszykarz1 = new LBJ("Lebron", "James", "PPG", 20.9, "RPG", 5.5, "APG", 5.9, "Wiek", 18);
			System.out.println(koszykarz1.pokazDaneKoszykarza());}
		} 
		else if (wybor == 2) {
			MJ koszykarz2;
			{koszykarz2 = new MJ("Michael", "Jordan", "PPG", 28.2, "RPG", 6.5, "APG", 5.9, "Wiek", 23);
			System.out.println(koszykarz2.pokazDaneKoszykarza());}
		}
		
		
		System.out.println("Wybra³eœ opcjê nr: " + wybor + ".\n");
		}while (wybor >= 1 && wybor <=2);
	}
}

