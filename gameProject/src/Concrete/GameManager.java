package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi" +game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun Güncellendi" +game.getGameName());
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun Silindi" +game.getGameName());
	}
	

	
}
