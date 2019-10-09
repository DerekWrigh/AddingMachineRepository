/**
 * Derek Wright
 * Class ID: 70641
 * Assignment 2
 */
package cse360assign2;

import java.util.ArrayList;

public class AddingMachine 
{
	/**
	 * the cumulative total
	 */
	private int total;
	
	
	/**
	 * create an string array list to use in the too string method
	 */
	private ArrayList<String> history = new ArrayList<String>();
	
	
	/**
	 * the adding machine is initialized
	 */
	public void AddingMachine() 
	{
		total = 0;  // starts the total at 0 (initialization)
		history.add("0"); //used to start the history at zero (initialization)
	}
	
	/**
	 * gets the current total.
	 * @return total.
	 */
	public int getTotal() 
	{
		return total;
	}
	
	/**
	 * adds a value to the current total.
	 * @param value being added.
	 */
	public void add(int value) 
	{
		total = total + value;
		
		history.add(" + " + value);
	}
	
	/**
	 * subtracts a value to the current total.
	 * @param value being subtracted.
	 */
	public void subtract(int value) 
	{
		total = total - value;
		
		history.add(" - " + value);
	}
	
	/**
	 * makes a string of all the commands that were input (history).
	 * @return a string of elements from arraylist history.
	 */
	public String toString() 
	{
		// to be displayed
		String historyString = new String();
		
	    // Printing elements one by one 
        for (int index = 0; index < history.size(); index++) 
            historyString  = historyString.concat(history.get(index)); 
		
        //System.out.println(historyString);
        
		return historyString;
	}
	
	/**
	 * clears out the command list (history arraylist) and resets the total to 0.
	 */
	public void clear() 
	{
		total = 0;
		history.clear();
		
		history.add("0"); //adding initial 0 to beginning of history
	}
}