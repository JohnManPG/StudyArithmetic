package StudyJava;
//循环获取目录
public class xunhuanchulimulu {

	public static void main(String[] args) {
		String str="C:\\Program Files\\Adobe\\Adobe Help\\HelpIcons";
		while(true)
		{
			System.out.println(str);
			int index=str.lastIndexOf("\\");
			str=str.substring(0, index);
			if(str.indexOf("\\")==-1){
				System.out.println(str);
				break;
			}			
		}
	}
}
