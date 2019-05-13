package org.common.test;

import org.common.MessageService;
import org.junit.Test;


public class MessageServiceTest {
	@Test
	public void should_return_hello_world() {
		// Arrange
		MessageService service = new MessageService();
		String expected = "Hello World";
		
		// Act
		String actual = service.GetMessage();
		
		// Assert
		org.junit.Assert.assertEquals(expected, actual);
	}
}
