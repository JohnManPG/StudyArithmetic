package StudyJava;
/**��100���ڵ�����,������prime number���ֳ�������
�����޸�����������Ϊ�ڴ���1����Ȼ���У�����1�����������ⲻ������������������Ϊ������**/
public class sushu {
	//����Java�������е���ڣ�main����,Ҫ��ʲô�£�����¾��Ƿ���
	public static void main(String[] args)
	{   
		int n=0;
		for(int i=2;i<=100;i++)
		{
			if(isSushu(i))
			{
				n++;   //��һ���Ǹо��Ƚ����ѣ����������߼��ϵ�����Ҫ�����ģ�ֻ������������ú�˼��
				System.out.print(i+"\t");  //ע��print��println������,\t��java�д����ſո��ַ�				
				if(n%10==0)    //��ȡ����ȷ��10����һ�飬��ס���ַ�ʽ
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
