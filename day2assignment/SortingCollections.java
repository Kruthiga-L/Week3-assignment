package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cp=new ArrayList<String>();
		String[] companyName= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		for(int i=0;i<companyName.length;i++)
		{
			cp.add(companyName[i]);
		}
		Collections.sort(cp);
		System.out.print("Company Name in descending : ");
		for(int j=cp.size()-1;j>=0;j--)
		{
		System.out.print(cp.get(j)+" ");
		}
	}

}
