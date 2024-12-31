package designpatterns.strategypattern;

public class SpecialDriveStrategy implements DriveStrategy {

	@Override
	public String getDriveStrategy() {
		return "special drive strategy";
	}

}
