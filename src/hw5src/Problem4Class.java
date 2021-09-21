package hw5src;

public class Problem4Class {
	
	public double hotelDiscount (double roomTotal, boolean coupon, int memberPoints, int days, boolean member, double taxRate) {
		double factor;

		if (roomTotal >= 6_000.00)
			factor = 0.80;
		else
			if (roomTotal > 3_000.00)
				factor = 0.825;
			else
				if (roomTotal >= 2_250.00)
					factor = 0.875;
				else
					if (roomTotal > 1_350.00)
						factor = 0.925;
					else
						factor = 1.00;

		return ((coupon) || (memberPoints >= 10_000) && (days > 7) && member) ? (1+taxRate)*(factor)*roomTotal : (1+taxRate)*roomTotal;
	}
}