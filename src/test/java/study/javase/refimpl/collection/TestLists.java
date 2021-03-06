package study.javase.refimpl.collection;

import java.io.IOException;

import org.junit.Before;

import study.javase.collection.beans.Position;
import study.javase.refimpl.collection.beans.Employee;

public class TestLists extends study.javase.collection.TestLists {

	@Before
	public void init() throws IOException {
		lists = new Lists();
		prepareData();
	}

	protected Employee createEmployee(String name, double salary, Position position, String phone, String email) {
		Employee employee = new Employee(name, salary, position, phone,
				email == null || email.length() == 0 ? email : (email + "@myemail.com"));
		return employee;
	}
}
