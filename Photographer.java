import java.util.*;

public class Photographer{
  
  private String name;
  private ArrayList<Printable> prints;

  public Photographer(String name){
    this.prints = new ArrayList<Printable>();
    this.name = name;
  }

  public void addCamera(Printable printable){
    prints.add(printable);
  }


  public void removeCamera(){
    prints.clear();
  }

  public int countCamera(){
    return prints.size();

  }
}


