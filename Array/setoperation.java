/* The java.lang.reflect.Array.set()
 is an inbuilt method in Java and is used to set a specified value to a specified index of a given object array.*/
//SYNTAX : Array.set(Object []array, int index, Object value)
import java.lang.reflect.Array;

public class setoperation {
    public static void main(String[] args)
    {
        String s[] = { "code ", "and ", "coffee" };
        System.out.print("Before Set : ");
        for (String x : s) {
            System.out.print(x);
        }

        Array.set(s, 1, "with ");
  
        System.out.print("\nAfter Set : ");
        for (String x : s) {
            System.out.print(x);
        }
    }
}
