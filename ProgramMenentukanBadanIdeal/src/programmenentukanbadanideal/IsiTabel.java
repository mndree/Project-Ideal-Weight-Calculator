package programmenentukanbadanideal;

public class IsiTabel extends data{
   
    public IsiTabel(String name, float heigh, float weight, float imt, String keadaan) {
        super.setName(name);
        super.setHeigh(heigh);
        super.setWeight(weight);
        super.setImt(imt);
        super.setKeadaan(keadaan);
    }
    public String getName() {
        return super.getName();
    }

    public float getHeigh() {
        return super.getHeigh();
    }

    public float getWeight() {
        return super.getWeight();
       
    }

    public float getImt() {
        return super.getImt();
    
    }

    public String getKeadaan() {
        return super.getKeadaan();
       
    }
}
