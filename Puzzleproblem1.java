package firstjava;

public class Puzzleproblem1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			
			y = x - y; //: ans:00 11 21 32 42
			
			//y = x + y;: ans:00 11 23 36 410
			
			//y = y + 2;
			//if ( y > 4) {
				//y = y - 1;: ans: 02 14 25 36 47
			//}
			
			//x = x + 1; ans:11 34 59
			//y = y + x;
			
			//if (y < 5) {
				//x = x + 1;   ans: 02 14 36 48
				//if (y < 3) {
					//x = x - 1;
				//}
			//}
			//y = y + 2;
			
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}
}
