package ParentPkg;
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDate;
import java.time.LocalDateTime;

public class innerClass {
	int time,date;
	public innerClass(int time,int date){
		this.time=time;
		this.date=date;
		}
		  public static void main(String[] args) {
		    LocalTime myObj = LocalTime.now();
		    LocalDate myObj2 = LocalDate.now();
		    System.out.println(myObj2);
		    System.out.println(myObj);
    LocalDateTime dt= LocalDateTime.of(myObj2.getYear(),myObj2.getMonth(),myObj2.getDayOfMonth()
    	,+myObj.getHour(),myObj.getMinute(),myObj.getSecond(),myObj.getNano());		    
    System.out.println(dt.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

    /*dt.localDateTime(myObj2, myObj);
		  }
		  void localDateTime(int myObj2, int myObj) {
			  
		  }
*/
}
		public void fun() {
			// TODO Auto-generated method stub
			
		}}