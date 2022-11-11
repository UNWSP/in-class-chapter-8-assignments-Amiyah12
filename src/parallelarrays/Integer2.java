package parallelarrays;

public class Integer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] ds= new double[4];
int k=0;
for (int i=0; i<ds.length; i++) {
	ds[i]=Math.pow(2,  i+1);
}

for (double x:ds) {
	System.out.println(x);
	System.out.println("");
	
}
System.out.print("\n");
for (int i=3;i>=0;i--) {
	System.out.print(ds[i]);
	System.out.print("");
}
	}

}
