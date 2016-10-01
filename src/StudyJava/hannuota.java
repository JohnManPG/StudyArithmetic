package StudyJava;

public class hannuota {
	/*静态方法中需引用静态变量*/
	static int i=0;
	public static void main(String[] args) {
		/*加上引号表示字符串*/
		  hannuo(3,"A","B","C");
		  System.out.println(i);
	}
	    /*方法中需要四个参数*/
	 static void hannuo(int n,String src,String mid,String dest)
	{
		if(n==1)
		{
			i++;
			System.out.println(src+"-->"+dest);
		}else
		{
			hannuo(n-1,src,dest,mid);
			hannuo(1,src,mid,dest);
			hannuo(n-1,mid,src,dest);
		}
	}

}
