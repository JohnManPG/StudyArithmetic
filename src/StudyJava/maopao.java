package StudyJava;
//冒泡排序算法:算法分析总共需要比较n-1轮，每一轮需要比较n-i次，轮做外循环，次做内循环
public class maopao {

	public static void main(String[] args) {
		sort();
	}
	//for循环和while和do...while...循环的区别
	private static void sort(){
		int []numbers={9,5,6,7,8,1,3,2,4};
		int n=numbers.length;
		for(int i=1;i<=n-1;i++)    //外循环
		{
			for(int j=1;j<=n-i;j++)//内循环
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
