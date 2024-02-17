package vorOrtUebung.uebung2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class Time {
	LocalDate birthday = LocalDate.of(2001, 6, 18);
	LocalTime endOfWork = LocalTime.of(17, 0);
	LocalDateTime now = LocalDateTime.now();

	Period timePeriod = Period.of(1, 3, 11);
	Duration timeDuraton = Duration.of(450, ChronoUnit.MINUTES);

	public void daysUntilBirthday() {
		LocalDate today = LocalDate.now();
		ChronoPeriod periodBetween = ChronoPeriod.between(today, birthday);
		ChronoPeriod daysUntilBirthday = today.until(birthday);
		ChronoPeriod birthdayUntilToday = birthday.until(today);

		System.out.println(today);
		System.out.println(periodBetween);
		System.out.println(daysUntilBirthday);
		System.out.println(birthdayUntilToday);
	}
}
