
class calculate{
	
	int LengthCalc(int x1,int x2,int y1,int y2,int p1,int p2,int q1,int q2) {
	Double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	Double length2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
	return(length1.compareTo(length2));
	}
}

 public class LineComparisonOOP extends calculate{

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		LineComparisonOOP o = new LineComparisonOOP();
			int result = o.LengthCalc(2,7,4,3,1,3,5,8);
			
			if(result>0) {
				System.out.println("line1 is greater");
			}
			else if(result<0) {
				System.out.print("line2 is greater");
			}
			else {
				System.out.print("Both Lines are equal");
			}
		}

	}
