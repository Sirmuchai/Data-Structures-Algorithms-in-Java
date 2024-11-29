package otp;

import java.text.DecimalFormat;
import java.util.Random;

public class OtpService {

  //function to generate a six numeric digit OTP
  public String otpGeneration(){
    return new DecimalFormat("000000")
      .format(new Random().nextInt(999999));
  }

}
