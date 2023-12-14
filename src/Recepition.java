//Recepition and Main in the same class 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Recepition {
static Scanner sc = new Scanner(System.in); 
static String option;
static ArrayList<String> data = new ArrayList<String>();
static String employId; 
static DateFormat dateFormat = new SimpleDateFormat("dd/MM/hh:mm a");
static Calendar cal1 = Calendar.getInstance();
static boolean check = true; // if select any other input check for stop loop
static int employment_id;
static Date hireDate = new Date();
static int num = 0;
static int TPD = 0;
static boolean flag = true;
static boolean click = true;
static Date dg = new Date();
static ArrayList<Languages> languages = new ArrayList<Languages>();
static ArrayList<MuseumWorkingDays> MWDS = new ArrayList<MuseumWorkingDays>();
static Guide guide ;
static int a , b , c;
static Person person = new Person();
static String name;
static int id ;
static Date bod = new Date();
static MuseumSystem museumSystem = new MuseumSystem();
static OneTimeTicket oneTimeTicket = new OneTimeTicket();
static MultiTimeTicket multiTimeTicket = new MultiTimeTicket();
static int price = 0;
static Date issuDate = new Date();
static Visitor visitor1 = new RegularVisitor();
static Visitor visitor2 = new SeniorVisitor();
static RegularVisitor RVisitor = (RegularVisitor)visitor1;
static SeniorVisitor SVisitor =  (SeniorVisitor)visitor2;
static double discount = 0.0;
static VisitorRecord VR = new VisitorRecord();
static ArrayList<VisitorRecord> VRS = new ArrayList<VisitorRecord>();
static Time time = new Time();
static int n =0;
public static void main(String[] args) {
    reseption();
}

