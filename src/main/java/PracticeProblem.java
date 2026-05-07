/*
File: Lesson 5.6 - Parallel arrays
Author: Stephen Li
Date Created: May 6, 2026
Date Last Modified: May 7, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				return name;
			}
		}
		return name;
	}

	public static String createLengthArray(String[] array1) {
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			
		}
	}
}
