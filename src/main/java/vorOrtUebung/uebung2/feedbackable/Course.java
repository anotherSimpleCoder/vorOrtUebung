package vorOrtUebung.uebung2.feedbackable;

public class Course implements Feedbackable {
	@Override
	public String collectFeedback() {
		return "The Software Engineering course is educational and well structured.";
	}
}