public static void reseption() {
	while(true) {
		System.out.println("*****menu*****\n1- registering guide\n2-registering visitor\n3-issuing ticket\n4-exit ");
		System.out.println("please enter your choice :");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			registeringGuides();
			break;
		case "2":
			registeringVisitor();
			break;
		case "3":
			issuTickets();
			break;
		case "4":
			System.exit(0);
			break;
		default: 
			System.out.println("please Enter number from 1 to 4");
			break;
	    }
		}
}
public static void registeringGuides()
{
	System.out.println("please enter the name :" ); 
	name = sc.nextLine();
	person.setName(name);
	System.out.println("please enter the id :" ); 
	id = sc.nextInt();
	person.setId(id);
	System.out.println("please enter the BOD(day/month/year) :" ); 
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	bod.set(a, b, c);
	person.setDob(bod);
	Employee employee = new Employee(person.getName(),person.getId(),person.getDob());
	System.out.println("please enter the id employment:" ); 
	employment_id = sc.nextInt();
	employee.setEmployment_id(employment_id);
	System.out.println("please enter the hireDate(day/month/year) :" ); 
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	hireDate.set(a, b, c);
	employee.setHireDate(hireDate);
	guide = new Guide(person.getName(),person.getId(),person.getDob(),employee.getEmployment_id(),employee.getHireDate());
	flag = true;
	while (flag) {
	System.out.println("please enter the number of languages that you can speak(the maximum number is 4) :" );
	num = sc.nextInt();
	if(num>=0 && num<5)
		flag = false;
	}
	for(int i=0 ; i<num ; i++) {
		System.out.println("what are the Languages? 1-ARABIC , 2-ENGLISH , 3-FRENCH , 4-SPANISH ");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			languages.add(Languages.ARABIC);
			break;
		case "2":
			languages.add(Languages.ENGLISH);
			break;
		case "3":
			languages.add(Languages.FRENCH);
			break;
		case "4":
			languages.add(Languages.SPANISH);
			break;
		default: 
			System.out.println("please Enter number from 1 to 4");
			num++;
			break;
	    }
	}
	guide.setLanguages(languages);
	flag = true;
	while (flag) {
	System.out.println("please enter the number of tour per day that you can do(the maximum number is 3) :" );
	TPD = sc.nextInt();
	if(TPD>=0 && TPD<4) {
	guide.setToursPerDay(TPD);
	flag = false ;
	}
	}
	flag = true;
	while (flag) {
		System.out.println("please enter the number of Days that you working in(the maximum number is 6) :" );
		num = sc.nextInt();
		if(num>=0 && num<7)
			flag = false;
		}
	for(int i=0 ; i<num ; i++) {
		System.out.println("what is the DAYs? 1-SATURDAY , 2-SUNDAY , 3-MONDAY , 4-TUESDAY , 5-WEDNESDAY , 6-THURSDAY ");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			MWDS.add(MuseumWorkingDays.SATURDAY);
			break;
		case "2":
			MWDS.add(MuseumWorkingDays.SUNDAY);
			break;
		case "3":
			MWDS.add(MuseumWorkingDays.MONDAY);
			break;
		case "4":
			MWDS.add(MuseumWorkingDays.TUESDAY);
			break;
		case "5":
			MWDS.add(MuseumWorkingDays.WEDNESDAY);
			break;
		case "6":
			MWDS.add(MuseumWorkingDays.THURSDAY);
			break;	
		default: 
			System.out.println("please Enter number from 1 to 6");
			num++;
			break;
	    }
	}
	guide.setMWD(MWDS);
	dg.set(cal1.get(Calendar.DATE), cal1.get(Calendar.MONTH), cal1.get(Calendar.YEAR));
	guide.setDate(dg);
	museumSystem.addGuide(guide);
	System.out.println(guide.toString());
}
public static void registeringVisitor()
{
	System.out.println("please enter the name :" ); 
	name = sc.nextLine();
	person.setName(name);
	System.out.println("please enter the id :" ); 
	id = sc.nextInt();
	person.setId(id);
	System.out.println("please enter the BOD(day/month/year) :" ); 
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	bod.set(a, b, c);
	person.setDob(bod);
	System.out.println("please enter the number of visits :" ); 
	n = sc.nextInt();
	if(n>10) {
		System.out.println("If visits count > 10 we have a discount");
		System.out.println("please enter the record id :" ); 
		id = sc.nextInt();
		visitor2.setRecord_id(id);
		visitor2.setVisits_count(n);
		System.out.println("please enter the discount rate:" ); 
		discount = sc.nextDouble();
        SVisitor.setDiscountRate(discount);
        flag = true;
    	while (flag) {
    	System.out.println("please enter the number of languages that you can speak(the maximum number is 4) :" );
    	num = sc.nextInt();
    	if(num>=0 && num<5)
    		flag = false;
    	}
    	for(int i=0 ; i<num ; i++) {
        System.out.println("what is the Language? 1-ARABIC , 2-ENGLISH , 3-FRENCH , 4-SPANISH ");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			languages.add(Languages.ARABIC);
			break;
		case "2":
			languages.add(Languages.ENGLISH);
			break;
		case "3":
			languages.add(Languages.FRENCH);
			break;
		case "4":
			languages.add(Languages.SPANISH);
			break;
		default: 
			System.out.println("please Enter number from 1 to 4");
			num++;
			break;
	    }
	    }
    	SVisitor.setLanguages(languages);
    	dg.set(cal1.get(Calendar.DATE), cal1.get(Calendar.MONTH), cal1.get(Calendar.YEAR));
    	time.set(cal1.get(Calendar.HOUR), cal1.get(Calendar.MINUTE), cal1.get(Calendar.SECOND));
    	VR.setEnteringDate(dg);
    	VR.setEnteringtime(time);
    	VRS.add(VR);
    	SVisitor.setVR(VRS);
    	oneTimeTicket.setVs(SVisitor);
    	multiTimeTicket.setVs(SVisitor);
    	museumSystem.addVisitor(SVisitor);
    	System.out.println(person.toString());
    	System.out.println(SVisitor.toString());
    	//museumSystem.getAvailableGuides(dg, languages).trimToSize();
    	//num = museumSystem.getAvailableGuides(dg, languages).size();
    	//if (num != 0) {
		flag = false;
    	System.out.println("Do you want a guide ? if yes enter true else false");
    	flag = sc.nextBoolean();
    	if( flag == true) {
    	System.out.println("the Available Guides :");
    	for(Guide x :museumSystem.getAvailableGuides(dg, languages)) {
        	System.out.println(x.toString());
    	 }
    	}
	}
	else {
		System.out.println("please enter the record id :" ); 
		id = sc.nextInt();
		visitor1.setRecord_id(id);
		visitor1.setVisits_count(n);
        flag = true;
    	while (flag) {
    	System.out.println("please enter the number of languages that you can speak(the maximum number is 4) :" );
    	num = sc.nextInt();
    	if(num>=0 && num<5)
    		flag = false;
    	}
    	for(int i=0 ; i<num ; i++) {
        System.out.println("what is the Language? 1-ARABIC , 2-ENGLISH , 3-FRENCH , 4-SPANISH ");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			languages.add(Languages.ARABIC);
			break;
		case "2":
			languages.add(Languages.ENGLISH);
			break;
		case "3":
			languages.add(Languages.FRENCH);
			break;
		case "4":
			languages.add(Languages.SPANISH);
			break;
		default: 
			System.out.println("please Enter number from 1 to 4");
			num++;
			break;
	    }
	    }
    	RVisitor.setLanguages(languages);
    	dg.set(cal1.get(Calendar.DATE), cal1.get(Calendar.MONTH), cal1.get(Calendar.YEAR));
    	time.set(cal1.get(Calendar.HOUR), cal1.get(Calendar.MINUTE), cal1.get(Calendar.SECOND));
    	VR.setEnteringDate(dg);
    	VR.setEnteringtime(time);
    	VRS.add(VR);
    	RVisitor.setVR(VRS);
    	oneTimeTicket.setVr(RVisitor);
    	multiTimeTicket.setVr(RVisitor);
    	museumSystem.addVisitor(RVisitor);
    	System.out.println(person.toString());
    	System.out.println(RVisitor.toString());
    	//museumSystem.getAvailableGuides(dg, languages).trimToSize();
    	//num = museumSystem.getAvailableGuides(dg, languages).size();
    	//if (num != 0) {
    	flag = false;
    	System.out.println("Do you want a guide ? if yes enter true else false");
    	flag = sc.nextBoolean();
    	if( flag == true) {
    	System.out.println("the Available Guides :");
    	for(Guide x :museumSystem.getAvailableGuides(dg, languages)) {
        	System.out.println(x.toString());
    	 }
    	}
	}
}
public static void issuTickets() {
	System.out.println("what do you want? 1-One Time Ticket , 2-Multi Time Ticket ");	
	option = sc.nextLine();
	switch (option) {
	case "1":
		System.out.println("please Enter the price of the ticket: ");
		price = sc.nextInt();
		oneTimeTicket.setPrice(price);
		if(oneTimeTicket.getVs().getVisits_count()>10) {
			price =(int)((double)oneTimeTicket.getPrice() - oneTimeTicket.getPrice()*oneTimeTicket.getVs().getDiscountRate());
			oneTimeTicket.setPrice(price);
		}
		issuDate.set(cal1.get(Calendar.DATE), cal1.get(Calendar.MONTH), cal1.get(Calendar.YEAR));
		oneTimeTicket.setIssueDate(issuDate);
    	System.out.println(oneTimeTicket.toString());
		break;
	case "2":
		System.out.println("what do you want? 1-DAILY Ticket , 2-MONTHLY Ticket , 3-YEARLY Ticket ");	
		option = sc.nextLine();
		switch (option) {
		case "1":
			multiTimeTicket.setTickectType(TickectType.DAILY);
			break;
		case "2":
			multiTimeTicket.setTickectType(TickectType.MONTHLY);
			break;
		case "3":
			multiTimeTicket.setTickectType(TickectType.YEARLY);
			break;
		default: 
			System.out.println("please Enter number from the three choices ");
			break;
		}
		System.out.println("please Enter the price of the ticket: ");
		price = sc.nextInt();
		multiTimeTicket.setPrice(price);
		if(multiTimeTicket.getVs().getVisits_count()>10) {
			price =(int)((double)multiTimeTicket.getPrice() - multiTimeTicket.getPrice()*multiTimeTicket.getVs().getDiscountRate());
			multiTimeTicket.setPrice(price);
		}
		issuDate.set(cal1.get(Calendar.DATE), cal1.get(Calendar.MONTH), cal1.get(Calendar.YEAR));
		multiTimeTicket.setIssueDate(issuDate);
    	System.out.println(multiTimeTicket.toString());
		break;
	default: 
		System.out.println("please Enter number from the two choices ");
		break;
	}
	
	
}
}

