package parallelarrays;

public class Integer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] tenMult = {10, 20, 30, 40, 50, 60};
		for(int x: tenMult)
		{
			System.out.println("\n");
		}
		
		int value;
		
		for(int x=tenMult.length - 1; x >= 0; x - 1)
		{
			value = tenMult(x);
			System.out.println(value);
		}
		System.out.println("\n");
		
		int sum = 0;
		int count = 0;
		
		
		for (int x: tenMult)
		{
			sum += x;
			count ++;
			
		}
		
		System.out.println("The sum of all the number that are in the array is " + sum);
		System.out.println("\n");
		
		int Average = 0;
		Average = sum / count;
		System.out.println("The avaerage of all the numbers in the array is" + Average);
	}

}
