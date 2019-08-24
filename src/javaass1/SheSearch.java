
package javaass1;

import java.sql.Date;

/**
 *
 * @author prutu
 */
public class SheSearch {
    private  String FlightNo;
    private  String From;
    private  String To;
    private  Date DeptDate;
    private  Date ArrDate;
    private  String Time;

public SheSearch(String FlightNo,String From,String To,Date DeptDate,Date ArrDate,String Time){
        
this.FlightNo = FlightNo;
this.From = From;
this.To = To;
this.DeptDate = DeptDate;
this.ArrDate = ArrDate;
this.Time = Time;

}
public String getFlightno() {
    
    return FlightNo;
}

public String getFrom(){
    return From;
    
}
public String getTo(){
    return To;
    
}
public Date getDepdate(){
    return DeptDate;
    
}
public Date getArrdate(){
    return ArrDate;
    
}
public String getTime(){
    return Time;
    
}
}
