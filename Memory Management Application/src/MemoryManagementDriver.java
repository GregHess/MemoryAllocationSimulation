
public class MemoryManagementDriver {

	public static void main(){
		
		/* A fixed allocation will take numberOfPartitions from the user each will be
		 * the same size (sizeOfPartitions)
		 */
		
		//TODO: SETUP FIXED ALLOCATION SPECIFICATIONS
		
		int numberOfPartitions = 5;
		int sizeOfPartitions = 500;
		
		FixedAllocation fixedAllocation = new FixedAllocation(numberOfPartitions, sizeOfPartitions);
		
		//TODO: SETUP DYNAMIC ALLOCATION SPECIFICATIONS
		DynamicAllocation dynamicAllocation = new DynamicAllocation();
		
		JobAllocator JA = new JobAllocator(fixedAllocation, dynamicAllocation);
		
	}
	
}
