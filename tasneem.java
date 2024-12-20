import java.util.Scanner;
import java.time.LocalDate;

class marksheet {
	static String[] supp_sem2;

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int s2_count = 0;

		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Roll no. : ");
		int roll = sc.nextInt();
		// String[] supp_sem2 = new String[s2_count + 1];
		// static String[] supp_sem2;

		LocalDate date = LocalDate.now();
		String[] sub2 = { "Windows & MS Office", "Programming in C " };
		String[] sub1 = { "Entrepreneurship ", "Computers & IT   ", "Discrete Mathematic" };
		String[] p_sub = { "Windows & MS Office[P]", "Programming in C[P]" };
		String[] s2_sub2 = { "OOPs with C++      ", "Internet programming" };
		String[] s2_sub1 = { "Hindi Bhasha Sanrachna", "Digital Computer Org", "Operating Systems" };
		String[] s2_psub = { "OOPs with C++[P]   ", "Internet programming[P]" };
		String[] s3_sub2 = { "Data Structure  ", "Programming with JAVA" };
		String[] s3_sub1 = { "English & Scientific Temper", "Database Management System ", "Computer Networks  " };
		String[] s3_psub = { "Data Structure  ", "Programming with JAVA" };
		int[] s_marks2 = new int[2];
		int[] s_marks1 = new int[3];
		int[] ps_marks2 = new int[2];

		// System.out.println("Enter D.O.B : ");
		// String dob = sc.nextLine();

		// --------------------------------------

		String[] sub2_result = new String[2];
		String[] sub1_result = new String[3];
		String[] ps_result = new String[2];

