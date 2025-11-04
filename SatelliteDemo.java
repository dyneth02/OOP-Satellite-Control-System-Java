package version_d.q4;

public class SatelliteDemo {

	public static void main(String[] args) {
		 ISatellite  navigationalSatellite  =  new NavigationSatellite("Ravana-01");
		 IGeoLocation  locationTracker1  =  new SatelliteLocation("Sri  Lanka");
		 
		 ISatellite droneSatellite =  new DroneSatellite("Ravana-02");
		 IGeoLocation  locatiinTracker2  = new SatelliteLocation("Russia");
		 
		 ISatellite droneSatellite2 =  new DroneSatellite("Ravana-03");
		 IGeoLocation  locatiinTracker3  = new SatelliteLocation("United States of America");
		 
		 ISatellite[]   satelliteArray = new ISatellite[] {navigationalSatellite, droneSatellite};
		 IGeoLocation[]  trackerArray  =  new IGeoLocation[] {locationTracker1, locatiinTracker2}; 
		 
		 ISatellite[]   satelliteArray1 = new ISatellite[] {navigationalSatellite, droneSatellite2};
		 IGeoLocation[]  trackerArray1  =  new IGeoLocation[] {locationTracker1, locatiinTracker3}; 
		 
		 SatelliteCenter  satelliteCenter = new SatelliteCenter(0, satelliteArray, trackerArray);
		 satelliteCenter.startService();
		 satelliteCenter.stopService();
		 satelliteCenter.locationService();
		 
		 SatelliteCenter  remoteController2 =  new SatelliteCenter(1, satelliteArray,trackerArray) ;
		 remoteController2.startService();
		 remoteController2.stopService();
		 remoteController2.locationService();

		 SatelliteCenter  remoteController3 =  new SatelliteCenter(1, satelliteArray1,trackerArray1) ;
		 remoteController3.startService();
		 remoteController3.stopService();
		 remoteController3.locationService();
	}

}
