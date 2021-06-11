/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			PlaygroundOwner PO = new PlaygroundOwner();
			Playground pg = new Playground();
			Player player = new Player();
                        
            
			System.out.println("enter your name");
			String Name= scan.nextLine();
			System.out.println("enter your ID");
			int ID= scan.nextInt();
			scan.nextLine();
			System.out.println("enter your password");
			String Password= scan.nextLine();
			System.out.println("enter your email");
			String Email= scan.nextLine();
			System.out.println("enter your phone");
			String Phone= scan.nextLine();
			System.out.println("enter your location");
			String Location = scan.nextLine();
			
			PO.register(Name,ID,Password,Email,Phone ,Location);
			PO.display();
			System.out.println("enter playgrounds name");
			String name=scan.nextLine();
			System.out.println("enter playgrounds location");
			String location=scan.nextLine();
			System.out.println("enter playgrounds size");
			int size=scan.nextInt();
			System.out.println("enter playgrounds available hours");
			int availableHours=scan.nextInt();
			System.out.println("enter the price per hour");
			double pricePerHour=scan.nextDouble();
			scan.nextLine();
			System.out.println("enter the cancellation period");
			String cancelationPeriod=scan.nextLine();
                        System.out.println("enter playground's shape");
			String shape=scan.nextLine();
                        System.out.println("enter playground's Material");
                        String groundMaterial=scan.nextLine();
			pg.addPlayground(name,size,shape,cancelationPeriod,groundMaterial,pricePerHour,availableHours,location);
			pg.display();
			System.out.println("enter your time slot");
			int timeSlot = scan.nextInt();
			
                        pg.bookTimeSlot(timeSlot);
                        pg.display();
            
                        player.BookingPlayground(pg); 
			
		}
	}
	
}