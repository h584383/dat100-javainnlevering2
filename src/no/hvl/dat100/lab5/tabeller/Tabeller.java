package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	public static void main(String[] args) {
		
		
		
		int[] tab1 = {1,2,3};
		int[] tab2 = {4,5,6};
		
		//skrivUt(tab);
		
		System.out.println(tilStreng(tab1));
		
		//summer(tab);
		
		//finnesTall(tab,0);
		
		//System.out.println(finnesTall(tab,0));
		
		//System.out.println(posisjonTall(tab,4));
		
		//reverser(tab);
		
		//System.out.println(erSortert(tab));
		
		//skrivUt(settSammen(tab1,tab2));
		
		
		
		
		
		
		
	}

	// a)
	public static void skrivUt(int[] tabell) {
		
		
		System.out.print("[ ");

		for (int i = 0; i < tabell.length; i++) {
			
			System.out.print(tabell[i] + " ");
			
		}
		
		System.out.print(" ]");
		
		
		
		

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String stræng = ("[");
		
		for (int i = 0; i < tabell.length; i++) {
			
			
			if (i != tabell.length-1) {
				
				//System.out.print(tabell[i] + ",");
				
				stræng += (tabell[i] + ",");
				

			} else {
				//System.out.print(tabell[i]);
				
				stræng += (tabell[i]);
			}
			
			
			
		}
		
		stræng += ("]");
		
		return stræng;
	}

	// c)
	public static int summer(int[] tabell) {
		
		//Vanlig for-løkke

		int sumFor = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			
			sumFor += tabell[i];
		}
		
		System.out.println(sumFor);
		
		//While løkke
		
		int sumWhile = 0;
		
		int index = 0;
		
		while(index < tabell.length) {
			
			
			sumWhile += tabell[index];
			index++;
		}
		
		System.out.println(sumWhile);
		
		//For each løkke
		
		int sumEach = 0;
		
		for (int e : tabell) {
			
			sumEach += e;
			
		}
		
		System.out.println(sumEach);
		
		//return statement
		
		return sumFor;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell[i] == tall) {
				
				return true;
				
			} 
			
			
		}
		
		return false;
		
		
		
		
		
		

		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// som returnerer det første index (posisjon) i tabell som inneholder tallet tall og -1 ellers.
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell[i] == tall) {
				
				return i;
				
			} 
			
		}
		return -1;
		
		
		
		

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// som gitt en tabell av heltall returnerer en ny tabell som har de samme elementene som tabell men i modsatt rekkefølge.
		
		
		int nyTabell[] = new int[tabell.length];
		
	
		for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j--) {
			
			//System.out.println(i);
			
			nyTabell[i] = tabell[j];
			
		}
		
		skrivUt(nyTabell);
		
		
		return nyTabell;
		
	
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// som kan avgjere om ein array (tabell) av heiltal er sortert stigande (dvs. at alle tal skal vere større enn det forrige)
		
		//må ta tabell.length-1, ellers får vi en siste indeks som ikke eksisterer (f. eks {1,2,3}, length er 3 men har bare indeks 0-2
		
		for (int i = 0; i < tabell.length-1; i++) {
			
			
			//Vi sjekker om det tidligere elementet er større enn det neste, hvis den er det, så er tabellen IKKE sortert, dermed FALSE
			
			if (tabell[i]>tabell[i+1]) {
				
				return false;
				
			}
			
			
			
		}
		
		return true;
		
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// som gitt to tabeller tabell1 og tabell2 som paramtere returnerer en ny tabell som er sammensetning av de to tabeller.
		
		
		int komboTabell[] = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			
			komboTabell[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			
			komboTabell[tabell1.length+i] = tabell2[i];
			
		}
		return komboTabell;
		
		
		
		
	}
}
