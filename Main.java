// STUDENT NAME: Blake Luna-Beltran
// DATE: 05/02/2025

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
int  birthJDN, yBirth, mBirth, dayBirth;
int  todayJDN, yToday, mToday, dayToday;
int aFirst, yFirst, mFirst;
int diff, age, r1;
int aSecond, ySecond, mSecond; 
		/***** INITIALIZATION SECTION *****/
		dayBirth = 22;
		yBirth = 1996;
		mBirth = 11;
		dayToday = 5;
		yToday = 2025;
		mToday = 2;
	
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		
		aFirst = (14-mBirth) / 12;
		yFirst = yBirth + 4800 - aFirst;
		mFirst = mBirth + (12 * aFirst) -3;
		birthJDN = dayBirth + ( 153 * mFirst + 2 ) / 5  + 365 * yFirst 
		+ yFirst/4 - yFirst/100 + yFirst/400 - 32045;
		
		aSecond = (14-mToday) / 12;
		ySecond = yToday + 4800 - aSecond;
		mSecond = mToday + (12 * aSecond) -3;
		todayJDN = dayToday + ( 153 * mSecond + 2 ) / 5  + 365 * ySecond 
		+ ySecond/4 - ySecond/100 + ySecond/400 - 32045;

		diff = todayJDN - birthJDN; 
		age = diff / 365;
		r1 = diff % 365;

		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + mToday + "/" + dayToday + "/" + yToday + ", is " + todayJDN);
		System.out.println();
		System.out.println("Julian Day Number for birthday, " + mBirth + "/" + dayBirth + "/" + yBirth + ", is " + birthJDN );
		System.out.println();
		System.out.println("The difference in days is " + diff + ", which makes you approximatley " + age + " years and " + r1 + " days old!");
		
  }
}