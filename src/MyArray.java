
public class MyArray {

	public static int getSmallestElement(int[] array) {
		int najmanjiElemenat = 100;
			for(int i=0; i<array.length; i++) {
			if(array[i] < najmanjiElemenat) {
				najmanjiElemenat = array[i];
			}
		}
			return najmanjiElemenat;
	}
	
	public static int getLargestElement(int[] array) {
		int najveciElemenat = 0;
			for(int i=0; i<array.length; i++) {
			if(array[i] > najveciElemenat) {
				najveciElemenat = array[i];
			}
		}
			return najveciElemenat;
	}
	
	public static int sumAllElements(int[] array) {
		int suma = 0;
			for(int i=0; i<array.length; i++) {
				suma += array[i];
			}
			return suma;
	}
	
	public static void printAllElements(int[] array) {
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i] + " ");
			}
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println(getSmallestElement(array));
		System.out.println(getLargestElement(array));
		System.out.println(sumAllElements(array));
		printAllElements(array);
		

	}

}
