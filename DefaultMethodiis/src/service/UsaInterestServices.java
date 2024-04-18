package service;

import java.security.InvalidParameterException;

public class UsaInterestServices implements InterestService {
	
	private double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRace() {
		return interestRate;
	}

}
