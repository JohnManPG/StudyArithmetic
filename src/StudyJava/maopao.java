package StudyJava;
//ð�������㷨:�㷨�����ܹ���Ҫ�Ƚ�n-1�֣�ÿһ����Ҫ�Ƚ�n-i�Σ�������ѭ����������ѭ��
public class maopao {

	public static void main(String[] args) {
		sort();
	}
	//forѭ����while��do...while...ѭ��������
	private static void sort(){
		int []numbers={9,5,6,7,8,1,3,2,4};
		int n=numbers.length;
		for(int i=1;i<=n-1;i++)    //��ѭ��
		{
			for(int j=1;j<=n-i;j++)//��ѭ��
			{
				if(numbers[j-1]>numbers[j])
				{
					int temp=numbers[j-1];
					numbers[j-1]=numbers[j];
					numbers[j]=temp;					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
