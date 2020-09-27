package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		
		int[][] mat1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] mat2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//skrivUt(mat);
		//System.out.println(tilStreng(mat1));
		
		//skaler(2,mat);
		
		//System.out.println(erLik(mat1,mat2));
		
		//skrivUt(speile(mat1));
		
		multipliser(mat1,mat2);
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		
		for (int[] rad : matrise) {
			
			
			
			for (int pos : rad) {
				
				System.out.print(pos + " ");
				
			}
			
			
			System.out.println();
			
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String utskrift = "";
		
			for (int[] rad : matrise) {
			
			
			
			for (int pos : rad) {
				
				utskrift += pos + " ";
				
			}
			
			
			utskrift += "\n";
			
		}
		
		
		
		return utskrift;
		
	}

	// c)
	public static int[][] skaler(int number, int[][] matrise) {
		
		int nyMatrise[][] = new int[matrise.length][matrise[0].length];
		
			
		for (int i = 0; i < nyMatrise.length; i++) {
			
			
			for (int j = 0; j < nyMatrise[i].length; j++) {
				
				
				nyMatrise[i][j] = matrise[i][j] * number;
				
				
			}
			
		}
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if( a.length != b.length || a[0].length != b[0].length) {
			
			return false;
			
		} else {
			
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < a.length; j++) {
					
					if (a[i][j] != b[i][j]) {
						
						return false;
						
					}
					
				}
			}
			
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int speilMatrise[][] = new int[matrise.length][matrise[0].length];
		
		int k = 0;
		
		while (k < matrise.length) {
			
			for (int i = 0, j = matrise.length-1; i < matrise.length; i++, j--) {
				
				speilMatrise[k][i] = matrise[k][j];
				
			}
			
			k++;
		}
		
			
		return speilMatrise;
		}
		
		
	
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int nyMatrise[][] = new int[a.length][b[0].length];
		
		
		for (int i = 0; i < nyMatrise.length; i++) {
			
			nyMatrise[i][i] = a[i][i] * b[i][i];
			
		}
		
		
		
		skrivUt(nyMatrise);
		
		return nyMatrise;
		
		
		
	
	}
}
