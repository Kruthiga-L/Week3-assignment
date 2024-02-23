package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> n=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			n.add(num[i]);
		}
		Collections.sort(n);
		System.out.println(n);
		for(int i=0;i<n.size()-1;i++)
		{
			if(((n.get(i))+1)!=n.get((i+1)))
			{
				System.out.println("Missing Elements : "+(n.get(i)+1));
			}
		}
		

	}

}
