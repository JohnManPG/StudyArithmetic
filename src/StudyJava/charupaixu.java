package StudyJava;
//��������
public class charupaixu {

	public static void main(String[] args) {
		int []num={1,4,2,3,7,5,6,9,8,0};
		int n = num.length;
		/*�ܹ���Ҫ����n-1��������Ϊ��ѭ��������*/
		for(int i=0;i<=n-2;i++)   
		{   /*��Ҫ�����������ǰi�������бȶ���������j��ҪС��i*/
			for(int j=0;j<=i;j++)
			{
				if(num[i+1]<num[j])
				{
					int temp=num[i+1];
					num[i+1]=num[j];
					num[j]=temp;
				}
			}
		}
		/*��ӡֵ*/
		for(int i=0;i<n;i++)
		{
			System.out.print(num[i]+"\t");
		}

	}

}
