package jamuna2project;
//array
public class multidimension {
	public static void main(String[]args) {
		int [][] p = {{ 1,2,4},{4,5,6},{5,6,7}};
		p[0][2] = 7;
		System.out.println(p[0][2]);
		int i = 0;
		for (i = 0 ; i<p.length; i++) {
			for (int j = 0; j<p[i].length; j++) {
				System.out.println(p[i][j] + " ");
			}
		}
		
	
		
			 }
			 
} 
			
		
		
