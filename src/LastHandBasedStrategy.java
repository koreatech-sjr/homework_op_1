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
		// TODO Auto-generated method stub
		randomNumber = generator.nextInt(3);
		switch(randomNumber) {
		case 1:
			return HandType.MOOK;
		case 2:
			return HandType.JI;
		default:
			return HandType.BA;
		}
	}
	public void setLastUserHand() {
		this.prevHand = this.user.getUserHand();
		System.out.println(this.prevHand);
	}
}
