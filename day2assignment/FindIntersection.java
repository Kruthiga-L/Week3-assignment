package week3.day2assignment;


import java.util.ArrayList;

import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	
	List<Integer> ls= new ArrayList<Integer>();
	List<Integer> ls1=new ArrayList<Integer>();
	int[] a={3, 2, 11, 4, 6, 7};
	int[] b= {1, 2, 8, 4, 9, 7};
	//adding array elements to list
	for(int i=0;i<a.length;i++)
	{
	ls.add(a[i]);	
	ls1.add(b[i]);
	}
	//comparing the two list and print the intersection element
	System.out.println("Intersection elements : ");
	for(int j=0;j<ls.size();j++)
	{
		if(ls.get(j)==ls1.get(j))
		{
			System.out.print(ls1.get(j)+" ");
		}

	}
	}

}
