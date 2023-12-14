//Recepition and Main in the same class 
import java.text.DecimalFormat;
public class Time {

		private int hour;
        private int m;
        private int s;
      
		public Time ()
        {
        	set(0,0,0);
        }
        public void set(int h , int mi , int se) {
        	hour = (h>=0 && h<24)? h : 0;
        	m = (mi>=0 && mi<60)? mi : 0;
        	s = (se>=0 && se<60)? se : 0;
        }
        public String toUniversal() {
        	DecimalFormat twoDic = new DecimalFormat("00");
        	return twoDic.format(hour) + ":" + twoDic.format(m) + ":" + twoDic.format(s);
        }
	    public String toStanderd() {
	    	DecimalFormat twoDic = new DecimalFormat("00");
	    	return twoDic.format((hour==0 || hour==12)? hour : hour%12) + ":" + twoDic.format(m) + ":" + twoDic.format(s) + ((hour<12)?"AM":"PM");
	    }
		@Override
		public String toString() {
			return "Time [hour=" + hour + ", m=" + m + ", s=" + s + "]";
		}
	    
        
}