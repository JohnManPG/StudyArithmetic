package StudyJava;
//�жϳɼ�������Ľ��ⷽ���ǣ�ʹ�ó�������Χ��С
public class panduanchengji {

	public static void main(String[] args) {
		int grade = 90;
		if(grade>100 || grade < 0){
			System.out.println("�ɼ��������");
		}
		String result="";
		switch (grade/10) {
		case 10:
		case 9:
			result="�ɼ�����";
			break;
		case 8:
			result="�ɼ�����";
			break;
		case 7:
			result="�ɼ��е�";
			break;
		case 6:
			result="�ɼ�����";
			break;

		default:
			result="�ɼ�������";
			break;
		}		
		System.out.println(result);
	}
}
