package StudyJava;
//插入排序
public class charupaixu {

	public static void main(String[] args) {
		int []num={1,4,2,3,7,5,6,9,8,0};
		int n = num.length;
		/*总共需要插入n-1个数，作为外循环的条件*/
		for(int i=0;i<=n-2;i++)   
		{   /*将要插入的数，与前i个数进行比对排序，所以j需要小于i*/
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
		/*打印值*/
		for(int i=0;i<n;i++)
		{
			System.out.print(num[i]+"\t");
		}

	}

}
