package Calendar03;

public class Copy {

		public static void main(String[] args) {
			//2021.04.14
			//#3. �޷� �μ� 
			int Y = 2021;    // year
	        int startDayOfMonth = 5;
	        int spaces = startDayOfMonth;

	        // startDayOfMonth

	        // months[i] = name of month i
	        String[] months = {
	                "",                               // leave empty so that we start with months[1] = "January"
	                "1��", "2��", "3��",
	                "4��", "5��", "6��",
	                "7��", "8��", "9��",
	                "10��", "11��", "12��"
	            };

	            // days[i] = number of days in month i
	            int[] days = {
	                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	            };

	            for (int M = 1; M <= 12; M++) {

	            // check for leap year

	            
	            // print calendar header
	            // Display the month and year
	            System.out.println("          "+ months[M] + " " + Y);

	            // Display the lines
	            System.out.println("_____________________________________");
	            System.out.println("   ��   ��    ȭ   ��    ��    ��   ��");

	            // spaces required
	               spaces = (days[M-1] + spaces)%7;
	            
	            // print the calendar
	            for (int i = 0; i < spaces; i++)
	                System.out.print("     ");
	            for (int i = 1; i <=days[M]; i++) {
	                System.out.printf(" %3d ", i);
	                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
	            }
	            
	            System.out.println();
	        }
	    	
		}

	}

