abstract class Persistence{
	public abstract void persist();
}

class FilePersistence extends Persistence{
	public void persist()
	{
		System.out.println("This is file persistence");
	}
}
class DatabasePersistence extends Persistence{
	public void persist()
	{
		System.out.println("This is Database persistence");
	}
}

class PersistenceFactory{
	
	public static Persistence getPersistence()
	{
		return new FilePersistence();	
	}
}

public class PersistTest{
	public static void main(String []args)
	{
		Persistence p=PersistenceFactory.getPersistence();
		p.persist();
	}
}