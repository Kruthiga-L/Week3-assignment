package week3.day1assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="We learn Java basics as part of java sessions in java week1";
		String lp = text.toLowerCase();
		String r="";
		String[] sp = lp.split(" ");
		int cnt=0;
		for(int i=0;i<sp.length-1;i++)
		{
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].equals(sp[j]))
				{
					cnt++;
					r=text.replace(sp[j],"");
				}
			}		
	}
		if(cnt>0)
		{
			System.out.println(r);
	}
	}
	

}
