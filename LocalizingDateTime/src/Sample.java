import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample {

	public static void main(String[] args) {
		

		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
		//DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("en","US"));
		
		String d2=df.format(new Date());
		
		//String d1=df.format(new Date());
        //System.out.println(d1);
		
		System.out.println(d2);

	}

}
