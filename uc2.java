public class LineEqualityUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=1,x2=6,y1=1,y2=8;
		int p1=3,p2=2 ,q1=3,q2 =4;
		Double length1,length2;
		length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		length2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
		
		if(length1.equals(length2)) {
			System.out.println("both lines are equal");
		}
		else {
			System.out.print("Both lines are not equal");
		}
	}
}
		
	
        
