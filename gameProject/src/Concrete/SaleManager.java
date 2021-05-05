package Concrete;

import Abstract.CampaignService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService  {

	private CampaignService campaignService;
	
	public void SaleManager(CampaignService campaignService) {
		this.campaignService=campaignService;
	}
	
	@Override
	public void sale(Game game, Customer customer) {
		System.out.println( game.getGameName()+ " isimli oyun "
	+ customer.getFirstName() + " isimli kullanciya satildi. ");
	}
		
	

	@Override
	public void saleWithCampaign(Game game,Campaign campaign) {
		if(this.campaignService.campaignExist())
		   {
			
			System.out.println( game.getGameName() + " isimli oyuna " + campaign.getCampaignName()
			+" isimli kampanya uygulandi.-- kadarlik indirim aldi ");
		   }
		   
		   else {
			   System.out.println( game.getGameName()+ " isimli oyun satildi.");
		   }
		
	}


	
}
