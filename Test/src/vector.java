import java.util.Vector;

public class vector {
  public static void main(String[] args) {
    Vector<String> vector = new Vector<>();
    vector.add("Hello");
    vector.add("World");
    System.out.println("Vector size: " + vector.size());
    System.out.println("Vector elements: " + vector);
  }
}
