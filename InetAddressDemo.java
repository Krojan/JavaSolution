package Spring2018;
import java.net.*;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip=InetAddress.getByName("www.javatpoint.com");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());

	}
}


