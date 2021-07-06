/*Breaking down a process into simpler processors is called "stepwise refinement".
In the example given, it is simpler to break the steps as follows,
	1.Write amount in number
	2.Write amount in words.*/
	
import java.util.Scanner;	
public class q2{
	public static void main(String[] args){
		String[] singles = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] doubles = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = new String[] {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] hundreds = new String[] {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
		String[] thousands = new String[] {"One thousand", "Two thousand", "Three thousand", "Four thousand", "Five thousand", "Six thousand", "Seven thousand", "Eighty thousand", "Nine thousand"};

		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int n = myscanner.nextInt();
		int i = 0;
		
		if (n >= 1000){
			i = n / 1000;
			i = i - 1;
			System.out.print(thousands[i] + " ");
			
			n = n%1000;
			i = n / 100;
			i = i - 1;
			System.out.print(hundreds[i] + " ");
			
			n = n%100;
			i = n / 10;
			i = i - 1;			
			if (i == 0){
				i = n % 10;
				System.out.print(doubles[i]);}
			else{
				System.out.print(tens[i] + " ");
				i = n % 10;
				i = i - 1;
				System.out.println(singles[i]);		
			}
		}
		else if(n >= 100){
			i = n / 100;
			i = i - 1;
			System.out.print(hundreds[i] + " ");
			
			n = n%100;
			i = n / 10;
			i = i - 1;			
			if (i == 0){
				i = n % 10;
				System.out.print(doubles[i]);}
			else{
				System.out.print(tens[i] + " ");
				i = n % 10;
				i = i - 1;
				System.out.println(singles[i]);					
			}
			
		}
		else if(n >= 10){
			i = n / 10;
			i = i - 1;			
			if (i == 0){
				i = n % 10;
				System.out.print(doubles[i]);}
			else{
				System.out.print(tens[i] + " ");
				i = n % 10;
				i = i - 1;
				System.out.println(singles[i]);					
			}
		}
		else{
			n = n -1;
			System.out.println(singles[n]);
		}
	}
}

				
				
				

		