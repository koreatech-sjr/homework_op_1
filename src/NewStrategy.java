import java.util.Random;

public class NewStrategy implements PlayingStrategy {
	private Player user;
	
	Random generator = new Random();        
	int randomNumber = 0;

	private int MookCount = 1;
	private int JiCount = 1;
	private int BaCount = 1;
	
	public NewStrategy(Player user) {
		this.user = user;
	}
	@Override
	public HandType nextHand() {
		int max = 0;
		HandType maxHand = HandType.MOOK;
		
		this.setLastUserHand();
		
		 if (this.MookCount >= this.JiCount && this.MookCount >= this.BaCount) {
	            max = this.MookCount;
	            maxHand = HandType.MOOK;
	            
	        } else if (this.JiCount >= this.MookCount && this.JiCount >= this.BaCount) {
	            max = this.JiCount;
	            maxHand = HandType.JI;
	        } else {
	            max = this.BaCount;
	            maxHand = HandType.BA;
	        }
		
		return maxHand;
	}
	
	public void setLastUserHand() {
		switch(this.user.getUserHand()) {
			case MOOK:
				this.MookCount++;
				break;
			case JI:
				this.JiCount++;
				break;
			case BA:
				this.BaCount++;
				break;
		}
	}
	
}
