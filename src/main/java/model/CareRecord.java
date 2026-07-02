package model;
public class CareRecord {
    private int id; private String type,date,time,content,note;
    public CareRecord() {}
    public CareRecord(int id,String type,String date,String time,String content,String note){this.id=id;this.type=type;this.date=date;this.time=time;this.content=content;this.note=note;}
    public int getId(){return id;} public String getType(){return type;} public String getDate(){return date;} public String getTime(){return time;} public String getContent(){return content;} public String getNote(){return note;}
    public void setId(int id){this.id=id;} public void setType(String v){type=v;} public void setDate(String v){date=v;} public void setTime(String v){time=v;} public void setContent(String v){content=v;} public void setNote(String v){note=v;}
}
