package service;

public class BrazilInterestServices implements InterestService {
	
	private double interestRate;
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRace() {
		return interestRate;
	}
	
}
