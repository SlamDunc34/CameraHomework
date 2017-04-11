import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CameraTest{
  Photographer = photographer;
  AnalogCamera = analogCamera;
  DigitalCamera = digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    analogCamera = new AnalogCamera();
    digitalCamera = new DigitalCamera();
  }
