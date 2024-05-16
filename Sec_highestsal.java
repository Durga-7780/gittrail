import java.util.*;
import java.util.stream.*;

class Sec_highestsal{
  public static void main(String sas[])
  {
      int a[]=new int[]{10,2,30,15,20,6,48};
     Integer s= Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
     System.out.println("Sec highest no : " + s);
  }
}
