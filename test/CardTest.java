import static org.junit.Assert.*;
import org.junit.Test;

public class CardTest {

	Card diamond1 = new Card("Diamond", 1);
	Card diamond2 = new Card("Diamond", 2);
	Card spade1 = new Card("Spade", 1);
	Card spade2 = new Card("Spade", 2);
	Card spadeA = new Card("Spade", 14);

	Card card2C = new Card("Club", 2);
	Card card2S = new Card("Spade", 2);
	Card card2D = new Card("Diamond", 2);
	Card card2H = new Card("Heart", 2);
	Card card3C = new Card("Club", 3);

	Card[] deck1 = { card2C, card2S, card2D, card3C };

	Card[] deck2 = { card2C, card3C, card2D};

	Card[] deck3 = { card2C, card3C, spadeA};

	Card[] emptyDeck = {};

	@Test
	public void testToString() {
		assertTrue("Card.toString: generates incorrect String", diamond1.toString().equals("[1,Diamond]"));
		assertTrue("Card.toString: generates incorrect String", spade2.toString().equals("[2,Spade]"));
	}

	@Test
	public void testEquals() {
		assertTrue("Card.equals: Yields false incorrectly", diamond1.equals(diamond1));
		assertFalse("Card.equals: Yields true incorrectly", diamond1.equals(diamond2));
	}

	@Test
	public void testSameSuitRank() {
		assertTrue("Card.sameRankAs: Yields false incorrectly", diamond1.sameRankAs(spade1));
		assertTrue("Card.sameSuitAs: Yields false incorrectly", diamond1.sameSuitAs(diamond2));
		assertFalse("Card.sameRankAs: Yields true incorrectly", spade1.sameRankAs(spade2));
		assertFalse("Card.sameSuitAs: Yields true incorrectly", spade2.sameSuitAs(diamond1));
	}

	@Test
	public void testPairExists() {
		assertTrue("pairExists: returns false incorrectly", Card.pairExists(deck1));
		assertFalse("pairExists: returns true incorrectly", Card.pairExists(emptyDeck));
		assertTrue("pairExists: returns false incorrectly", Card.pairExists(deck2));
		assertFalse("pairExists: returns true incorrectly", Card.pairExists(deck3));
	}
}