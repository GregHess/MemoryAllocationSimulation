
public class FixedAllocation extends Memory {
	
	public FixedAllocation(int numberOfPartitions, int sizeOfPartitions) {
		for(int i = 0; i < numberOfPartitions; i++){
			Partition partition = new Partition(sizeOfPartitions);
			this.addPartition(partition);
		}
	}

}
