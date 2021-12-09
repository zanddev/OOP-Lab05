package it.unibo.oop.lab05.ex2;

import java.util.Comparator;
//import it.unibo.oop.lab05.ex5.Pair;

public class OrderedStringDoubleComparator implements Comparator<String> {

	@Override
	/**
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 * @param o1 the first string to compare, must be parse-able to double
	 * @param o2 the second string to compare, must be parse-able to double
	 * 
	 * @return 1 if o1 > o2, 0 if o2 == o1, -1 otherwise
	 * 
	 */
	public int compare(final String str1, final String str2) {
		
		//return this.compareDouble(Double.parseDouble(str1), Double.parseDouble(str2));
		return this.compareStrings(str1, str2);
	}
	/*
	private int compareDouble(double lValue, double rValue) {
		if (lValue > rValue) {
			return 1;
		}
		if (lValue < rValue) {
			return -1;
		}
		return 0;
	}
	*/
	/*
	private int numberOfSignificantDigits(String value) {
		
		return 0;
	}
	*/
	private int getLocationOfDot(String value) {
		
		if(value.contains(".")) {
			//return value.
			char sequence[] = value.toCharArray();
			int i = 0;
			
			for(char c : sequence) {
				if(c == '.') break;
				i++;
			}
			return i;
		} else {
			return -1;
		}
	}
	/*
	private int integerSize(String value) {
		int pos = getLocationOfDot(value);
		if(pos != -1) {
			return pos;
		} else {
			return value.length();
		}
	}
	
	private int decimalSize(String value) {
		int pos = getLocationOfDot(value);
		if(pos != -1) {
			return value.length() - pos;
		} else {
			return 0;
		}
	}
	
	private Pair<String,String> uniformValues(Pair<String,String> values) {
		return null;
		// TODO Auto-generated method stub
		
	}
	*/	
	
	/* If the strings have different lengths we'll pick the longest one as greatest value
	 * If them have the same length it will slide the respective positions on the strings
	 * and compare the value of each character to identify the string with greatest value
	**/
	private int compareStrings(String lValue, String rValue) {
		
		int len1 = lValue.length();
		//int len2 = rValue.length();

		int returnValue = 0;
		
		//System.out.println(this.integerSize(lValue));
		
		//Pair<String,String> passedValues = new Pair<>(lValue, rValue);
		//Pair<String,String> uniformedValues = this.uniformValues(passedValues);
		/*
		if(len1 > len2) {
			returnValue = 1;
		}
		if(len1 < len2) {
			returnValue = -1;
		}
		if(len1 == len2) {
		*/
		int dotPos1 = this.getLocationOfDot(lValue);
		int dotPos2 =this.getLocationOfDot(rValue);
		if(dotPos1 == dotPos2) {
			returnValue = 0;
			for(int i = dotPos1 + 1; i < len1; i++) {
				Character c1 = lValue.charAt(i);
				Character c2 = rValue.charAt(i);
				
				int value1 = Integer.parseInt(c1.toString());
				int value2 = Integer.parseInt(c2.toString());
				
				if(value1 > value2) {
					returnValue = 1;
					break;
				}
				if(value1 < value2) {
					returnValue = -1;
					break;
				}
			}
		}
		return returnValue;
	}
}
