public class Supermarket{
	
	
	public static void main(String[] args){
		Supermarket s = new Supermarket();
		s.launch();
	}
	
	
	public void launch(){                              //q) why public?
		PersonQueue q = new PointerPersonQueue();
		testQueue(q);
		
	}
	
	private void testQueue(PersonQueue queueToTest) {
		System.out.println("Testing the queue....");
		addPerson("Matthew" , 23 , queueToTest );
		addPerson("Jerome" , 29 , queueToTest );
		addPerson("Paris" , 17 , queueToTest );
		servePerson(queueToTest);
		addPerson("Michelle" , 43 , queueToTest );
		addPerson("Letitia" , 35 , queueToTest);
		servePerson(queueToTest);
	}
	private void addPerson(String name , int age , PersonQueue queueToJoin ){
		queueToJoin.insert(new Person( name , age ));
	}
	
	private void servePerson(PersonQueue queueToServe){
		queueToServe.retrieve();
	}
}

//error - cant see queuetoTest as scope is only testQueue method. Best way to resolve?
//What I did is made the queueToTest another parameter. 
//This has the advantage of being able to test several queues operating at once.
//But in Sergio's question, Serve person takes no arguments, and addPerson has a Person arg!