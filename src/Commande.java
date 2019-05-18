import java.util.Collection;

public class Commande {
	public String Client;
	
	Collection<Article> articles;
	
	public Commande(String client){
		this.Client = client;
	}

}
