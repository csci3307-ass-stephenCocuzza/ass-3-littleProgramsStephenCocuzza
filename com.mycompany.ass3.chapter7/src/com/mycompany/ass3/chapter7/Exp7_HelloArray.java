package com.mycompany.ass3.chapter7;
import java.util.Arrays;

public class Exp7_HelloArrayList {

	

	public class MainEntry {

		public static class SomeClass {
			private String name;
			public SomeClass(String _name) {
				name = _name;
			}
			@Override
			public String toString() {
				return "name:" + name;
			}
		}
		
		public static void main(String[] args) {
			// 2 ways to declare an array variable
			int[] intArray1;
			int   intArray2[];

			
			
			intArray1 = new int[3];		
			intArray2 = new int[10];	// CORRECT

			
			
			int[] intArray3 = new int[5];
			
			
			intArray1[0] = 101;
			intArray1[1] = 102;
			intArray1[2] = 103;
			//
			for (int i = 0; i < 10; i++) {
				intArray2[i] = 201 + i;
			}
			
		
			Float[] floatArray = {301f, 302f, 303f, 304f, 305f};

			// One can have array of primitives or Classes (i.e objects)
			int[] 		intArray4 = {401,402};
			Integer 	integerArray[];
			SomeClass[] someClassArray = {new SomeClass("one"), new SomeClass("two")};
			
			System.out.println("intArray1 print the memory address:" + intArray1);						
			System.out.println("intArray1 print via Arrays.toString:" + Arrays.toString(intArray1));	
			System.out.println("floatArray print via Arrays.toString:" + Arrays.toString(floatArray));	
			System.out.println("someClassArray via Arrays.toString:" + Arrays.toString(someClassArray));	
		
			String[] names = {"ilker", "john"};
			System.out.println("BEFORE names:" + Arrays.toString(names));	
			strArrayPassedByReference(names);
			System.out.println("AFTER names:" + Arrays.toString(names));		
			
			System.out.println("BEFORE names:" + Arrays.toString(names));	// prints; [ilkerMR, johnMR]
			strArrayPassedByReference_WRONG(names);
			System.out.println("AFTER names still same as before:" + Arrays.toString(names));		// prints; [ilkerMR, johnMR]
			
			// multi dimensional arrays
			// declare and create(alloc memory) for 2D array
			int twoDimensionalIntArray[][] = new int[2][3];
			twoDimensionalIntArray[0] = new int[3];
			// set values of elements of 0th array element of 2D array
			twoDimensionalIntArray[0][0] = 10;
			twoDimensionalIntArray[0][1] = 20;
			twoDimensionalIntArray[0][2] = 30;
			// set value of 1st array element of 2D array
			int[] intArray5 = {100,200,300};
			twoDimensionalIntArray[1] = intArray5;
			System.out.println("twoDimensionalIntArray is " + Arrays.deepToString(twoDimensionalIntArray));	// NOTE using "Arrays.deepToString" for multi dimensional array. Prints [[10, 20, 30], [100, 200, 300]]

			// NOTE ilker foreach loop below
			String[] spanishNumbers = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
			for (String spanishNumber : spanishNumbers) {
				System.out.println("spanishNumber:" + spanishNumber);
			}
			
			// NOTE ilker below using "variable number of inputs"
			double averageOfNumbers = average(1, 2, 3, 4, 5);
			System.out.println("averageOfNumbers:" + averageOfNumbers);
		}
		
		private static void strArrayPassedByReference(String[] _names) {
			for (int i = 0; i < _names.length; i++) {
				_names[i] += "MR";
			}
		}

		private static void strArrayPassedByReference_WRONG(String[] _names) {
			_names = new String[_names.length];
			for (int i = 0; i < _names.length; i++) {
				_names[i] += "DR";
			}
		}
		
		
		public static double average(double ... numbers) {
			double total = 0d;
			
			for (double number : numbers) {
				total += number;
			}
			
			return total / numbers.length;
		}
		
	}
