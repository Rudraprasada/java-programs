package basicprg;

public class Methodoverloading1 {
	static void logintoamazon(long mobileno)
	{
		System.out.println("Enter your mobile no");
	}
	static void logintoamazon(String emailid)
	{
		System.out.println("Enter your emailid");
	}
public static void main(String[] args) {

	logintoamazon(8658498613l);
	logintoamazon("marco666@gmail.com");
}
}
