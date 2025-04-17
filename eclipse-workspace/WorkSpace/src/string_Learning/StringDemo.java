package string_Learning;

public class StringDemo {

	public static void main(String[] args) {
		
		//reverseString();
		firstCharRepeatedOrNot();
		//changingToUppercase();
		//vowels();
		//printVowelsOnly();
		//countOfChar();
		//numbersOnlyPresentOr();
		//printOnlyNumbersInString();
		//numbersAndCharCount();
		String name="Robert";
		//System.out.println(name);
		String name2="robert james";
		//System.out.println(name.compareTo(name2));
	//	System.out.println(name2.substring(4));

	}

	private static void firstCharRepeatedOrNot() {
		//First Char Repeated Or Not
		//First Non Repeated Character
		String word="windowi";
for (int i = 0; i < word.length(); i++) 
{
		char ch=word.charAt(i);
		boolean repeat=false;
		for (int j= i+1; j< word.length(); j++) {
			if(ch==word.charAt(j))
			{
				 //System.out.println(ch +" Repeated ");
			     repeat=true;
			     break; 
			} 
//			else
//				System.out.println(word.charAt(i)+" is First Non repeated Character");
//			break;
		}
	if(repeat==false) 
	{
	    System.out.println(ch+" Not repeated");
		break;
	}
	}
}

	private static void changingToUppercase() {
		String word="learning";
		char[]ch=word.toCharArray();
		//ch[0]=(char)(ch[0]-32);       //TypeCasting //108-32=76----L
		//System.out.println(ch[0]);
		word=new String(ch);                //by new String 
		//System.out.println(word);   
//		for(int i=0;i<ch.length;i++) {
//			//System.out.print(ch[i]);
//		}
		String word2="DemOstring";
		char[]ch2=word2.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			if(i%2==0)
			{
				if(ch2[i]>='a')
					if(ch2[i]<='z')
				ch2[i]=(char)(ch2[i]-32); 	
			}
		}
		word2=new String(ch2);
		//System.out.println(word2);
		
	//--------Using Substring method-----------	
		String word3="hellOwoRld";
	//	System.out.println(word3.substring(0,1).toUpperCase()+ word3.substring(1));
		for (int i = 0; i < word3.length(); i++) {
			if(i%2==0)
				System.out.print(word3.substring(i,i+1).toUpperCase());
			else
			    System.out.print(word3.substring(i,i+1).toLowerCase());
		}
	}

	private static void reverseString() {
		//Reverse the String and storing it into Another String 
		String name="Mathivanan";
		String reverse="";
		for(int i=name.length();i>0;i--) {
			reverse+=name.charAt(i-1);
		}
		System.out.print(reverse);
		System.out.println();
		
		//Reverse the String
		for(int i=name.length();i>0;i--)
			System.out.print(name.charAt(i-1));
	}

	private static void numbersAndCharCount() {
		//Numbers count
		String word="Chennai 600042";
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='0')
				if(word.charAt(i)<='9')
					count++;
		}
		//System.out.println(count);
		
		//Regex
		System.out.println(word.replaceAll("[0-9]",""));
		
		//Character count
		String word2="Chennai 600042";
		int count2=0;
		for(int i=0;i<word2.length();i++) {
			if(word2.charAt(i)>='a')
				if(word2.charAt(i)<='z')
					count2++;
			if(word2.charAt(i)>='A')
				if(word2.charAt(i)<='Z')
					count2++;
		}
		System.out.println(count2);

		//Regex
		System.out.println(word.replaceAll("[0-9]",""));

		
	}

	private static void numbersOnlyPresentOr() {

		//Only Numbers or Alphabets in String 
		String word="Hello world123";
		int countNo=0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)>='0')
				if(word.charAt(i)<='9')
					countNo++;
				//	System.out.print(word.charAt(i));
		}
		System.out.println();
		if(countNo==word.length())
			System.out.println("Here only numbers are there");
		else
			System.out.println("No, SomeOther charaters are present");

	//Using Regex	
		String word3="23456";
		//String word4=word3.replaceAll("[0-9]", "");
		String word4=word3.replaceAll("a-zA-Z", "");
		if(word3.length()==word4.length())
			System.out.println("Only Numbers there");
		else
			System.out.println("Nop, Someothers here");
	}

	private static void printOnlyNumbersInString() {
		//print only numbers / alphabets in a String 
		String st="Hello 621315";
		 for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i)>='0')
				if(st.charAt(i)<='9') {
					//System.out.print(st.charAt(i));
				}
		}
		//or Using Regex
			//System.out.println(st.replaceAll("[a-zA-z]", ""));
			
			 String st2="Hello 621315";
		 for (int i = 0; i < st2.length(); i++) {
			if(st2.charAt(i)>='a')
			{
				if(st2.charAt(i)<='z') {
					System.out.println(st2.charAt(i));
			}
			}
				if(st2.charAt(i)>='A')
				{
				if(st2.charAt(i)<='Z') {
					System.out.println(st2.charAt(i));
				}
				}
		}
			System.out.println(st.replaceAll("[0-9]", ""));		 
	}

	private static void printVowelsOnly() {
//
//		String word="hearing";
//		String vowels="aeiou";
//		char printVowels = 0;
//		for(int i=0;i<vowels.length();i++) {
//			for(int j=0;j<word.length();j++) {
//			if(word.charAt(j)==vowels.charAt(i)) {
//				printVowels+=word.charAt(j);
//			}
//		}}
		
		    String word = "hearing";
		    String vowels = "aeiou";
		    StringBuilder printVowels = new StringBuilder();

		    for (int j = 0; j < word.length(); j++) {
		        if (vowels.indexOf(word.charAt(j)) != -1) { // Check if it's a vowel
		            printVowels.append(word.charAt(j));
		        }
		    }

		 //   System.out.println(printVowels.toString());
		    //or Using Switch Case 
		    String word3 = "hearing";
		   for(int i=0;i<word3.length();i++) { 
		    char c=word3.charAt(i);
		    switch(c) {
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':
		    	System.out.println(c);
		    }
		    }
		}

	private static void countOfChar() {
		//Count of first alpha char in String 
				String mess="abccab";
				char c=mess.charAt(0);
				int count=0;
				for(int i=0;i<mess.length();i++) {
					if(c==mess.charAt(i)) {
						count++;
					}
				}
			//	System.out.println(count);
		
	}

	private static void vowels() {

		//Count of Vowels
		
		String word="abcide";
		String word2="abaeiba";
		int count =0;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': count++;
			}
		}
		System.out.println("Count of vowels "+count);
		int count2 =0,countOfa=0;
		for(int i=0;i<word2.length();i++) {
			char c=word2.charAt(i);
			char la='a';
			if(la==word2.charAt(i)) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': countOfa++;
			}
		}}
		System.out.println("Count of a "+countOfa);
	}

}
