package model;
public class Phrase {
    private int id; private String category; private String zh; private String vi; private String idText; private String fil;
    public Phrase() {}
    public Phrase(int id,String category,String zh,String vi,String idText,String fil){this.id=id;this.category=category;this.zh=zh;this.vi=vi;this.idText=idText;this.fil=fil;}
    public int getId(){return id;} public String getCategory(){return category;} public String getZh(){return zh;} public String getVi(){return vi;} public String getIdText(){return idText;} public String getFil(){return fil;}
    public void setId(int id){this.id=id;} public void setCategory(String c){this.category=c;} public void setZh(String z){this.zh=z;} public void setVi(String v){this.vi=v;} public void setIdText(String i){this.idText=i;} public void setFil(String f){this.fil=f;}
}
