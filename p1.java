package Arrays;

import java.util.ArrayList;
import java.util.List;

/*How to copy ArrayList to array? */
public class p1 {
	
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		System.out.println(a);
	
		for(Integer lv:a) {
			System.out.println(lv);
		}
	}
		

}
