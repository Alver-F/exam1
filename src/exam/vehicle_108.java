package exam;

public class vehicle_108 {
	String brand;
	int speed;
	vehicle_108(String brand,int speed)
	{
		this.brand=brand;
		this.speed=0;
	}
	
	int decrease_speed(int decr)
	{
		this.speed=speed-decr;
		return speed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
