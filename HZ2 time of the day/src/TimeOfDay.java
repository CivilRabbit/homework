
public class TimeOfDay {
	
	/**
	 * @ingvar minutesSinceMidnight zit tussen 0 en 1440
	 * | 0 <= minutesSinceMIdnight && minutesSinceMidnight <= 1440
	*/
	
	private int minutesSinceMidnight;

	
	
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	
	public int getMinutes() {
		return minutesSinceMidnight%60;
	}
	
	
	/**
	 * Initiales the object with a given minutes an hours
	 * @pre initalMinutes zit tussen 0-59
	 * | 0 <= initialMinutes && initialMinutes <= 59
	 * @pre initialHours zit tussen 0 - 23
	 * | 0 <= initialHours && initialHours <= 59
	 * @post getMinutes is gelijk aan initialMinutes
	 * | getMinutes() == initialMinutes
	 * @post getHours is gelijk aan initialHours
	 * | getHours() == initialHours
 	 */	
	 public TimeOfDay(int initialMinutes, int initialHours) {
		this.minutesSinceMidnight = initialMinutes + initialHours*60;
	}
	
	/**
	 * Stelt de minutes gelijk aan de nieuwe waarde
	 * @pre nieuwe waarde is tussen 0 - 59
	 * | 0 <= newMinutes && newMinutes <= 59
	 * @post minutes is de nieuwe waarde
	 * | getMinutes() == newMinutes
	 */
	
	void setMinutes(int newMinutes) {
		System.out.print(newMinutes + " ");
		System.out.print(minutesSinceMidnight/60);
		minutesSinceMidnight = (minutesSinceMidnight - minutesSinceMidnight%60) + newMinutes;
		
	}
	/**
	 * Stelt de hours gelijk aan de nieuwe waarde
	 * @pre nieuwe waarde is tussen 0 - 23
	 * | 0 <= newHours && newHours <= 23
	 * @post hours is de nieuwe waarde
	 * | getHours() == newHours
	 */
	void setHours(int newHours) {
		minutesSinceMidnight = minutesSinceMidnight%60 + newHours*60;
	}
	
	

}
