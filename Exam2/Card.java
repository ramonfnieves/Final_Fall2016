public class Card {
	private String suit;
	private int rank;

	public Card(String suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "[" + rank  + "," + suit + "]";
	}

	@Override
	public boolean equals(Object c2) {
		if (!(c2 instanceof Card)) {
			throw new RuntimeException("Illegal argument to Card.equals()");
		}
		Card card2 = (Card) c2;
		return ((this.getSuit().equals(card2.getSuit())) && 
				(this.getRank() == card2.getRank()));
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public boolean sameSuitAs(Card card2) {
		return (this.getSuit().equals(card2.getSuit()));
	}

	public boolean sameRankAs(Card card2) {
		return (this.getRank() == card2.getRank());
	}

	public boolean isASpade() {
		return this.getSuit().equals("Spade");
	}

	public boolean hasLowerRank(Card c) {
		return this.getSuit().equals(c.getSuit())&&this.getRank()<c.getRank();
	}

	public static Object maxRank(Card[] deck1) {
		if(deck1.length!=0){
			int max = deck1[0].getRank();
			for(int i=1; i<deck1.length; i++){
				if(deck1[i].getRank()>max){
					max=deck1[i].getRank();
				}
			}
			return max;
		}
		return -1;

	}

	public static boolean hasNoSpades(Card[] deck) {
		for(int i=0; i<deck.length; i++){
			if(deck[i].getSuit().equals("Spade")){
				return false;
			}
		}
		return true;
	}

	public static boolean pairExists(Card[] deck) {
		int count=0;
		for(int i=0;i<deck.length-1;i++){
			for(int j=1;j<deck.length;i++){
				if(deck[i].getRank()==deck[j].getRank()){
					count++;
					if(count>1){
						return true;
					}
				}
			}
		}
		return false;
	}
}