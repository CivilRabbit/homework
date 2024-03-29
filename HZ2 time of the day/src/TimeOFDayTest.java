import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOFDayTest {
	
	@Test
	void test() {
		TimeOfDay time = new TimeOfDay(20, 20);
		assertEquals(20, time.getHours());
		assertEquals(20, time.getMinutes());
		time.setHours(15);
		assertEquals(15, time.getHours());
		time.setHours(23);
		assertEquals(23, time.getHours());
		time.setMinutes(2);
		assertEquals(2, time.getMinutes());
		time.setMinutes(23);
		assertEquals(23, time.getMinutes());
	}

}
