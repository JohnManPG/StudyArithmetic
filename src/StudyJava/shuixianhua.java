package StudyJava;
//求水仙花数：水仙花数是指一个 n 位数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身
public class shuixianhua {

	public static void main(String[] args) {
		//int number=153;  
		/*由此可见个位数都是水仙花数*/
		for(int number=1;number<=100000;number++)
		{
	    int temp=number;
		int sum=0;
		for(int i=0;i<=getLength(number);i++)
		{		
			sum=(int) (sum+Math.pow(temp%10, getLength(number)));  //Math.pow()计算出来的值是double型的，由高范围向低范围转换时，需要进行强制转换
		    temp=temp/10;
		}
	    if(sum==number)
	    {
	    	System.out.println(number);
	    }
	    }
	}
	private static int getLength(int number)
	{
		int i=0;
		while(number>0)
		{
			++i;
			number=number/10;
		}
		return i;
	}
}
