package HW4;

/**
 *
 * @author as
 */
public class Playground {
    private String name;
    private int size;
    private String shape;
    private String cancelationPeriod;
    private String groundMaterial;
    private double pricePerHour;
    private int availableHours;
    private String location;
    public void addPlayground(String name,int size,String shape,String cancelationPeriod,String groundMaterial,double pricePerHour,int availableHours,String location)
    {
        this.name=name;
        this.availableHours=availableHours;
        this.cancelationPeriod=cancelationPeriod;
        this.groundMaterial=groundMaterial;
        this.location=location;
        this.shape=shape;
        this.size=size;
        this.pricePerHour=pricePerHour;
        
    }
    public void display(){
        System.out.println("Your Playground info: Name: "+name+" AvailableHour: "+availableHours+" Cancelation Period: "+cancelationPeriod+" GroundMaterial: "+groundMaterial+" Location: "+location+" shape: "+shape+" size: "+size+" Price Per Hour "+pricePerHour);
    }
    public void bookTimeSlot(int timeSlots){
        availableHours-=timeSlots;
    }
    
}
