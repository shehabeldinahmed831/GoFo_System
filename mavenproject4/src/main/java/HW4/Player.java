package HW4;

public class Player {
    
    	private String Name;
	private int ID;
	private String Email;
	private String Phone;
	private String Location;
	private String Password;
        private Playground playgroundBook;
	
        /**
         * This is a function that registers the information of a player 
         * @param Name
         * @param ID
         * @param Password
         * @param Email
         * @param Phone
         * @param Location 
         */
        public void Register(String Name, int ID, String Password, String Email, String Phone , String Location) {
		this.Name=Name;
		this.ID=ID;
		this.Password=Password;
		this.Email=Email;
		this.Phone=Phone;
		this.Location=Location;}
        
        /**
         * This a function that stores the information of playground booking
         * @param pgBook 
         */
        public void BookingPlayground(Playground pgBook){
            playgroundBook = pgBook;
        }
    
}
