package prototype.resolved;

public class Main {

	//prototype se refera la definirea o singura data; iplementez tipul obiectului extras din baza de date sau de oriunde, si il folosesc de fiecare data cand am o colectie asemanatoare (folosind clone)
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookStore carturesti=BookStore.loadDataFromDatabase("carturesti");
		System.out.println(carturesti);
		
		BookStore diverta=carturesti;	//shallow copy; deci avem nevoie de cloneable (versiunea resolved)
		diverta.getListBooks().remove(2);
		System.out.println(carturesti);
		
		BookStore ds=(BookStore)carturesti.clone();
		ds.getListBooks().remove(2);	//deep copy
		System.out.println(carturesti);
		
	}

}


//data viitoare: Factory: produsul (arma) difera ca pret si calitate; in fucntie de pret, ne dam seama ce arma vrea; in functie de tipul venitului ne dam seama de tipul utilizatorului
