
public class JobAllocator {
	
	private static final int FIRST_FIT = 0;
	private static final int BEST_FIT = 1;
	private static final int NEXT_FIT = 2;
	private static final int WORST_FIT = 3;
	
	private static FixedAllocation fixedAllocation;
	private static DynamicAllocation dynamicAllocation;
	
	public JobAllocator(FixedAllocation fixedAllocation, DynamicAllocation dynamicAllocation){
		this.fixedAllocation = fixedAllocation;
		this.dynamicAllocation = dynamicAllocation;
	}

	public boolean addJob(Job job, int algorithm){
		
		if(algorithm == 1){
			
		}else if(algorithm == 2){
			
		}
		return true;
	}
	
	public void firstFit(Job job, Memory memoryAllocationType){
		
	}
	
	public void bestFit(Job job, Memory memoryAllocationType){
		
	}
	
	public void nextFit(Job job, Memory memoryAllocationType){
		
	}
	
	public void worstFit(Job job, Memory memoryAllocationType){
		
	}
	
}
