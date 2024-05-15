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

}
