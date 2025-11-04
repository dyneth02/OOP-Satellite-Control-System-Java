package version_d.q4;

public class SatelliteLocation implements IGeoLocation{
	public String location;
	
	public SatelliteLocation() {}
	
	public SatelliteLocation(String loc) {
		this.location = loc;
	}

	@Override
	public void displayLocation() {
		System.out.println("Satellite Location is = " + location);
		System.out.println();
	}

}
