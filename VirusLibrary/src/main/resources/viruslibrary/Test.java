package viruslibrary;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
//		date.getYear()*(10^8)+date.getMonthValue()*(10^6)+date.getDayOfMonth()*(10^4)+date.getHour()*(10^2)+date.getMinute()
		System.out.println(date.getMonthValue()*Math.pow(10, 6)+date.getDayOfMonth()*Math.pow(10, 4)+date.getHour()*Math.pow(10, 2)+date.getMinute());
	}

}
