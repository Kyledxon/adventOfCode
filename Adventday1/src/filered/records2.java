package filered;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class records2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		ArrayList<Integer> totals = new ArrayList<Integer>();
		
		try {
			Scanner scanner = new Scanner(new File("input.txt"));
			
			while(scanner.hasNext() ) {
				
				
				
				leftList.add(scanner.nextInt());
				rightList.add(scanner.nextInt());
			}
			
			//check each number in the left list, and check how many times 
			//it occurs in the right list and multiply together. Then add for a sum
			System.out.println(leftList+"  :  "+rightList);
			int result = 0;
			int count;
			for(int leftCounter = 0; leftCounter < leftList.size(); leftCounter++) {
				count = 0;
				
				for(int i = 0; i < leftList.size(); i++) {
					if(leftList.get(leftCounter).equals(rightList.get(i))) {
						count ++;
					}
				}
				totals.add(count);
			}
			
			for(int i = 0; i < leftList.size(); i ++) {
				result += (leftList.get(i)*totals.get(i));
			}
			
			
			
			System.out.println("This is the result: "+result);
			scanner.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
