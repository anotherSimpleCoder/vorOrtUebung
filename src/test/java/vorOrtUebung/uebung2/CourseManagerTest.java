package vorOrtUebung.uebung2;

import org.junit.jupiter.api.Test;

import vorOrtUebung.uebung2.feedbackable.CourseManager;

public class CourseManagerTest {
	@Test
	public void testPrintFeedback() {
		CourseManager testManager = new CourseManager();
		testManager.printFeedback();
	}
}
