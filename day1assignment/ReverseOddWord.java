package week3.day1assignment;

public class ReverseOddWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] sp = test.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			if(i%2!=0)
			{
				char[] ch = sp[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					System.out.print(ch[j]);
					
				}
			}
			else
			{
				System.out.print(sp[i]);
			}
			System.out.print(" ");
		}

	}

}
