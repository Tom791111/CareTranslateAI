package model;
public class SosRecord {
    private int id; private String type, phone, note, createdAt;
    public SosRecord() {}
    public SosRecord(int id,String type,String phone,String note,String createdAt){this.id=id;this.type=type;this.phone=phone;this.note=note;this.createdAt=createdAt;}
    public int getId(){return id;} public String getType(){return type;} public String getPhone(){return phone;} public String getNote(){return note;} public String getCreatedAt(){return createdAt;}
}
