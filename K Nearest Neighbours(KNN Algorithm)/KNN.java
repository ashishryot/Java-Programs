import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

class KNN {
	void solve_KNN() {
		int k = 5;
		int col = 0;
		try {
			ArrayList<File_data> f1 = new ArrayList<>();
			ArrayList<File_data> f2 = new ArrayList<>();

			PrintWriter writer;
			writer = new PrintWriter("answer.txt", "UTF-8");
			File file = new File("IM1_Training.txt");
			File file1 = new File("IM2_Testing.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			BufferedReader br2;
			String st, st1, st2;
			while ((st = br.readLine()) != null) {
				// System.out.println(st);
				String[] s = st.split(",");
				col = s.length;
				f1.add(new File_data(s));

			}
			br.close();
			// System.out.println(f1.get(2).rv[3]);

			while ((st1 = br1.readLine()) != null) {
				// System.out.println(st);
				String[] s = st1.split(",");
				// f2.add(new File_data(s[0],s[1],s[2],s[3]));
				f2.add(new File_data(s));
			}
			br1.close();
			// System.out.println(f2.get(2).rv[3]);

			// int diff;
			// System.out.println("diff");
			for (int i = 0; i < f2.size(); i++) {
				ArrayList<SumDiff> sd = new ArrayList<>();

				for (int j = 0; j < f1.size(); j++) {
					double diff = 0;
					for (int z = 0; z < col - 1; z++) {
						diff = diff + ((double) Math.abs(f1.get(j).rv[z] - f2.get(i).rv[z]));
					}
					// double diff=(double)
					// Math.abs(f1.get(j).rv1-f2.get(i).rv1)+(double)Math.abs(f1.get(j).rv2-f2.get(i).rv2)+
					// (double)Math.abs(f1.get(j).rv3-f2.get(i).rv3)+(double)Math.abs(f1.get(j).rv4-f2.get(i).rv4);

					sd.add(new SumDiff(diff, f1.get(j).rv5, j));

					// if(i==0)
					// System.out.println(diff);

				}
				Collections.sort(sd);
				// if(i==0) {
				// for(int j=0;j<f1.size();j++) {
				// System.out.println(" sorted: "+sd.get(j).data+" "+sd.get(j).str+" pos=
				// "+sd.get(j).pos);
				// }
				// }
				// System.out.println("Printing done");

				int t = 0, f = 0, x = 0;
				for (int j = 0; j < k; j++) {
					if ((sd.get(j).str).equals("Iris-setosa")) {
						t++;
					}
					if ((sd.get(j).str).equals("Iris-versicolor")) {
						f++;
					}
					if ((sd.get(j).str).equals("Iris-virginica")) {
						x++;
					}
				}
				// f2.get(i).print2();
				if (t > f && t > x) {
					// System.out.println("Iris-setosa");
					writer.println(f2.get(i).print2() + "Iris-setosa");
				}
				if (f > t && f > x) {
					// System.out.println("Iris-versicolor");
					writer.println(f2.get(i).print2() + "Iris-versicolor");
				}
				if (x > t && x > f) {
					// System.out.println("Iris-virginica");
					writer.println(f2.get(i).print2() + "Iris-virginica");
				}

			}
			writer.close();
			int count = 0;
			int i = 0;
			File file2 = new File("answer.txt");
			br2 = new BufferedReader(new FileReader(file2));
			while ((st2 = br2.readLine()) != null) {
				String[] s = st2.split(",");
				if (s[s.length - 1].equals(f2.get(i++).rv5)) {

				} else
					count++;
			}
			br2.close();
			System.out.println("Accuracy is: " + ((float) 100 - (((float) count / f2.size()) * 100)) + "%");
			// br2.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}