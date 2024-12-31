package designpatterns.strategypattern;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public String getDriveStrategy() {
		return "normal drive strategy";
	}

}
