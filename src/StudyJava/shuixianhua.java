package StudyJava;
//��ˮ�ɻ�����ˮ�ɻ�����ָһ�� n λ�� ( n��3 )������ÿ��λ�ϵ����ֵ� n ����֮�͵���������
public class shuixianhua {

	public static void main(String[] args) {
		//int number=153;  
		/*�ɴ˿ɼ���λ������ˮ�ɻ���*/
		for(int number=1;number<=100000;number++)
		{
	    int temp=number;
		int sum=0;
		for(int i=0;i<=getLength(number);i++)
		{		
			sum=(int) (sum+Math.pow(temp%10, getLength(number)));  //Math.pow()���������ֵ��double�͵ģ��ɸ߷�Χ��ͷ�Χת��ʱ����Ҫ����ǿ��ת��
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
