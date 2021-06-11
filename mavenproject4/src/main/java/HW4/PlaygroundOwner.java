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
    public void register(String name,int id,String password,String Email,String phone,String defaultLocation){
    this.name=name;
    this.id=id;
    this.Email=Email;
    this.password=password;
    this.phone=phone;
    this.defaultLocation=defaultLocation;
    }
    public void display(){
        System.out.println("Your Account info is: "+"Name: "+name+" ID: "+id+" E-mail: "+Email+" Phone: "+phone+" Default Location "+defaultLocation);
    }
    
}

