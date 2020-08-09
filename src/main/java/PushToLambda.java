import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class PushToLambda {


    public static void main(String[] args){
        GpioController gpioController = GpioFactory.getInstance();
        GpioPinDigitalOutput output= gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_17);
        output.high();
        output.low();
    }

}





