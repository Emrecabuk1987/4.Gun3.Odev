package Entities;

import Adapters.MernisServiceAdapter;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;

public class Main {

	public static void main(String[] args) throws Exception {
		Game game = new Game();
		game.setId(1);
		game.setGameName("Cyberpunk 2077");
		game.setPrice(250);
		
		Customer customer = new Customer (1,"Emre","Çabuk",1987,21716160734L); 
		
		//Customer customer2=new Customer(2,"Engin","Demiroğ",1985,1211212122112L);
		
		Campaign campaign = new Campaign(1,"Bahar Kampanyasi",30);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		
		customerManager.add(customer);
		
		System.out.println("-----------------------------------------");
		
		//customerManager.add(customer2);
		
		System.out.println("------------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		System.out.println("------------------------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, customer);
		
		
		System.out.println("------------------------------------------");
		
		saleManager.saleWithCampaign(game, campaign);
		
		System.out.println("------------------------------------------");

	}

	

}
