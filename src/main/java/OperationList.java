import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class OperationList {
	private ArrayList<Operation> _operations = new ArrayList<Operation>();
	
	public void add(Operation operation) {
		_operations.add(operation);
	}
	
	public ArrayList<Operation> getByDate(){
		Collections.sort(_operations, new OperationComparatorByDate());
		return (ArrayList<Operation>)_operations.clone();
	}
}
