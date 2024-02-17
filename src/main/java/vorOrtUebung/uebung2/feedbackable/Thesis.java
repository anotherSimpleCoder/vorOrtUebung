package vorOrtUebung.uebung2.feedbackable;

public class Thesis implements Feedbackable {
	@Override
	public String collectFeedback() {
		return "The thesis was really nice.";
	}
}
