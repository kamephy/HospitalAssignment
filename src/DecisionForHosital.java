
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;


import data.Patient;

public class DecisionForHosital {

	public static void main(String[] args) throws ParseException {

//TODO Auto-generated method stub
		
		int bcount=0,ocount=0;
		String sDate1="13/06/2021";  
		String sDate2="16/06/2021";  

	    Date from=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    Date to=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
	    
		List<Patient> allPatient = new ArrayList<>();


//Data
	    Patient p=new Patient();
	    p.setName("Rahul");
	    p.setlocation("Bangalore");
	    p.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("16/06/2021"));
	    allPatient.add(p);
	    Patient p2=new Patient();
	    p2.setName("aditya");
	    p2.setlocation("Bangalore");
	    p2.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("13/06/2021"));
	    allPatient.add(p2);
	    Patient p3=new Patient();
	    p3.setName("sayrah");
	    p3.setlocation("Bangalore");
	    p3.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("14/06/2021"));
	    allPatient.add(p3);
	    Patient p4=new Patient();
	    p4.setName("shahnawaz");
	    p4.setlocation("Udupi");
	    p4.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("18/06/2021"));
	    allPatient.add(p4);
	    Patient p5=new Patient();
	    p5.setName("ankit");
	    p5.setlocation("kundapur");
	    p5.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("18/06/2021"));
	    allPatient.add(p5);
	  


//logic	
	    int sizeAll=allPatient.size();
	    for(int i=0;i<allPatient.size();i++){
	    	if(allPatient.get(i).getlocation()=="Bangalore"){
	    		if(allPatient.get(i).getdate1().compareTo(from)>0 && allPatient.get(i).getdate1().compareTo(to)<0){
	    			bcount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}else{
		    	ocount++;
	    	}
	    }



//Print
	    System.out.println("Bangalore"+bcount);
	    System.out.println("other cities"+ocount);
	    
	    
	    Double inPatientPercentage = Double.valueOf(bcount * 100 / sizeAll);
        Double outPatientPercentage = Double.valueOf(ocount * 100 / sizeAll);
	    System.out.println("Bangalore"+inPatientPercentage);
	    System.out.println("other cities"+outPatientPercentage);

	}

}
