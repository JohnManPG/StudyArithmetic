package StudyJava;
//���ӳ��ҵ����⣺���ӵ�һ��ժ��N�����ӣ���ʱ����һ���һ�����Դ���ȥ����ʮ�컹ʣ��һ�����ӣ����ʺ���һ��ժ�˼�������
public class houzichitao {

	public static void main(String[] args) {
		System.out.println(f(10));
		
		//��һ�ַ���
		/*int sum=1;
		for(int i=1;i<=9;i++){			
			sum=(sum+1)*2;
		}
        System.out.println(sum);*/
	}
	//�ڶ��ַ���
	private static int f(int n){
		if(n==1){
			return 1;
		}else{  
			return 2*f(n-1)+2;  //������ƹ�ʽ���ͺý���ˣ���ѧ���Ǻ����õģ������õݹ�
		}
	}
}
