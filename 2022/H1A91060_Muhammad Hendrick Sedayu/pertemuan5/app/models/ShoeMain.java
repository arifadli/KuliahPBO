package models;

public class ShoeMain {
	public static void main (String[] args)
	{
		Formal form = new Formal("docmart","Black", 43, "pantboot", "teenager");
		Nonformal nonform = new Nonformal("converse","bonewhite", 42,"sneakers", "Teenager");
		
		form.display();
		nonform.display();
	}

}
