/*
File: Lesson 5.6 - Parallel arrays
Author: Stephen Li
Date Created: May 6, 2026
Date Last Modified: May 7, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				return ages[i];
			}
		}
		return -1;
	}

	public static int[] createLengthArray(String[] array1) {
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i].length();
		}
		return array2;
	}

	public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i < names.length; i++) {
			if (index1 == -1 && names[i].equals(name1)) {
				index1 = i;
			}
			if (index2 == -1 && names[i].equals(name2)) {
				index2 = i;
			}
		}
		int temp1 = ages[index1];
		ages[index1] = ages[index2];
		ages[index2] = temp1;
		String temp2 = names[index1];
		names[index1] = names[index2];
		names[index2] = temp2;
	}
}
