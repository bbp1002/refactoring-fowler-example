package ubu.gii;

public class RegularPrice extends Price{

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.REGULAR;
	}

	public double getCharge(int daysRented) {
		double result=2;
		
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
			
		return result;
	}

}
