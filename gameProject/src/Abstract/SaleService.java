package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {

	public void sale (Game game,Customer customer);
	
	public void saleWithCampaign(Game game,Campaign campaign);
}
