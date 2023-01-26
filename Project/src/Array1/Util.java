package Array1;

import java.util.Scanner;

public class Util {
	public String Sysout(String St) {
		String Name = "";
		Scanner sc=new Scanner(System.in);
		System.out.printf(St+"입력 : ");
		Name=sc.nextLine();
		return Name;
	}


}
