/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise7;

import org.joda.time.DateTime;

public class CalculatePricePercentageOfACancellation {
	
	int monthsBeforeArrival;
	int daysBeforeArrival;
	int totalCostOfTheReservation;
	DateTime arrivalDate = null;
	
	
	public int PricePercentageOfTheTotalPriceToBePaid() {
		Reservation reservation = new Reservation(totalCostOfTheReservation, arrivalDate);
		reservation.cancel();
		
		return reservation.incurredCancellationPercantage(new CancellationPolicy());
	}
	
	public int Costs() {
		Reservation reservation = new Reservation(totalCostOfTheReservation, arrivalDate);
		reservation.cancel();
		
		return reservation.incurredCancellationCosts(new CancellationPolicy());	
	}
	
	public int getTotalCostOfTheReservation() {
		return totalCostOfTheReservation;
	}

	public void setTotalCostOfTheReservation(int totalCostOfTheReservation) {
		this.totalCostOfTheReservation = totalCostOfTheReservation;
	}
	
	public void setMonthsBeforeArrival(int monthsBeforeArrival) {
		this.monthsBeforeArrival = monthsBeforeArrival;
		arrivalDate = new DateTime().plusMonths(monthsBeforeArrival).plusMinutes(1);
	}
		
	public void setDaysBeforeArrival(int daysBeforeArrival) {
		this.daysBeforeArrival = daysBeforeArrival;
		arrivalDate = new DateTime().plusDays(daysBeforeArrival).plusMinutes(1);
	}
	
}
