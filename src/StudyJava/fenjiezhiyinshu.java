package StudyJava;
/**�ֽ���������ÿ������������д�ɼ���������˵���ʽ��
 * ����ÿ�������������������������������������ķֽ��������� �ֽ�������ֻ��Ժ�����
 * �����������������������ģ��������߼�����Ҳ��������������**/
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
			//�����µ����˸ú���������i��Ȼ�Ǵ�2��ʼ��,�ݹ��ʹ�����������еĴ���ʽ��һ���ģ�����ʹ�õݹ�
			if(isSushu(number/i))
			{
		    System.out.println(number/i);				  
			}else{
	            /*�˴�ʹ�õݹ麯��*/
				facotr(number/i);	
			}
	    /**�����ѭ���������˳����ѭ����������˳�����ӡ��������***/
			break;
		}		
	}
	}
	private static boolean isSushu(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)  //����
		{
			if(number%i==0)
			{
				return false;    //ִ�д�return,�Ͳ�ִ�к����return��
			}
		}
         return true;
	}
}
