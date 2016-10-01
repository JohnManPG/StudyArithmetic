package StudyJava;
//求最大公约数和最小公倍数，算法就是把数学问题转化为程序编码，首先必须数学要好，分析问题的能力要强
//最小公倍数等于两数之积除以最大公约数
public class gongyueshu {

	public static void main(String[] args) {
		System.out.println(f1(30,876));
		System.out.println(f2(3,2));
	}
	private static int f1(int a,int b){
		while(a%b>=0){    //while循环是循环的，当满足条件时，继续循环往复
			if(a<b){     //保证a永远是最大的数
				a=a+b;
				b=a-b; //此时b=a
				a=a-b; //此时a=b
			}
			if(a%b==0){
				return b;   //返回的是最小的那个数，即最大公约数
			}else{
			   a=a%b;
			}
		}		
		return 0;
	}
	
	private static int f2(int a,int b){
		return a*b/f1(a,b);
	}
}
