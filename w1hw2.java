package m3w1HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class w1hw2 {
	
	
	public static void main(String[] args) {
		//	Write a Java program to copy one array list into another
		ArrayList<String> anime = new ArrayList<>();
		anime.add("BnHA");
		anime.add("Fairy Tail");
		anime.add("Jujutsu Kaisen");
		System.out.println(anime);
		
		ArrayList<String> anime2 = new ArrayList<>();
		anime2.add("Demon Slayer");
		anime2.add("Yu-Yu Hakusho");
		System.out.println(anime2);
		
		
		ArrayList<String> anime3 = new ArrayList<>();
		anime3.add("JoJo");
		anime3.addAll(anime);
		anime3.addAll(anime2);
		System.out.println(anime3);
		
//		 Write a Java program to extract a portion of an array list
		List<String> extract = anime3.subList(2, 5);
		System.out.println("The original " + anime3);
		System.out.println("This is the extracted " + extract);
				
//			Write a Java program to swap two elements in an array list
		Collections.swap(anime3, 2, 5);
		System.out.println("The Swap: " + anime3);
		

//			Write a Java program to test if an array list is empty or not
		System.out.println(anime.isEmpty()); //returns false bc it is not empty

//			Write a Java program to replace the second element of an ArrayList with the specified element.
		System.out.println("Original element: " + anime);
		anime.set(2, "Naruto");
		System.out.println("The replaced element: " + anime);
		

//			Write a Java program to trim the capacity of an array list the current list size
		ArrayList<String> anime4 = new ArrayList<>();
		anime4.add("Gekkan Shoujo Nozaki-kun");
		anime4.addAll(Arrays.asList("Test", "Another", "Anime", "Love Live"));
		System.out.println("Original array: " + anime4);
		anime4.trimToSize();
		System.out.println(anime4);
		
		
		//HUNGRY FOR MORE
		
//			 Write a Java program to test if a hash set is empty or not.
		
//			Write a Java program to get the number of elements in a hash set
		
//			Write a Java program to iterate through all elements in a hash list.
		
//			Write a Java program to convert a hash set to an array.
		
//			Write a Java program to compare two sets and retain elements that are the same on both sets.
		
		
	}

	private static char[] trimArrayList(ArrayList<String> anime2) {
		// TODO Auto-generated method stub
		return null;
	}

}
