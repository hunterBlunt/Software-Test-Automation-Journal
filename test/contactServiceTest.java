package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import contact.contactService;
import contact.contactClass;


class contactServiceTest {
	
	// Test objects that will be used across test
	

	
	

	
	
	@Test
	void testAddContact() {
		contactService contactServiceTest = new contactService ();
		Map<Integer, contactClass> testMap = new HashMap<>();
		
		contactClass contactOne = new contactClass("001", "John", "Doe", "0000000000", "123 street st");
		
		testMap.put(1, contactOne);
		
		contactServiceTest.contacts.clear();
		contactServiceTest.uniqueId = 0;
	
		contactServiceTest.addContact(contactOne);

        //Test equal
        assertEquals(contactServiceTest.contacts, testMap);

	}
	
	@Test
	void testUpdateContact() {
		contactService contactServiceTest2 = new contactService ();
		Map<Integer, contactClass> testMap2 = new HashMap<>();
		
		contactClass contactOne = new contactClass("001", "John", "Doe", "0000000000", "123 street st");
		contactClass contactOneUpdated = new contactClass("001", "Tim", "Doe", "0000000000", "123 street st");
		
		testMap2.put(1, contactOneUpdated);
		
		contactServiceTest2.contacts.clear();
		contactServiceTest2.uniqueId = 0;
	
		contactServiceTest2.addContact(contactOne);
		
		contactServiceTest2.updateContact("001", "Tim", "Doe", "0000000000", "123 street st");
		
		
		//Test equal
		assertEquals(contactServiceTest2.contacts, testMap2);
		
	} 
	
	@Test
	void testDeleteContact() {
		contactService contactServiceTest3 = new contactService ();
		Map<Integer, contactClass> testMap3 = new HashMap<>();
		
		contactClass contactOne = new contactClass("001", "John", "Doe", "0000000000", "123 street st");
		
		contactServiceTest3.addContact(contactOne);
		
		contactServiceTest3.deleteContact("001");
		
		
		//Test Equal
		assertEquals(contactServiceTest3.contacts, testMap3);
		
	}

}
