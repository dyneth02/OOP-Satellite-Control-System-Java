package version_d.q4;

public class NavigationSatellite implements ISatellite{
	public String Sname;
	
	public NavigationSatellite() {}
	
	public NavigationSatellite(String sname) {
		this.Sname = sname;
	}

	@Override
	public void activate() {
		System.out.println(Sname + " navigational satellite activated");
	}

	@Override
	public void deactivate() {
		System.out.println(Sname + " navigational satellite deactivated");
	}

}
