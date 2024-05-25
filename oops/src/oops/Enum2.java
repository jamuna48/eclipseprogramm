package oops;
		enum exam{
TAMIL , ENGLISH , PHYSICS, MATHS , CHEMISTRY, BOTONY ,ZOOLOGY




}
public class Enum2 {

	public static void main(String[] args) {
	
		exam sub = exam.MATHS;
		/*if(sub== exam.MATHS) {
			System.out.println("4 /2/2024");}
		else if(sub ==exam.ENGLISH ){
			System.out.println("2/4/2024");}
		else {System.out.println("exam is postponded");*/
		switch (sub) {
		case TAMIL:
			System.out.println("good attempt");
			break;
		case ENGLISH:
			System.out.println("ITS OK");
			break;
		case MATHS:
			System.out.println("super");
			break;
			default:
				System.out.println("fail");
}
}
}