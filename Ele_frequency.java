import java.util.stream.*;
import java.util.*;
class Ele_frequency{
  public static void main(String as[])
  {
    int a[]={10,2,10,5,10,3,1,2,10,5};
    Arrays.stream(a).boxed().collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()).entrySet().stream().map(x->x.getKey()).forEach(x->System.out.println(x)));
  }
}
