package StudyJava;

public class xuanzepaixu {
	public static void main(String[] args){
		xuanze();
	}
     private static void xuanze(){
    	 int []num={8,4,5,7,6,2,3,1,9};
    	 int n=num.length;
    	 for(int i=0;i<=n-2;i++)   //һ����Ҫ�Ƚ�n-1�ˣ���Ϊһ��ֻ���һ����С����ֵ
    	 {   //�ҵ���С���Ǹ���
    		 int min=num[i];
    		 for(int j=i+1;j<=n-1;j++)
    		 {
    			 if(min>num[j])
    			 {
    				 min=num[j];
    			 }  			 
    		 }
    		 //�ж�һ����С����������ʲôλ��
    		 int j;
    		 for(j=i;j<=n-1;j++)
    		 {
    			 if(num[j]==min)
    			 {
    				 break;
    			 }    			 
    		 }
    		 //jλ����С
    		 //����λ��
    		 if(j>i)
    		 {
    			int temp=num[j];
    			num[j]=num[i];
    			num[i]=temp;
    		 }
    	 }
    	 //��ӡֵ
    	 for(int i=0;i<=n-1;i++)
    	 {
    		 System.out.print(num[i]+"\t");
    	 }
     }
}
