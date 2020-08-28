package yaksha;

import java.util.ArrayList;
import java.util.Scanner;

class MainClass {
	static int j = 0;

	public static String[] deleteAndMergeFruitLists(int m, ArrayList<String> al, int n, ArrayList<String> al1) {
		String a[] = new String[m + n];
		String mergedList[];
		int count = 0;
		for (int i = 0; i < m; i++) {
			String s1 = al.get(i);
			if (s1.charAt(s1.length() - 1) != 'a' && s1.charAt(s1.length() - 1) != 'e'
					&& s1.charAt(s1.length() - 1) != 'A' && s1.charAt(s1.length() - 1) != 'E') {
				a[j] = s1;
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			String s1 = al1.get(i);
			if (s1.charAt(0) != 'A' && s1.charAt(0) != 'M' && s1.charAt(0) != 'a' && s1.charAt(0) != 'm') {
				a[j] = s1;
				j++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null)
				count++;
		}
		mergedList = new String[count];
		for (int i = 0; i < count; i++) {
			mergedList[i] = a[i];
		}
		return mergedList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first ArrayList");
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		System.out.println("Enter fruit names");
		for (int i = 0; i < n; i++) {
			al.add(sc.next());
		}
		System.out.println("Enter size of second ArrayList");
		int n1 = sc.nextInt();
		System.out.println("Enter fruit names");
		for (int i = 0; i < n1; i++) {
			al1.add(sc.next());
		}
		FruitList fruitList = new FruitList(al, al1);
		String[] ans = MainClass.deleteAndMergeFruitLists(n, fruitList.getFruitList1(), n1, fruitList.getFruitList2());
		if (ans != null) {
			System.out.println("Merged fruitlist is");
			for (int i = 0; i < ans.length; i++)
				System.out.println(ans[i]);
		} else
			System.out.println("No fruit found");
		sc.close();
	}
}
