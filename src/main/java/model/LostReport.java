package model;
public class LostReport {
    private int id; private String name, location, time, policeStation, phone, status;
    public LostReport() {}
    public LostReport(int id,String name,String location,String time,String policeStation,String phone,String status){this.id=id;this.name=name;this.location=location;this.time=time;this.policeStation=policeStation;this.phone=phone;this.status=status;}
    public int getId(){return id;} public String getName(){return name;} public String getLocation(){return location;} public String getTime(){return time;} public String getPoliceStation(){return policeStation;} public String getPhone(){return phone;} public String getStatus(){return status;}
}
