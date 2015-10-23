public class QueueScript{
	
	
	public static void main(String[] args){
		QueueScript script = new QueueScript();
		script.launch();
	}
	
	
	public void launch(){                              //q) why public?
		PersonQueue q = new PointerPersonQueue();
		testQueue(q);
		
	}
	
	private void testQueue(PersonQueue queueToTest) {
		System.out.println("Testing the queue....");
		queueToTest.insert(new Person("Matthew" , 23 ));
		queueToTest.insert(new Person("Jerome" , 29 ));
		queueToTest.insert(new Person("Paris" , 17 ));
		queueToTest.retrieve();
		queueToTest.insert(new Person("Michelle" , 43 ));
		queueToTest.insert(new Person("Letitia" , 35 ));
		queueToTest.retrieve();
	}
}