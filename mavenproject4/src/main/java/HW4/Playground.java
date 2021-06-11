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
    /**
     * this function adds a new playground
     * @param name
     * @param size
     * @param shape
     * @param cancelationPeriod
     * @param groundMaterial
     * @param pricePerHour
     * @param availableHours
     * @param location 
     */
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
    /**
     * this function counts the available hours After booking a time slot
     * @param timeSlots 
     */
    public void bookTimeSlot(int timeSlots){
        availableHours-=timeSlots;
    }
    
}
