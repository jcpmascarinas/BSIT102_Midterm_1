import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
public class Mascarinas {
    
    public static void main(String[] args)throws Exception {
    	
    	Scanner a = new Scanner(System.in);
    	
    	Date Todayy = new Date();
    	Calendar clndr = new GregorianCalendar();
    	SimpleDateFormat form = new SimpleDateFormat("dd-M-yyy");
    	
    	System.out.println("Enter your Birthday: ");
    	String b = a.nextLine();	
    	Date brthdy = form.parse(b);
    	
    	int year = clndr.get(Calendar.YEAR);
    	clndr.setTime(brthdy);
    	int brthyr = clndr.get(Calendar.YEAR);
    	
    	int age = year - brthyr;
    	System.out.println("Your Age is :" +age+ " years old");
    	
    }
}
