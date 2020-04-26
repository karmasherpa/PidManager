public class Assignment1 {
	
	public static void main(String args[]) {
		
	  PidManager.allocatMap();
	  
	  PidManager.allocatPID();  
	  PidManager.allocatPID();
	
	  PidManager.releasePID(300);
	  
	  PidManager.allocatPID();
	  PidManager.allocatPID();  
	  
	 }
}