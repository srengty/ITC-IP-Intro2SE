package lab05;

import lab05.tasks.Subject;

public class App {
	public static void main(String[] args) {
		Subject se = new Subject("Intro to SE", 1, 3);
		System.out.println(se.getSubjectName());
		Subject se2 = new Subject();
	}
}
