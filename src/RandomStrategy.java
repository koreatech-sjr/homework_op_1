import java.util.Random;

public class RandomStrategy implements PlayingStrategy{
	Random generator = new Random();        
	int randomNumber = 0;
	@Override
	public HandType nextHand() {
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
	//TODO : seLastUserHand()
}

//지난번에 낸거를 안낸 거 보다 높다. 지난번 낸건 20% 다른거 2개는 각각 40% 