package StudyJava;
/**分解质因数：每个合数都可以写成几个质数相乘的形式。
 * 其中每个质数都是这个合数的因数，叫做这个合数的分解质因数。 分解质因数只针对合数。
 * 编代码的能力是慢慢练出来的，编代码的逻辑能力也是慢慢练出来的**/
public class fenjiezhiyinshu {

	public static void main(String[] args) {
		    facotr(28);
	}
	
	private static void facotr(int number)
	{
	for(int i=2;i<=number-1;i++)
	{
		if(number%i==0)
		{			
			System.out.println(i+"\t");
			//又重新调用了该函数，所以i依然是从2开始的,递归的使用条件：所有的处理方式是一样的，可以使用递归
			if(isSushu(number/i))
			{
		    System.out.println(number/i);				  
			}else{
	            /*此处使用递归函数*/
				facotr(number/i);	
			}
	    /**当这个循环结束后，退出这个循环，如果不退出，打印结果会出错***/
			break;
		}		
	}
	}
	private static boolean isSushu(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)  //根号
		{
			if(number%i==0)
			{
				return false;    //执行此return,就不执行后面的return了
			}
		}
         return true;
	}
}
