package StudyJava;
//�����Լ������С���������㷨���ǰ���ѧ����ת��Ϊ������룬���ȱ�����ѧҪ�ã��������������Ҫǿ
//��С��������������֮���������Լ��
public class gongyueshu {

	public static void main(String[] args) {
		System.out.println(f1(30,876));
		System.out.println(f2(3,2));
	}
	private static int f1(int a,int b){
		while(a%b>=0){    //whileѭ����ѭ���ģ�����������ʱ������ѭ������
			if(a<b){     //��֤a��Զ��������
				a=a+b;
				b=a-b; //��ʱb=a
				a=a-b; //��ʱa=b
			}
			if(a%b==0){
				return b;   //���ص�����С���Ǹ����������Լ��
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
