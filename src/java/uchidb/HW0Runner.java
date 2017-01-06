package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {

	//TODO you likely will need to add member variable
	private static Containers<Integer, String> instance = null;
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if (instance == null) {
			instance = new ContainerImp<Integer,String>();
		}
		return instance;
	}


	public static void main(String[] args){
		
	}
}
