import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.olixstudios.contactbook.model.Contact;
import com.olixstudios.contactbook.service.ContactService;
import com.olixstudios.contactbook.service.ContactServiceImpl;

public class ContactServiceTest {
private ContactService contactService;

    @BeforeEach
    public void setup() {
        contactService = new ContactServiceImpl();
    }

    @Test
    public void testAddAndGetContact() {
        contactService.addContact("Alice", "123");
        Contact contact = contactService.getContact("Alice");
        assertNotNull(contact);
        assertEquals("Alice", contact.getName());
        assertEquals("123", contact.getPhoneNumber());
    }

    @Test
    public void testDeleteContact() {
        contactService.addContact("Bob", "999");
        System.out.println(contactService.getAllContacts());
        boolean deleted = contactService.deleteContact("Bob");
        assertTrue(deleted);
        assertNull(contactService.getContact("Bob"));
    }

    @Test
    public void testGetAllContactsSorted() {
        contactService.addContact("Zara", "1");
        contactService.addContact("Amy", "2");
        contactService.addContact("Mike", "3");

        List<Contact> all = contactService.getAllContacts();
        assertEquals(3, all.size());
        assertEquals("Amy", all.get(0).getName());
        assertEquals("Mike", all.get(1).getName());
        assertEquals("Zara", all.get(2).getName());
    }
}
