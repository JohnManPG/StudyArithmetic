package StudyJava;
/**求100以内的素数,质数（prime number）又称素数，
有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。**/
public class sushu {
	//这是Java程序运行的入口，main方法,要做什么事，这个事就是方法
	public static void main(String[] args)
	{   
		int n=0;
		for(int i=2;i<=100;i++)
		{
			if(isSushu(i))
			{
				n++;   //第一次是感觉比较困难，慢慢来，逻辑上的是需要培养的，只需你遇到问题好好思考
				System.out.print(i+"\t");  //注意print和println的区别,\t在java中代表着空格字符				
				if(n%10==0)    //用取余来确定10个数一组，记住这种方式
				{
					System.out.println();
				}			   
			}
		}
	}
	private static boolean isSushu(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
