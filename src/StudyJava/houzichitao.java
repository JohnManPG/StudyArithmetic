package StudyJava;
//猴子吃桃的问题：猴子第一天摘了N个桃子，当时吃了一半多一个，以此下去，第十天还剩下一个桃子，请问猴子一共摘了几个桃子
public class houzichitao {

	public static void main(String[] args) {
		System.out.println(f(10));
		
		//第一种方法
		/*int sum=1;
		for(int i=1;i<=9;i++){			
			sum=(sum+1)*2;
		}
        System.out.println(sum);*/
	}
	//第二种方法
	private static int f(int n){
		if(n==1){
			return 1;
		}else{  
			return 2*f(n-1)+2;  //求出递推公式，就好解决了，数学还是很有用的，还是用递归
		}
	}
}
