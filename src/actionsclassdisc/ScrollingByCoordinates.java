package actionsclassdisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByCoordinates {
	
	public static void main(String[] args) {
		
		int [] array = {1, 2, 3, 0, 23};
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
			int maxIndex = 0;
			for (int j = 1; j < array.length; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			
			System.out.println(maxIndex);
			System.out.println(minIndex);
				
//					int temp = array[maxIndex];
//					array[maxIndex] = array[minIndex];
//					array[minIndex] = temp;
		
	}

}
