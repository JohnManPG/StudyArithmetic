package StudyJava;
//判断成绩，巧妙的解题方法是：使用除法将范围变小
public class panduanchengji {

	public static void main(String[] args) {
		int grade = 90;
		if(grade>100 || grade < 0){
			System.out.println("成绩输入错误");
		}
		String result="";
		switch (grade/10) {
		case 10:
		case 9:
			result="成绩优秀";
			break;
		case 8:
			result="成绩良好";
			break;
		case 7:
			result="成绩中等";
			break;
		case 6:
			result="成绩及格";
			break;

		default:
			result="成绩不及格";
			break;
		}		
		System.out.println(result);
	}
}
