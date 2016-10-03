/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise7;

import org.joda.time.DateTime;

public class Reservation {
	
	private float totalPrice;
	private DateTime arrivalDate;
	private DateTime cancellationDate;
	
	public Reservation(float totalPrice, DateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
		this.totalPrice = totalPrice;
	}
	
	public void cancel() {
		this.cancellationDate = new DateTime();
	}
	
	public boolean isCancelled() {
		return cancellationDate != null;
	}
	
	public int incurredCancellationPercantage(CancellationPolicy cancellationPolicy) {
		return cancellationPolicy.calculateIncurredCalcuationPercentage(arrivalDate, cancellationDate);
	}

	public int incurredCancellationCosts(CancellationPolicy cancellationPolicy) {
		return cancellationPolicy.calculateIncurredCalcuationCosts(arrivalDate, cancellationDate, totalPrice);
	}
	
}
