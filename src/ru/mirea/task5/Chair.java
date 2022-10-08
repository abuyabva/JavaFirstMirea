package ru.mirea.task5;

public class Chair extends Furniture{
    String material;
    String country;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void setAllStats(String m, int p, String mat, String c){
        super.manufacturer=m;
        super.price=p;
        material=mat;
        country=c;
    }
    public String ToString() {
        return super.toString()+
                " Chair: {"+
                "Material: "+material+
                " | Country: "+country+"}";
    }
}
