package fr.pizzeria.model;

public class Pizza {
	
	public int id ;
	public String code ;
	public String libelle ;
	public double prix ;
	public static int id_pizza = 0 ;
		// AJOUT DE L'ATTRIBUT DE TYPE CategoriePizza
	public CategoriePizza cat;
	
		// AJOUT DE LA CATEGORIE DE PIZZA DANS LE CONSTRUCTEUR
	public Pizza (String code , String libelle , double prix , CategoriePizza cat) {
		this.id = id_pizza++ ;
		this.code = code ;
		this.libelle = libelle ;
		this.prix = prix ;
		this.cat = cat ;
	}
	
		// AJOUT DE LA CATEGORIE DE PIZZA DANS LE CONSTRUCTEUR
	public Pizza (int id , String code , String libelle , double prix , CategoriePizza cat) {
		this.id = id ;
		if (id > id_pizza) {
			id_pizza = id;
		}
		this.code = code ;
		this.libelle = libelle ;
		this.prix = prix ;
		this.cat = cat ;
	}
	
	public String toString (CategoriePizza cat) {
		
		return cat.getCat() ;
	}
	

}
