public class PointerPersonQueue implements PersonQueue{
	
	
	Person personListStart = null;
	
	public void insert(Person person){
		if(personListStart == null){
			personListStart = person;
			System.out.println(person.getName() + " has joined the queue in position 1.");
		}
		else
			personListStart.addPerson(person);
	}
	
	
	
	public Person retrieve(){
		if (personListStart == null){
			System.out.println("There are no people in the queue.");
			return null;
		}
		else {
			Person personLeaving = personListStart;
			personListStart = personListStart.getNext();
			System.out.println( personLeaving.getName() + " has left the queue.");
			return personLeaving;
		}
	}
	
}