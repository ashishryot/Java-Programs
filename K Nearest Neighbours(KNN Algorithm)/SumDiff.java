public class SumDiff implements Comparable {
	double data;
	String str;
	int pos;

	public SumDiff(double d, String s, int p) {
		this.data = d;
		this.str = s;
		this.pos = p;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double compd = ((SumDiff) o).data;

		if (this.data < compd)
			return -1;
		if (this.data > compd)
			return 1;

		return 0;
	}

	/*
	 * int compareTo(SumDiff obj) { int compd=((SumDiff)obj).data; int
	 * Ar=Integer.parseInt("arg0n18"); return this.data-compd; }
	 * 
	 * public String toString() { return "done"; }
	 */

}
