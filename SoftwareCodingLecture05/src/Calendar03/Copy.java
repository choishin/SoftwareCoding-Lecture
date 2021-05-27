package Calendar03;

public class Copy {

		public static void main(String[] args) {
			//2021.04.14
			//#3. 달력 인쇄 
			int Y = 2021;    // year
	        int startDayOfMonth = 5;
	        int spaces = startDayOfMonth;

	        // startDayOfMonth

	        // months[i] = name of month i
	        String[] months = {
	                "",                               // leave empty so that we start with months[1] = "January"
	                "1월", "2월", "3월",
	                "4월", "5월", "6월",
	                "7월", "8월", "9월",
	                "10월", "11월", "12월"
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
	            System.out.println("   일   월    화   수    목    금   일");

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

