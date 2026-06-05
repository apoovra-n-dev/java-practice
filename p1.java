

import java.util.ArrayList;
import java.util.List;

/*How to copy ArrayList to array? */
public class p1 {
	
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(100);
		a.add(200);
		System.out.println(a);
	
		Integer[] arr = a.toArray(new Integer[0]);

		for(Integer lv:arr) {
			System.out.println(lv);
		}
	}
		

}
