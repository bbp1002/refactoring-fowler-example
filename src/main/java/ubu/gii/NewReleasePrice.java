package ubu.gii;

public class NewReleasePrice extends Price{

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	public double getCharge(int daysRented) {	
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoint(int daysRented) {
		int frequentRenterPoints=1;
		// add bonus for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}	