		do {
			for (int i = 0; i < sub2.length; i++) {
				System.out.println("\nEnter marks of " + sub2[i] + " out of 80");
				s_marks2[i] = sc.nextInt();

			}
			for (int i = 0; i < sub1.length; i++) {
				System.out.println("Enter marks of " + sub1[i] + " out of 100");
				s_marks1[i] = sc.nextInt();

			}
			System.out.println("Practical Subjects: ");
			for (int i = 0; i < p_sub.length; i++) {
				System.out.println("Enter marks of " + p_sub[i] + " out of 20");
				ps_marks2[i] = sc.nextInt();

			}
			System.out.println("\t\t\tRabinath Tagore University");
			System.out.println("\t\t\t  BCA 1st Year Samester");
			System.out.print("\nName : " + name);
			System.out.println("\t\t\t\t\tRoll No. : " + roll);
			System.out.print("D.O.B : " + "24-02-2005");
			System.out.println("\t\t\t\tDate : " + date);
			System.out.println();
			int sub2_total = 0, sub1_total = 0, p_total = 0, s_count = 0;
			// String[] sub2_result = new String[2];
			// String[] sub1_result = new String[3];
			// String[] ps_result = new String[2];

			for (int i = 0; i < sub2.length; i++) {
				sub2_total += s_marks2[i];
				if (s_marks2[i] <= 27) {
					System.out.println(sub2[i] + "\t\t\t\t" + s_marks2[i] + "/80   Supplement");
					sub2_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(sub2[i] + "\t\t\t\t" + s_marks2[i] + "/80");
					sub2_result[i] = "pass";
				}
			}

			for (int i = 0; i < sub1.length; i++) {
				sub1_total += s_marks1[i];
				if (s_marks1[i] <= 33) {
					System.out.println(sub1[i] + "\t\t\t\t" + s_marks1[i] + "/100  Supplement");
					sub1_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(sub1[i] + "\t\t\t\t" + s_marks1[i] + "/100");
					sub1_result[i] = "pass";
				}

			}

			for (int i = 0; i < p_sub.length; i++) {
				p_total += ps_marks2[i];
				if (ps_marks2[i] <= 8) {
					System.out.println(p_sub[i] + "\t\t\t\t" + ps_marks2[i] + "/20   Supplement");
					ps_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(p_sub[i] + "\t\t\t\t" + ps_marks2[i] + "/20");
					ps_result[i] = "pass";
				}

			}
			int total = sub2_total + sub1_total + p_total;
			float percentage = (total * 100) / 500;
			System.out.print("\nTotal = " + total);

			if (s_count == 0) {
				System.out.println("\t\t\tResult = PASS");
			} else if (s_count <= 2) {
				System.out.println("\t\t\tResult = Supplement");
			} else {
				System.out.println("\t\t\tResult = FAIL");
			}

			System.out.println("Percentage = " + percentage + "%");
			System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");

			/*** ******************** 2nd SEMESTER******************* ***/

			// String[] s2_sub2 = {"OOPs with C++ ", "Internet programming"};
			// String[] s2_sub1 ={"Hindi Bhasha Sanrachna", "Digital Computer
			// Org","Operating Systems"};
			// // String[] supp_sem2 = new String[0];

			// String[] s2_psub = {"OOPs with C++[P] ", "Internet programming[P]"};
			String[] supp_sem1 = new String[s_count];
			int[] s2_s2marks2 = new int[2];
			int[] s_s1marks1 = new int[3];
			int[] s2_pmarks2 = new int[2];

			System.out.println("\n\n");
			int n = 0;
			/*** *******************STORING SUPPLEMENTARY SUBJECTS************** ***/
			for (int i = 0; i < sub2_result.length; i++) {
				if (sub2_result[i] == "fail") {
					supp_sem1[n] = sub2[i];
					n++;
				}
			}
			for (int i = 0; i < sub1_result.length; i++) {
				if (sub1_result[i] == "fail") {
					supp_sem1[n] = sub1[i];
					n++;
				}
			}
			for (int i = 0; i < ps_result.length; i++) {
				if (ps_result[i] == "fail") {
					supp_sem1[n] = p_sub[i];
					n++;
				}
			}

			/**** *************INPUT OF SEMESTER 2 SUBJECTS**************** ****/

			int[] supp_sem1_marks = new int[supp_sem1.length];

			for (int i = 0; i < supp_sem1_marks.length; i++) {
				System.out.println("Enter marks of " + supp_sem1[i]);
				supp_sem1_marks[i] = sc.nextInt();
			}

			for (int i = 0; i < s2_sub2.length; i++) {
				System.out.println("Enter marks of " + s2_sub2[i] + " out of 80");
				s2_s2marks2[i] = sc.nextInt();

			}
			for (int i = 0; i < s2_sub1.length; i++) {
				System.out.println("Enter marks of " + s2_sub1[i] + " out of 100");
				s_s1marks1[i] = sc.nextInt();

			}
			System.out.println("Practical Subjects: ");
			for (int i = 0; i < s2_psub.length; i++) {
				System.out.println("Enter marks of " + s2_psub[i] + " out of 20");
				s2_pmarks2[i] = sc.nextInt();

			}
			System.out.println();
			System.out.println("\n\n\n\t\t\tRabinath Tagore University");
			System.out.println("\t\t\t  BCA 2st Year Samester");
			System.out.print("\nName : " + name);
			System.out.println("\t\t\t\t\tRoll No. : " + roll);
			System.out.print("D.O.B : " + "24-02-2005");
			System.out.println("\t\t\t\tDate : " + date);
			System.out.println();

			int s2_sub2_total = 0, s2_sub1_total = 0, s2_ptotal = 0, k = 0;
			String[] s2_sub2_result = new String[2];
			String[] s2_sub1_result = new String[3];
			String[] s2_ps_result = new String[2];
			String[] s1_supp_result = new String[s_count];

			/*** ***************PRINTING SUPPLEMENTARY SUBJECTS****************** ***/
			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < sub2.length; j++) {
					if (supp_sem1[i] == sub2[j]) {
						if (supp_sem1_marks[i] <= 27) {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/80  Supplement");
							s2_count++;
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/80");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}
					}
				}
			}
			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < sub1.length; j++) {
					if (supp_sem1[i] == sub1[j]) {
						if (supp_sem1_marks[i] <= 33) {
							s2_count++;
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/100  Supplement");
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/100");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}
					}
				}
			}

			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < p_sub.length; j++) {
					if (supp_sem1[i] == p_sub[j]) {
						if (supp_sem1_marks[i] <= 8) {
							s2_count++;
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/20  Supplement");
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/20");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}

					}
				}
			}

			/*** ******************PRINTING 2nd SEMESTER SUBJECTS****************** ***/
			for (int i = 0; i < s2_sub2.length; i++) {
				s2_sub2_total += s2_s2marks2[i];
				if (s2_s2marks2[i] <= 27) {
					System.out.println(s2_sub2[i] + "\t\t\t\t" + s2_s2marks2[i] + "/80   Supplement");
					s2_sub2_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_sub2[i] + "\t\t\t\t" + s2_s2marks2[i] + "/80");
					s2_sub2_result[i] = "pass";
				}
			}

			for (int i = 0; i < s2_sub1.length; i++) {
				s2_sub1_total += s_s1marks1[i];
				if (s_s1marks1[i] <= 33) {
					System.out.println(s2_sub1[i] + "\t\t\t\t" + s_s1marks1[i] + "/100  Supplement");
					s2_sub1_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_sub1[i] + "\t\t\t\t" + s_s1marks1[i] + "/100");
					s2_sub1_result[i] = "pass";
				}

			}

			for (int i = 0; i < s2_psub.length; i++) {
				s2_ptotal += s2_pmarks2[i];
				if (s2_pmarks2[i] <= 8) {
					System.out.println(s2_psub[i] + "\t\t\t\t" + s2_pmarks2[i] + "/20   Supplement");
					s2_ps_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_psub[i] + "\t\t\t\t" + s2_pmarks2[i] + "/20");
					s2_ps_result[i] = "pass";
				}

			}

			int s2_m_total = s2_sub2_total + s2_sub1_total + s2_ptotal;
			float s2_percentage = (s2_m_total * 100) / 500;
			System.out.println("\nTotal = " + s2_m_total);
			System.out.println("Percentage = " + s2_percentage + "%");

			supp_sem2 = new String[s2_count];
			if (s2_count == 0) {
				System.out.println("\t\t\tResult = PASS");
				System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");
			} else if (s2_count <= 2) {
				System.out.println("\t\t\tResult = Supplement");
				System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");
			} else {
				System.out.println("\t\t\tResult = FAIL");
				System.out.println("\n\t\tYOU HAVE TO REPEAT THIS YEAR");
			}

			/***
			 * **************STORING SUPPLEMENTERY SUBJECT OF 2nd SEMESTER**************
			 */
			// String[] supp_sem2 = new String[s2_count];
			int s = 0;
			System.out.println("Total Supplies = " + s2_count);
			for (int i = 0; i < s1_supp_result.length; i++) {
				if (s1_supp_result[i] == "fail") {
					supp_sem2[s] = supp_sem1[i];
					s++;
				}
			}
			for (int i = 0; i < s2_sub2_result.length; i++) {
				if (s2_sub2_result[i] == "fail") {
					supp_sem2[s] = s2_sub2[i];
					s++;
				}
			}
			for (int i = 0; i < s2_sub1_result.length; i++) {
				if (s2_sub1_result[i] == "fail") {
					supp_sem2[s] = s2_sub1[i];
					s++;
				}
			}
			for (int i = 0; i < s2_ps_result.length; i++) {
				if (s2_ps_result[i] == "fail") {
					supp_sem2[s] = s2_psub[i];
					s++;
				}
			}

		} while (s2_count > 2);

		/************************** 3 & 4 SEMESTER******************************* */
		do {
			int[] supp_sem2_marks = new int[supp_sem2.length];
			for (int i = 0; i < supp_sem2.length; i++) {
				System.out.println("\nEnter marks of " + supp_sem2[i]);
				supp_sem2_marks[i] = sc.nextInt();
			}
			for (int i = 0; i < sub2.length; i++) {
				System.out.println("\nEnter marks of " + sub2[i] + " out of 80");
				s_marks2[i] = sc.nextInt();

			}
			for (int i = 0; i < sub1.length; i++) {
				System.out.println("Enter marks of " + sub1[i] + " out of 100");
				s_marks1[i] = sc.nextInt();
			}
			System.out.println("Practical Subjects: ");
			for (int i = 0; i < p_sub.length; i++) {
				System.out.println("Enter marks of " + p_sub[i] + " out of 20");
				ps_marks2[i] = sc.nextInt();

			}
			System.out.println("\t\t\tRabinath Tagore University");
			System.out.println("\t\t\t  BCA 3rd Semester");
			System.out.print("\nName : " + name);
			System.out.println("\t\t\t\t\tRoll No. : " + roll);
			System.out.print("D.O.B : " + "24-02-2005");
			System.out.println("\t\t\t\tDate : " + date);
			System.out.println();
			int sub2_total = 0, sub1_total = 0, p_total = 0, s_count = 0;
			// String[] sub2_result = new String[2];
			// String[] sub1_result = new String[3];
			// String[] ps_result = new String[2];

			for (int i = 0; i < sub2.length; i++) {
				sub2_total += s_marks2[i];
				if (s_marks2[i] <= 27) {
					System.out.println(sub2[i] + "\t\t\t\t" + s_marks2[i] + "/80   Supplement");
					sub2_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(sub2[i] + "\t\t\t\t" + s_marks2[i] + "/80");
					sub2_result[i] = "pass";
				}
			}

			for (int i = 0; i < sub1.length; i++) {
				sub1_total += s_marks1[i];
				if (s_marks1[i] <= 33) {
					System.out.println(sub1[i] + "\t\t\t\t" + s_marks1[i] + "/100  Supplement");
					sub1_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(sub1[i] + "\t\t\t\t" + s_marks1[i] + "/100");
					sub1_result[i] = "pass";
				}

			}

			for (int i = 0; i < p_sub.length; i++) {
				p_total += ps_marks2[i];
				if (ps_marks2[i] <= 8) {
					System.out.println(p_sub[i] + "\t\t\t\t" + ps_marks2[i] + "/20   Supplement");
					ps_result[i] = "fail";
					s_count++;
				} else {
					System.out.println(p_sub[i] + "\t\t\t\t" + ps_marks2[i] + "/20");
					ps_result[i] = "pass";
				}

			}
			int total = sub2_total + sub1_total + p_total;
			float percentage = (total * 100) / 500;
			System.out.print("\nTotal = " + total);

			if (s_count == 0) {
				System.out.println("\t\t\tResult = PASS");
			} else if (s_count <= 2) {
				System.out.println("\t\t\tResult = Supplement");
			} else {
				System.out.println("\t\t\tResult = FAIL");
			}

			System.out.println("Percentage = " + percentage + "%");
			System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");

			/*** ******************** 4nd SEMESTER******************* ***/

			String[] s2_sub2 = { "OOPs with C++      ", "Internet programming" };
			String[] s2_sub1 = { "Hindi Bhasha Sanrachna", "Digital Computer Org", "Operating Systems" };
			String[] supp_sem2 = new String[0];

			String[] s2_psub = { "OOPs with C++[P]   ", "Internet programming[P]" };
			String[] supp_sem1 = new String[s_count];
			int[] s2_s2marks2 = new int[2];
			int[] s_s1marks1 = new int[3];
			int[] s2_pmarks2 = new int[2];

			System.out.println("\n\n");
			int n = 0;
			/*** *******************STORING SUPPLEMENTARY SUBJECTS************** ***/
			for (int i = 0; i < sub2_result.length; i++) {
				if (sub2_result[i] == "fail") {
					supp_sem1[n] = sub2[i];
					n++;
				}
			}
			for (int i = 0; i < sub1_result.length; i++) {
				if (sub1_result[i] == "fail") {
					supp_sem1[n] = sub1[i];
					n++;
				}
			}
			for (int i = 0; i < ps_result.length; i++) {
				if (ps_result[i] == "fail") {
					supp_sem1[n] = p_sub[i];
					n++;
				}
			}

			/**** *************INPUT OF SEMESTER 4 SUBJECTS**************** ****/

			int[] supp_sem1_marks = new int[supp_sem1.length];

			for (int i = 0; i < supp_sem1_marks.length; i++) {
				System.out.println("Enter marks of " + supp_sem1[i]);
				supp_sem1_marks[i] = sc.nextInt();
			}

			for (int i = 0; i < s2_sub2.length; i++) {
				System.out.println("Enter marks of " + s2_sub2[i] + " out of 80");
				s2_s2marks2[i] = sc.nextInt();

			}
			for (int i = 0; i < s2_sub1.length; i++) {
				System.out.println("Enter marks of " + s2_sub1[i] + " out of 100");
				s_s1marks1[i] = sc.nextInt();

			}
			System.out.println("Practical Subjects: ");
			for (int i = 0; i < s2_psub.length; i++) {
				System.out.println("Enter marks of " + s2_psub[i] + " out of 20");
				s2_pmarks2[i] = sc.nextInt();

			}
			System.out.println();
			System.out.println("\n\n\n\t\t\tRabinath Tagore University");
			System.out.println("\t\t\t\t  BCA 4rd Semester");
			System.out.print("\nName : " + name);
			System.out.println("\t\t\t\t\tRoll No. : " + roll);
			System.out.print("D.O.B : " + "24-02-2005");
			System.out.println("\t\t\t\tDate : " + date);
			System.out.println();

			int s2_sub2_total = 0, s2_sub1_total = 0, s2_ptotal = 0, k = 0;
			String[] s2_sub2_result = new String[2];
			String[] s2_sub1_result = new String[3];
			String[] s2_ps_result = new String[2];
			String[] s1_supp_result = new String[s_count];

			/*** ***************PRINTING SUPPLEMENTARY SUBJECTS****************** ***/
			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < sub2.length; j++) {
					if (supp_sem1[i] == sub2[j]) {
						if (supp_sem1_marks[i] <= 27) {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/80  Supplement");
							s2_count++;
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/80");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}
					}
				}
			}
			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < sub1.length; j++) {
					if (supp_sem1[i] == sub1[j]) {
						if (supp_sem1_marks[i] <= 33) {
							s2_count++;
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/100  Supplement");
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/100");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}
					}
				}
			}

			for (int i = 0; i < supp_sem1.length; i++) {
				for (int j = 0; j < p_sub.length; j++) {
					if (supp_sem1[i] == p_sub[j]) {
						if (supp_sem1_marks[i] <= 8) {
							s2_count++;
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/20  Supplement");
							s1_supp_result[k] = "fail";
							k++;
							break;
						} else {
							System.out.println(supp_sem1[i] + "\t\t\t\t" + supp_sem1_marks[i] + "/20");
							s1_supp_result[k] = "pass";
							k++;
							break;
						}

					}
				}
			}

			/*** ******************PRINTING 4nd SEMESTER SUBJECTS****************** ***/
			for (int i = 0; i < s2_sub2.length; i++) {
				s2_sub2_total += s2_s2marks2[i];
				if (s2_s2marks2[i] <= 27) {
					System.out.println(s2_sub2[i] + "\t\t\t\t" + s2_s2marks2[i] + "/80   Supplement");
					s2_sub2_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_sub2[i] + "\t\t\t\t" + s2_s2marks2[i] + "/80");
					s2_sub2_result[i] = "pass";
				}
			}

			for (int i = 0; i < s2_sub1.length; i++) {
				s2_sub1_total += s_s1marks1[i];
				if (s_s1marks1[i] <= 33) {
					System.out.println(s2_sub1[i] + "\t\t\t\t" + s_s1marks1[i] + "/100  Supplement");
					s2_sub1_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_sub1[i] + "\t\t\t\t" + s_s1marks1[i] + "/100");
					s2_sub1_result[i] = "pass";
				}

			}

			for (int i = 0; i < s2_psub.length; i++) {
				s2_ptotal += s2_pmarks2[i];
				if (s2_pmarks2[i] <= 8) {
					System.out.println(s2_psub[i] + "\t\t\t\t" + s2_pmarks2[i] + "/20   Supplement");
					s2_ps_result[i] = "fail";
					s2_count++;
				} else {
					System.out.println(s2_psub[i] + "\t\t\t\t" + s2_pmarks2[i] + "/20");
					s2_ps_result[i] = "pass";
				}

			}

			int s2_m_total = s2_sub2_total + s2_sub1_total + s2_ptotal;
			float s2_percentage = (s2_m_total * 100) / 500;
			System.out.println("\nTotal = " + s2_m_total);
			System.out.println("Percentage = " + s2_percentage + "%");

			supp_sem2 = new String[s2_count];
			if (s2_count == 0) {
				System.out.println("\t\t\tResult = PASS");
				System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");
			} else if (s2_count <= 2) {
				System.out.println("\t\t\tResult = Supplement");
				System.out.println("\n\t\tYOU ARE PROMOTED TO NEXT SEMSTER");
			} else {
				System.out.println("\t\t\tResult = FAIL");
				System.out.println("\n\t\tYOU HAVE TO REPEAT THIS YEAR");
			}

			/***
			 * **************STORING SUPPLEMENTERY SUBJECT OF 2nd SEMESTER**************
			 */
			// String[] supp_sem2 = new String[s2_count];
			int s = 0;
			System.out.println("Total Supplies = " + s2_count);
			for (int i = 0; i < s1_supp_result.length; i++) {
				if (s1_supp_result[i] == "fail") {
					supp_sem2[s] = supp_sem1[i];
					s++;
				}
			}
			for (int i = 0; i < s2_sub2_result.length; i++) {
				if (s2_sub2_result[i] == "fail") {
					supp_sem2[s] = s2_sub2[i];
					s++;
				}
			}
			for (int i = 0; i < s2_sub1_result.length; i++) {
				if (s2_sub1_result[i] == "fail") {
					supp_sem2[s] = s2_sub1[i];
					s++;
				}
			}
			for (int i = 0; i < s2_ps_result.length; i++) {
				if (s2_ps_result[i] == "fail") {
					supp_sem2[s] = s2_psub[i];
					s++;
				}
			}

		} while (s2_count > 2);

	}
}
