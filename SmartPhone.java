package OOP;
public class SmartPhone {
private String brand;
private int storage;

    public SmartPhone() {
        setBrand("Generic");
        setStorage(64);
    }

    public SmartPhone(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        if(storage>=32 && storage<=1024){
        this.storage = storage;
    }else{
            System.out.println("Erore");
        }
    }
 
    public double getBrandCost(){
        int brandCost=0;
        switch(brand){
            case"apple":brandCost=1000;break;
            case"samsung":brandCost=800;break;
            case"generic":brandCost=500;break;
        }
                
        return brandCost;
    }
    public double  getStorageCost(){
         int storagCost=0;
        if(this.storage>=32 && this.storage<=128){
            storagCost=storage*4;
        }else if(this.storage>=129 && this.storage<=512){
            storagCost=storage*3;
        }else if(this.storage>=512 && this.storage<=1024){
             storagCost=storage*2;
        }
       return storagCost;
 }
   public double getTotalCost(){
       double getTotalCost=getStorageCost()+getBrandCost();
       return getTotalCost;
   }

    @Override
    public String toString() {
        return "SmartPhone{" + "brand=" + brand + ", storage=" + storage + '}';
    }
   public void UpgradeStorage(int storage){
       
   }
public void UpgradeStorage(){
    int newStorage=0;
    setStorage(this.storage+newStorage);
}
}