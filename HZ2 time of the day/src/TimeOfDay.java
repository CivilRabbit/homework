
public class TimeOfDay {
	
	/**
	 * @ingvar minutes is between 0-59 and hours between 0-23
	 * | 0 <= minutes && minutes <= 59 && 0 <= hours && hours <=23
	*/
	
	private int minutes;
	private int hours;
	
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	
	/**
	 * Initiales the object with a given minutes an hours
	 * @pre initalMinutes zit tussen 0-59
	 * | 0 <= initialMinutes && initialMinutes <= 59
	 * @pre initialHours zit tussen 0 - 23
	 * | 0 <= initialHours && initialHours <= 59
	 * @post minutes is gelijk aan de nieuwe mintutes
	 * | getMinutes() == initialHours
	 * @post hours is gelijk aan de nieuwe hours
	 * | getHours() == initialHours
	 */
	public TimeOfDay(int initialMinutes, int initialHours) {
		this.minutes = initialMinutes;
		this.hours = initialHours;
	}
	
	/**
	 * Stelt de minutes gelijk aan de nieuwe waarde
	 * @pre nieuwe waarde is tussen 0 - 59
	 * | 0 <= newMinutes && newMinutes <= 59
	 * @post minutes is de nieuwe waarde
	 * | getMinutes() == newMinutes
	 */
	
	void setMinutes(int newMinutes) {
		minutes = newMinutes;
	}
	/**
	 * Stelt de hours gelijk aan de nieuwe waarde
	 * @pre nieuwe waarde is tussen 0 - 23
	 * | 0 <= newHours && newHours <= 23
	 * @post hours is de nieuwe waarde
	 * | getHours() == newHours
	 */
	void setHours(int newHours) {
		hours = newHours;
	}
	
	

}
