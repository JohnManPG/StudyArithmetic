package StudyJava;

public class hannuota {
	/*��̬�����������þ�̬����*/
	static int i=0;
	public static void main(String[] args) {
		/*�������ű�ʾ�ַ���*/
		  hannuo(3,"A","B","C");
		  System.out.println(i);
	}
	    /*��������Ҫ�ĸ�����*/
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
