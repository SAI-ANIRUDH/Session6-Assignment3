package assignment6; //package is compulsory.
/*
 * Program to find the binary search using one dimensional array.
 */
public class Assignment6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyBinarySearch a = new MyBinarySearch(); // Instantiating the 	binary search class
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16}; // Declaring and initializing the variables of array variable arr.
	        System.out.println("Key 14's position: "+a.binarySearch(arr, 14));
	        int[] arr1 = {6,34,78,123,432,900}; // Declaring and initializing the variables of array variable arr1
	        System.out.println("Key 432's position: "+a.binarySearch(arr1, 432));
	}

}
 class MyBinarySearch{
	 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;// Declaring and initializing the start variable and declaring as 0
        int end = inputArr.length - 1;
        while (start <= end) { // Using the while loop to define the binary search
            int mid = (start + end) / 2; 
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}