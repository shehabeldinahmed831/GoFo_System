package HW4;

/**
 *
 * @author as
 */
public class PlaygroundOwner {
    private String name;
    private int id;
    private String password;
    private String Email;
    private String phone;
    private String defaultLocation;
    
    /**
     * this function takes the information of the user
     * @param name
     * @param id
     * @param password
     * @param Email
     * @param phone
     * @param defaultLocation 
     */
    public void register(String name,int id,String password,String Email,String phone,String defaultLocation){
    this.name=name;
    this.id=id;
    this.Email=Email;
    this.password=password;
    this.phone=phone;
    this.defaultLocation=defaultLocation;
    }
    
    /**
     * this function displays the user account's info
     */
    public void display(){
        System.out.println("Your Account info is: "+"Name: "+name+" ID: "+id+" E-mail: "+Email+" Phone: "+phone+" Default Location "+defaultLocation);
    }
    
}

