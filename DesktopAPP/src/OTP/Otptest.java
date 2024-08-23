package OTP;

import java.util.Calendar;
import java.util.Random;

public class Otptest {
	public static void main(String[] args) {
		Random randomNumber = new Random();
        int OTP = 100000 + randomNumber.nextInt(900000);
        
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 10);
        long expirationTime = calendar.getTimeInMillis();
        
//        session.setAttribute("OTP", OTP);
//        session.setAttribute("OTPExpirationTime", expirationTime);
		
		
		
		System.out.println("Random integer: " + OTP+" time = "+expirationTime);
	}

}
