
public class Color {
	int door;
	int window;
	int doorLock;
	String manager;
	
	Color(){
		
	}
	Color(int door,int window,int doorLock,String manager){
		this.door = door;
		this.window = window;
		this.doorLock = doorLock;
		this.manager = manager;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return this.door;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	public int getWindow() {
		return this.window;
	}
	public void setDoorLock(int doorLock) {
		this.doorLock = doorLock;
	}
	public int getDoorLock() {
		return this.doorLock;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getManager() {
		return this.manager;
	}
	
	
	
	
	
}
