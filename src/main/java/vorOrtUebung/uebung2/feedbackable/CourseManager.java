package vorOrtUebung.uebung2.feedbackable;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	private List<Feedbackable> feedbackables;

	public CourseManager() {
		this.feedbackables = new ArrayList() {{
			add(new Course());
			add(new Thesis());
			add(new PracticalExercises());
		}};
	}

	public void printFeedback() {
		for(Feedbackable f: this.feedbackables) {
			String x = f.collectFeedback();
			System.out.println(x);
		}
	}
}
