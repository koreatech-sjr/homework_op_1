import java.util.Random;

public class LastHandBasedStrategy implements PlayingStrategy {
	private HandType prevHand;
	private Player user;
	
	Random generator = new Random();        
	int randomNumber = 0;
	
	public LastHandBasedStrategy(Player user) {
		this.user = user;
	}
	@Override
	public HandType nextHand() {
		this.setLastUserHand();
		randomNumber = generator.nextInt(10);
		
		switch(prevHand) {
			case MOOK:
				if(randomNumber < 2)
					return HandType.MOOK;
				else if(randomNumber < 6)
					return HandType.JI;
				else
					return HandType.BA;
			case JI:
				if(randomNumber < 2)
					return HandType.JI;
				else if(randomNumber < 6)
					return HandType.MOOK;
				else
					return HandType.BA;
			case BA:
				if(randomNumber < 2)
					return HandType.BA;
				else if(randomNumber < 6)
					return HandType.MOOK;
				else
					return HandType.JI;
		}
		return null;
	}
	
	public void setLastUserHand() {
		this.prevHand = this.user.getUserHand();
		System.out.println(this.prevHand);
	}
	
}
