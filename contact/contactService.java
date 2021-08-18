package contact;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class contactService {
	
   /*
      contacts is a Map Object. To add, delete, update Contact object,we are using Map DataStructure
   */
	
   public static int uniqueId = 0;
   public static Map<Integer, contactClass> contacts = new HashMap<>();

   /*
      addContact() inserts contact object into map
   */
   
   public Map<Integer, contactClass> addContact(contactClass contact) {
       uniqueId++;
       contacts.put(uniqueId, contact);
       return contacts;
   }
	  
   /*
      deleteContact() will use contactID to find map object and delete contact
   */

   public Map<Integer, contactClass> deleteContact(String contactID) {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) {
    	   
           Map.Entry<Integer, contactClass> entry = (Map.Entry<Integer, contactClass>) itr.next();
           if (entry.getValue().getcontactID() == contactID) {
               itr.remove();
           }
       }

       return contacts;

   }
	  
   /*
      updateContact() uses contactID to find map contact object and updates other variables
   */

   public Map<Integer, contactClass> updateContact(String contactID, String firstName, String lastName, String phone,
           String address) {

       Iterator itr = contacts.entrySet().iterator();

       while (itr.hasNext()) {

    	   Map.Entry<Integer, contactClass> entry = (Map.Entry<Integer, contactClass>) itr.next();

           if (entry.getValue().getcontactID() == contactID) {
               entry.getValue().setfirstName(firstName);
               entry.getValue().setlastName(lastName);
               entry.getValue().setphone(phone);
               entry.getValue().setaddress(address);
           }

       }

       return contacts;

   }
}

