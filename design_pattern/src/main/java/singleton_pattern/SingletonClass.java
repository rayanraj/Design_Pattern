package singleton_pattern;

public class SingletonClass {

	static SingletonClass obj=new SingletonClass();
	private SingletonClass() {}
	public static SingletonClass getInstance() {
		return obj;
	}

}
