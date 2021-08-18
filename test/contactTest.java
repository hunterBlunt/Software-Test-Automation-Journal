package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.contactClass;

class contactTest {

	@Test
	void testcontactClass() {
		assertTrue(contactClass.getcontactID().equals("001"));
		assertTrue(contactClass.getfirstName().equals("John"));
		assertTrue(contactClass.getlastName().equals("Doe"));
		assertTrue(contactClass.getphone().equals("0000000000"));
		assertTrue(contactClass.getaddress().equals("123 street st"));
	}
	
	@Test
	void testContactIDToLong() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("12345678901", "John", "Doe", "0000000000", "123 street st");
		 }); 
	}
	
	@Test
	void testFirstNameToLong() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("001", "Joooooooohn", "Doe", "0000000000", "123 street st");
		 }); 
	}
	
	@Test
	void testLastNameToLong() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("001", "John", "Doooooooooe", "0000000000", "123 street st");
		 }); 
	}
	
	@Test
	void testPhoneToLong() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("001", "John", "Doe", "00000000000", "123 street st");
		 }); 
	}
	
	@Test
	void testPhoneToShort() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("001", "John", "Doe", "000000000", "123 street st");
		 }); 
	}
	
	@Test
	void testAddressToLong() {
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new contactClass("001", "John", "Doe", "0000000000", "123 street st, city state zipcode");
		 }); 
	}

}
