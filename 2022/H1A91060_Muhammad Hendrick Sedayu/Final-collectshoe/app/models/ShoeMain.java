package models;

public class ShoeMain {
	public static void main (String[] args)
	{
		Formal form = new Formal("docmart","Black", 43, "pantboot");
		Nonformal nonform = new Nonformal("converse","bonewhite", 42,"sneakers");
		
		form.display();
		nonform.display();
	}

}
