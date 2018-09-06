import myStuff.*;
import lab2.*;

public class Mine{
	public static void main (String[] args){
		Lamp myLamp = new Lamp();
		System.out.println("This is my Lamp!!");
		
		myLamp.setColor("white");
		myLamp.setWatts(45);
		myLamp.turnOn();
		String status = myLamp.showStatus();
		System.out.println(statu);
		
		System.out.println("Lamp is " + myLamp.isOn() + "and is color " + myLamp.getColor() + " and is wattage ")
		+ myLamp.getWatts());
		
		Lamp yourLamp = new Lamp();
		Yours.print();
		
		Lamp otherLamp = new Lamp();
		Others.print();
	}
	
}