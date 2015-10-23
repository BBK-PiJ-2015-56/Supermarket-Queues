public class Person {
	String name;
	int age;
	Person next;
	
	public Person(String name , int age ){
		this.name = name;
		this.age = age;
		next = null;
	}
	
	
	public void addPerson(Person personToAdd){
		if(this.next == null){
			this.next = personToAdd;
			System.out.println(personToAdd.getName() + " has joined the queue, after " + this.getName() + ".");
		}
		else
			this.next.addPerson(personToAdd);
	}
	
	
	//public Person leaveTheQueue()
	//qs: leaving the queue is really a behaviour of the person, so shouldn't it be in here?
	
	public String getName() {
		return name;
	}
	
	public Person getNext(){
		return next;
	}
	
	
}
