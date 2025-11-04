package version_d.q4;

public class SatelliteCenter implements ISatellite{
	public int option;
	public ISatellite[] isatellites;
	public IGeoLocation[] igeoloactions;
	
	public SatelliteCenter() {}
	
	public SatelliteCenter(int option, ISatellite[] isatellites, IGeoLocation[] igeoloactions) {
		this.option = option;
		this.isatellites = isatellites;
		this.igeoloactions = igeoloactions;
	}
	

	@Override
	public void activate() {
		if (option == 0) {
			isatellites[0].activate();
		}
		else {
			isatellites[1].activate();
		}
	}

	@Override
	public void deactivate() {
		if (option == 0) {
			isatellites[0].deactivate();
		}
		else {
			isatellites[1].deactivate();
		}
	}
	
	public void startService() {
		activate();
	}
	
	public void stopService() {
		deactivate();
	}
	
	public void locationService() {
		if (option == 0) {
			igeoloactions[0].displayLocation();
		}
		else {
			igeoloactions[1].displayLocation();
		}
	}
	
}
