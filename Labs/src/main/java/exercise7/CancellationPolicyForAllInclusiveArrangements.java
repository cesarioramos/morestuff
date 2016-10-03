/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise7;

import org.joda.time.DateTime;

public class CancellationPolicyForAllInclusiveArrangements {
	
	private DateTime arrivalDate;	
	
	public int pricePercentageOfTheTotalPriceToBePaid() {
		Reservation reservation = new Reservation(0, arrivalDate);
		reservation.cancel();
		
		return reservation.incurredCancellationPercantage(new CancellationPolicy());
	}
	
	public void setMoreThenMonthsBeforeArrival(int monthsBeforeArrival) {
		arrivalDate = new DateTime().plusMonths(monthsBeforeArrival+1);
	}
		
	public void setMoreThenDaysBeforeArrival(int daysBeforeArrival) {
		arrivalDate = new DateTime().plusDays(daysBeforeArrival+1);
	}
	
	public void setLessThenDaysBeforeArrival(int daysBeforeArrival) {
		arrivalDate = new DateTime().plusDays(daysBeforeArrival).plusMinutes(1);
	}
		
}
