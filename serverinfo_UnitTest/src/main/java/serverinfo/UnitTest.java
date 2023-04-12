/*
 * UnitTest
 * Test generated by Generator  on Apr 12, 2023 10:57:53 AM
 */
package serverinfo;

import org.junit.jupiter.api.AfterEach;
import com.ibm.integration.test.v1.TestSetup;
import com.ibm.integration.test.v1.exception.TestException;
import static com.ibm.integration.test.v1.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import com.ibm.integration.test.v1.NodeSpy;
import com.ibm.integration.test.v1.SpyObjectReference;
import org.junit.jupiter.api.Test;
import com.ibm.integration.test.v1.TestMessageAssembly;
import java.io.InputStream;


public class UnitTest {

    @AfterEach
    public void cleanupTest() throws TestException {
        // Ensure any mocks created by a test are cleared after the test runs 
        TestSetup.restoreAllMocks();
    }

    @Test
    public void serverinfo_getServerInfo_BuildBasicResponse_TestCase_001() throws TestException {

        // Define the SpyObjectReference
        SpyObjectReference nodeReference = new SpyObjectReference().application("serverinfo").messageFlow("getServerInfo").node("BuildBasicResponse");   

        // Initialise a NodeSpy
        NodeSpy nodeSpy = new NodeSpy(nodeReference);

        // Declare a new TestMessageAssembly object for the message being sent into the node
        TestMessageAssembly inputMessageAssembly = new TestMessageAssembly();

        // Create a Message Assembly from the input data file
        try {
            String messageAssemblyPath = "/0009A90B-6436F11F-00000003-1.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            inputMessageAssembly.buildFromRecordedMessageAssembly(messageStream);
        }
        catch (Exception ex) {
            throw new TestException("Failed to load input message", ex);
        }

        // Call the message flow node with the Message Assembly
        nodeSpy.evaluate(inputMessageAssembly, true, "in");

        // Assert the number of times that the node is called
        assertThat(nodeSpy, nodeCallCountIs(1));

        // Assert the terminal propagate count for the message
        assertThat(nodeSpy, terminalPropagateCountIs("out", 1));

        // Compare Output Message 1 at output terminal out

        try {
            TestMessageAssembly actualMessageAssembly = null;
            TestMessageAssembly expectedMessageAssembly = null;

            // Get the TestMessageAssembly object for the actual propagated message
            actualMessageAssembly = nodeSpy.propagatedMessageAssembly("out", 1);

            // Assert output message body data
            // Get the TestMessageAssembly object for the expected propagated message
            expectedMessageAssembly = new TestMessageAssembly();

            // Create a Message Assembly from the expected output mxml resource
            String messageAssemblyPath = "/0009A90B-6436F11F-00000003-2.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            expectedMessageAssembly.buildFromRecordedMessageAssembly(messageStream);

            // Assert that the actual message tree matches the expected message tree
            assertThat(actualMessageAssembly, equalsMessage(expectedMessageAssembly));

        }
        catch (Exception ex) {
            throw new TestException("Failed to compare with expected message", ex);
        }

    }

    @Test
    public void serverinfo_getServerInfo_BuildBasicResponse_TestCase_002() throws TestException {

        // Define the SpyObjectReference
        SpyObjectReference nodeReference = new SpyObjectReference().application("serverinfo").messageFlow("getServerInfo").node("BuildBasicResponse");   

        // Initialise a NodeSpy
        NodeSpy nodeSpy = new NodeSpy(nodeReference);

        // Declare a new TestMessageAssembly object for the message being sent into the node
        TestMessageAssembly inputMessageAssembly = new TestMessageAssembly();

        // Create a Message Assembly from the input data file
        try {
            String messageAssemblyPath = "/0009A90B-6436F11F-00000002-1.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            inputMessageAssembly.buildFromRecordedMessageAssembly(messageStream);
        }
        catch (Exception ex) {
            throw new TestException("Failed to load input message", ex);
        }

        // Call the message flow node with the Message Assembly
        nodeSpy.evaluate(inputMessageAssembly, true, "in");

        // Assert the number of times that the node is called
        assertThat(nodeSpy, nodeCallCountIs(1));

        // Assert the terminal propagate count for the message
        assertThat(nodeSpy, terminalPropagateCountIs("out", 1));

        // Compare Output Message 1 at output terminal out

        try {
            TestMessageAssembly actualMessageAssembly = null;
            TestMessageAssembly expectedMessageAssembly = null;

            // Get the TestMessageAssembly object for the actual propagated message
            actualMessageAssembly = nodeSpy.propagatedMessageAssembly("out", 1);

            // Assert output message body data
            // Get the TestMessageAssembly object for the expected propagated message
            expectedMessageAssembly = new TestMessageAssembly();

            // Create a Message Assembly from the expected output mxml resource
            String messageAssemblyPath = "/0009A90B-6436F11F-00000002-2.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            expectedMessageAssembly.buildFromRecordedMessageAssembly(messageStream);

            // Assert that the actual message tree matches the expected message tree
            assertThat(actualMessageAssembly, equalsMessage(expectedMessageAssembly));

        }
        catch (Exception ex) {
            throw new TestException("Failed to compare with expected message", ex);
        }

    }

    @Test
    public void serverinfo_getServerInfo_BuildBasicResponse_TestCase_003() throws TestException {

        // Define the SpyObjectReference
        SpyObjectReference nodeReference = new SpyObjectReference().application("serverinfo").messageFlow("getServerInfo").node("BuildBasicResponse");   

        // Initialise a NodeSpy
        NodeSpy nodeSpy = new NodeSpy(nodeReference);

        // Declare a new TestMessageAssembly object for the message being sent into the node
        TestMessageAssembly inputMessageAssembly = new TestMessageAssembly();

        // Create a Message Assembly from the input data file
        try {
            String messageAssemblyPath = "/0009A90B-6436F11F-00000001-1.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            inputMessageAssembly.buildFromRecordedMessageAssembly(messageStream);
        }
        catch (Exception ex) {
            throw new TestException("Failed to load input message", ex);
        }

        // Call the message flow node with the Message Assembly
        nodeSpy.evaluate(inputMessageAssembly, true, "in");

        // Assert the number of times that the node is called
        assertThat(nodeSpy, nodeCallCountIs(1));

        // Assert the terminal propagate count for the message
        assertThat(nodeSpy, terminalPropagateCountIs("out", 1));

        // Compare Output Message 1 at output terminal out

        try {
            TestMessageAssembly actualMessageAssembly = null;
            TestMessageAssembly expectedMessageAssembly = null;

            // Get the TestMessageAssembly object for the actual propagated message
            actualMessageAssembly = nodeSpy.propagatedMessageAssembly("out", 1);

            // Assert output message body data
            // Get the TestMessageAssembly object for the expected propagated message
            expectedMessageAssembly = new TestMessageAssembly();

            // Create a Message Assembly from the expected output mxml resource
            String messageAssemblyPath = "/0009A90B-6436F11F-00000001-2.mxml";
            InputStream messageStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(messageAssemblyPath);
            if (messageStream == null)
            {
                throw new TestException("Unable to locate message assembly file: " + messageAssemblyPath);
            }
            expectedMessageAssembly.buildFromRecordedMessageAssembly(messageStream);

            // Assert that the actual message tree matches the expected message tree
            assertThat(actualMessageAssembly, equalsMessage(expectedMessageAssembly));

        }
        catch (Exception ex) {
            throw new TestException("Failed to compare with expected message", ex);
        }

    }

}
