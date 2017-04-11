import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CameraTest{
  Photographer photographer;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer("Dunc");
    analogCamera = new AnalogCamera();
    digitalCamera = new DigitalCamera();
  }

  @Test
  public void canAddCamera(){
    this.photographer.addCamera(this.analogCamera);
    assertEquals(1, this.photographer.countCamera());
  }

  // @Test
  // public void canAddCamera(){
  //   this.photographer.addCamera(this.digitalCamera);
  //   assertEquals(1, this.photographer.countCamera());
  // }

  // @Test
  // public void canRemoveCamera(){
  //   this.photographer.removeCamera(this.analogCamera);
  //   assertEquals(0, this.photographer.countCamera());
  // }

  // @Test
  // public void canRemoveCamera(){
  //   this.photographer.removeCamera(this.digitalCamera);
  //   assertEquals(0, this.photographer.countCamera());
  // }
}

