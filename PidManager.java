
class PidManager {

	private static final int MIN_PID = 300;
	private static final int MAX_PID = 5000;

	private static int[] pids;

	public static int allocatMap() {

		pids = new int[MAX_PID - MIN_PID];
		if (pids == null)
		{
			System.out.println("Memory allocation failed ");
			return -1;
		}
	
		for (int i = 0; i < pids.length; i++)
		{
			pids[i] = 0;
		}
		System.out.println("Memory allocated successfully ");
		return 1;
		}

	public static int allocatPID() {
		
		if (pids == null)
		{
			System.out.println("PID Manager is not initialized ");
			return -1;
		}
	  
		int pidNum = -1;
	  
		for (int i = 0; i < pids.length; i++)
		{
		  if (pids[i] == 0)
		  {
			  pids[i] = 1;
			  pidNum = i + MIN_PID;
			  break;
		  }
		}
	  	if (pidNum == -1)
	  	{
	  		System.out.println("Unable to allocat PID");
	  		return -1;
	  	}
	  	System.out.println("My PID is :" + pidNum);
	  	return pidNum;
	}

	public static void releasePID(int pidNum) {
	
	  if (pids == null)
	  {
		  System.out.println("PID Manager is not initialized ");
		  return;
	  }
	  if (pidNum < MIN_PID || pidNum > MAX_PID)
	  {
		  System.out.println("Given PID is out or Range");
	  }
	  	int newPid = pidNum - MIN_PID;
	  if (pids[newPid] == 0)
	  {
	  		System.out.println("PID " + pidNum + " is already released ");
	  		return;
	  }
	  
	  	System.out.println("Releasing PID :" + pidNum);  
	  	pids[newPid] = 0;
	}
}