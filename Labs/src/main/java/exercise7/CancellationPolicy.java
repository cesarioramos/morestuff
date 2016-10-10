/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise7;

import org.joda.time.Interval;
import org.joda.time.DateTime;

public class CancellationPolicy {
		
		public int calculateIncurredCalcuationPercentage(DateTime arrivalDate, DateTime cancellationDate) {
			if( arrivalDate.isBefore(cancellationDate))
				throw new IllegalArgumentException(String.format("Arrival date %s cannot be before cancellation date %s", arrivalDate.toString(), cancellationDate.toString()));
			
			int monthsBeforeArrivaDate = monthsBetweenDates(arrivalDate, cancellationDate);
			if( monthsBeforeArrivaDate > 1 ) 
			{
				return cancellationPercentageOnMonths(monthsBeforeArrivaDate);
			}
			else
			{
				return cancellationPercentageOnDays(daysBetweenDates(arrivalDate, cancellationDate));
			}
				
		}
		
		public int calculateIncurredCalcuationCosts(DateTime arrivalDate, DateTime cancellationDate, float totalPrice) {
			int percentage = calculateIncurredCalcuationPercentage(arrivalDate, cancellationDate);
			return (int) (totalPrice * ( percentage / 100d ));
		}
		
		private int cancellationPercentageOnDays(int daysBeforeArrivaDate) {
			if( daysBeforeArrivaDate > 14)
				return 60;
			else if( daysBeforeArrivaDate > 7)
				return 85;
			else if( daysBeforeArrivaDate > 0)
				return  100;
			else
				return 100;
		}
			

		private int cancellationPercentageOnMonths(int monthsBeforeArrivaDate) {
			if( monthsBeforeArrivaDate > 6)
				return 0;
			else if( monthsBeforeArrivaDate > 3)
				return 10;
			else if( monthsBeforeArrivaDate > 2)
				return  15;
			else
				return 35;
		}

		private int daysBetweenDates(DateTime arrivalDate, DateTime cancellationDate) {
			Interval intervalBeforeArrivalDate = new Interval(cancellationDate, arrivalDate);
			return intervalBeforeArrivalDate.toPeriod().toStandardDays().getDays();
		}
		
		private int monthsBetweenDates(DateTime arrivalDate, DateTime cancellationDate) {
			Interval intervalBeforeArrivalDate = new Interval(cancellationDate, arrivalDate);
			return intervalBeforeArrivalDate.toPeriod().getMonths();
		}

		public double calculatePenaltyDiscount(int reservationAmount, DateTime now,
				DateTime arrivalDate, int user) {
						
			return 37.5;
		}
}
