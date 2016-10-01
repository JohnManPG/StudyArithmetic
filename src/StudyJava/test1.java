package StudyJava;
//多敲多练习
public class test1 {

	public static void main(String[] args) {
		int []num={1,3,2,5,7,8,9,4,6,0};
		int n=num.length;
		for(int i=0;i<n-1;i++)
		{
			//找到最小的
			int min=num[i];
			for(int j=i+1;j<=n-1;j++)
			{
				if(min>num[j])
				{
					min=num[j];
				}
			}
			//找最小的位置
			int j;
			for(j=i;j<=n-1;j++)
			{
				if(num[j]==min)
				{
					break;
				}
			}
			if(j>i)
			{
				int temp=num[j];
				num[j]=num[i];
				num[i]=temp;
			}		
		}
		//打印值
		for(int i=0;i<=n-1;i++)
		{
			System.out.println(num[i]);
		}
	}
}
