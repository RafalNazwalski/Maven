package org.wwsis.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wwsis.lab1.model.Student;

public class StudentTest {

	@Test
	public void testMultiply() {
		Student student = new Student();
		assertEquals("10 x 5 must be 50", 50, student.multiply(10, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown(){
		Student student = new Student();
		student.multiply(100, 5);
	}
	
	@Test
	public void testSetAge(){
		Student student = new Student();
		student.setAge(10);
		assertEquals("10 x 5 must be 50", 10, student.getAge());
	}
}
