import java.util.*;
class Rngclass {

	public static int main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
		
		System.out.print("Enter an lower bound: ");
		int low = (int) scan.nextDouble();
		System.out.print("Enter an upper bound: ");
		int high = (int) scan.nextDouble();
		
		int output = low + rng.nextInt(high - low);
		return output;
	}

}
