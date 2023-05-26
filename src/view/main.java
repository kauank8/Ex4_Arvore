package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {
	
	public static void main(String[] args) {
		int vt[] = {7, 8, 3, 4, 2, 1, 6, 5};
		Arvore arv = new Arvore();
		for(int i : vt) {
		arv.insert(i);	
		}
		try {
			arv.remove(7);
			arv.remove(6);
			arv.prefixSearch();
			System.out.println("\n========================================");
			arv.infixSearch();
			System.out.println("\n========================================");
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
