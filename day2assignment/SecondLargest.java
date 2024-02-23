package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		int[] a= {3, 2, 11, 4, 6, 7};
		for(int i=0;i<a.length;i++)
		{
			ls.add(a[i]);
		}
		Collections.sort(ls);
		System.out.println("Second Largest:" +ls.get(ls.size()-2));

	}

}
