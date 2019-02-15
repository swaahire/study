package JavaDay2;

public class TestPersistance {
public static void main(String[] args) {
	FilePersistance fp=new FilePersistance();
	fp.persist();
	DatabasePersistance dp=new DatabasePersistance();
	dp.persist();
}
}
