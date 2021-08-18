
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int trainLength=340;//340 m long train
	        double speed=45.0;//45 km/hr speed of train
	        int tunnel=160; //160m long tunnel
	        
	       /* Length of the train = 340 
	        * Length of the tunnel = 160m
             Therefore, length of the train + length of the tunnel = (340 + 160) m = 500m
             Speed of the train = 45 km/hr
              Speed of the train = 45 × 5/18 m/sec

	        		             = 25/2 m/sec

	        		             = 12.5 m/sec

	Therefore, time taken by the train to cross the tunnel = 500 m/12.5 m/sec.

	        		= 40 seconds.*/
	        speed=(double) speed*(1000/3600.0);
	        int distance=tunnel+trainLength;
	        double time=distance/speed;

	        System.out.println(" Time required :"+ time+" Seconds");

	}

}
