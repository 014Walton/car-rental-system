import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MainTest {
    private Main mainFrame;

    @BeforeEach
    void setUp() {
        // Initialize the main GUI before each test
        mainFrame = new Main();
    }

    @AfterEach
    void tearDown() {
        // Close the window after each test
        mainFrame.dispose();
    }

    @Test
    void testWindowInitialization() {
        // Check if the main JFrame is visible
        assertTrue(mainFrame.isVisible(), "Main window should be visible");
        
        // Check if the heading label exists
        JLabel heading = (JLabel) mainFrame.getContentPane().getComponent(0);
        assertNotNull(heading, "Heading label should exist");
        assertEquals("Welcome to Car Rental System", heading.getText(), "Heading text should match");
    }

    @Test
    void testAdminButtonClick() {
        JButton adminButton = (JButton) mainFrame.getContentPane().getComponent(1);
        assertNotNull(adminButton, "Admin button should exist");

        // Simulate Admin button click
        ActionEvent event = new ActionEvent(adminButton, ActionEvent.ACTION_PERFORMED, "");
        mainFrame.actionPerformed(event);

        // Check if AdminLogin is triggered (mock this if needed)
        // Normally, you'd verify that a new AdminLogin window opens
    }

    @Test
    void testCustomerButtonClick() {
        JButton customerButton = (JButton) mainFrame.getContentPane().getComponent(2);
        assertNotNull(customerButton, "Customer button should exist");

        // Simulate Customer button click
        ActionEvent event = new ActionEvent(customerButton, ActionEvent.ACTION_PERFORMED, "");
        mainFrame.actionPerformed(event);

        // Check if CustomerLogin is triggered (mock this if needed)
    }
}
