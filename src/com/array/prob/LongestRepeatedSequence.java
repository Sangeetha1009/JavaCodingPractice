package com.array.prob;

//public class LongestRepeatedSequence {
//
//	public static void main(String[] args) {
//		String input = "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1";
//		
//		int maxStart=-1;
//		int maxEnd=-1;
//		int maxLength=0;
//		
//				
//		int currentStart=0;
//		int currentLength=1;
//		
//		String[] arr=input.split(",");
//		
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]==arr[i-1]) {
//				currentStart++;
//			}else {
//				if(currentLength>maxLength) {
//					maxLength=currentLength;
//					maxStart=currentStart;
//					maxEnd=i-1;					
//				}
//				currentStart=i;
//				currentLength=0;
//			}
//		}
//		
//		if(currentLength>maxLength) {
//			maxLength=currentLength;
//			maxStart=currentStart;
//			maxEnd=input.length()-1;	
//		}
//		
//		System.out.println("Max repeated Sequence"+maxStart+"to"+maxEnd);
//
//	}
//
//}
public class LongestRepeatedSequence {
    public static void main(String[] args) {
        String input = "1,1,2,2,3,4,7,8,9,1,2,2,2,2,2,2";
        int[] range = findLongestRepeatedRange(input);
        
        if (range[0] != -1 && range[1] != -1) {
            System.out.println("Answer: " + range[0] + "," + range[1]);
        } else {
            System.out.println("No repeated numbers found.");
        }
    }

    public static int[] findLongestRepeatedRange(String input) {
        String[] numbers = input.split(",");
        int maxStart = -1;
        int maxEnd = -1;
        int maxLength = 0;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].equals(numbers[i - 1])) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                    maxEnd = i - 1;
                }
                currentStart = i;
                currentLength = 1;
            }
        }

        // Check the last sequence
//        if (currentLength > maxLength) {
//            maxLength = currentLength;
//            maxStart = currentStart;
//            maxEnd = numbers.length - 1;
//        }

        return new int[]{maxStart, maxEnd};
    }
}

