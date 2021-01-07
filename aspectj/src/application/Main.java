package application;

import application.beans.Client;
import application.beans.Compte;

public class Main {
	public static void main(String[]args) {
		Compte compte=new Compte();
		compte.setSolde(1000.0);
		Client client=new Client();
		client.setNom("Oukssim");
		client.setCp(compte);
		client.retirer(100.0);
		client.verser(1000.0);
	}
	
}
