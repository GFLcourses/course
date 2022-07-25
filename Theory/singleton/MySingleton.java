package singleton;

public class MySingleton{

	private static volatile MySingleton INSTANCE;

	private MySingleton(){
	}

	public static MySingleton getInstance(){
	if(INSTANCE == null){
	synchronized(MySingleton.class){
	if(INSTANCE == null){
	INSTANCE = new MySingleton();
		 }
	      }
	   }
	return INSTANCE;
	}


	@Override
	public String toString() {
	return "MySingleton is created";
	}
}