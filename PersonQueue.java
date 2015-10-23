public interface PersonQueue {

/**
* Adds another person to the queue
*/
    void insert (Person person);
	
/**
*  Remove a person from the queue
*/

   Person retrieve();	

}