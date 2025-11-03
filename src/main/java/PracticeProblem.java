public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void insertionSort(char[] characters) {
		for(int i = 1; i < characters.length; i++) {
			char key = characters[i];
			int index = i -1;

			while (index >= 0 && (Character.toLowerCase(characters[index]) > Character.toLowerCase(key) || (Character.toLowerCase(characters[index]) == Character.toLowerCase(key) && characters[index] > key))) {
				characters[index + 1] = characters[index];
				index--;
			}
			characters[index + 1] = key;
		}
	}

}
