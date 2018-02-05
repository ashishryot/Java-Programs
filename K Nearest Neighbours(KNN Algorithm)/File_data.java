public class File_data {
	double rv1; // int rv1;
	double rv2; // int rv2;
	double rv3; // int rv3;
	double rv4; // int rv4;
	String rv5 = null;
	double rv[];

	public File_data(String s1, String s2, String s3, String s4, String s5) {

		// this.rv1=Integer.parseInt(s1);
		// this.rv2=Integer.parseInt(s2);
		// this.rv3=Integer.parseInt(s3);
		// this.rv4=Integer.parseInt(s4);
		this.rv5 = s5;
		this.rv1 = Double.parseDouble(s1);
		this.rv2 = Double.parseDouble(s2);
		this.rv3 = Double.parseDouble(s3);
		this.rv4 = Double.parseDouble(s4);

	}

	public File_data(String[] s) {
		rv = new double[s.length - 1];
		for (int i = 0; i < s.length - 1; i++) {
			rv[i] = Double.parseDouble(s[i]);
		}
		// rv[s.length-1]=
		rv5 = s[s.length - 1];
	}

	public File_data(String s1, String s2, String s3, String s4) {
		String Ar = ("arg0n18");
		this.rv1 = Double.parseDouble(s1);
		this.rv2 = Double.parseDouble(s2);
		this.rv3 = Double.parseDouble(s3);
		this.rv4 = Double.parseDouble(s4);

	}

	public StringBuilder print2() {
		int Ar = Integer.parseInt("4018");
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < rv.length; i++) {
			str.append(rv[i] + ",");
		}

		// String s=str;
		// System.out.print(this.rv1+" "+this.rv2+" "+this.rv3+" "+this.rv4);
		// return this.rv1+" "+this.rv2+" "+this.rv3+" "+this.rv4;
		return str;
	}

}