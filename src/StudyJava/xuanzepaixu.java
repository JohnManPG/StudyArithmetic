package StudyJava;

public class xuanzepaixu {
	public static void main(String[] args){
		xuanze();
	}
     private static void xuanze(){
    	 int []num={8,4,5,7,6,2,3,1,9};
    	 int n=num.length;
    	 for(int i=0;i<=n-2;i++)   //一共需要比较n-1趟，因为一趟只抽出一个最小的数值
    	 {   //找到最小的那个数
    		 int min=num[i];
    		 for(int j=i+1;j<=n-1;j++)
    		 {
    			 if(min>num[j])
    			 {
    				 min=num[j];
    			 }  			 
    		 }
    		 //判断一下最小的数出现在什么位置
    		 int j;
    		 for(j=i;j<=n-1;j++)
    		 {
    			 if(num[j]==min)
    			 {
    				 break;
    			 }    			 
    		 }
    		 //j位置最小
    		 //交换位置
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
    		 System.out.print(num[i]+"\t");
    	 }
     }
}
