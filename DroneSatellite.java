package version_d.q4;

public class DroneSatellite implements ISatellite{
	public String Sname;
	
	public DroneSatellite() {}
	
	public DroneSatellite(String sname) {
		this.Sname = sname;
	}

	@Override
	public void activate() {
		System.out.println(Sname + " drone satellite activated");
	}

	@Override
	public void deactivate() {
		System.out.println(Sname + " drone satellite deactivated");
	}

}
