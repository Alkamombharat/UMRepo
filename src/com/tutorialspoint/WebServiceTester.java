package com.tutorialspoint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class WebServiceTester {

	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/Usermanagement/rest/UserService/users";
	private static final String SUCCESS_RESULT = "<result>success</result>";
	private static final String PASS = "pass";
	private static final String FAIL = "fail";

	public WebServiceTester() {
		System.out.println("inside constructor");
	}

	private void init() {
		this.client = ClientBuilder.newClient();
	}

	public static void main(String[] args) {
		WebServiceTester tester = new WebServiceTester();
		// initialize the tester
		tester.init();
		// test get all users Web Service Method
		tester.testGetAllUsers();
		// test get user Web Service Method
		tester.testGetUser();

		// test update user Web Service Method
		tester.testUpdateUser();
		// test add user Web Service Method
		tester.testAddUser();
		// test delete user Web Service Method
		tester.testDeleteUser();
	}

	// Test: Get list of all users
	// Test: Check if list is not empty
	private void testGetAllUsers() {
		GenericType<List<User>> list = new GenericType<List<User>>() {
		};
		System.out.println("testGetAllUsers URl:-->" + client.target(REST_SERVICE_URL).toString());
		List<User> users = client.target(REST_SERVICE_URL).request(MediaType.APPLICATION_XML).get(list);
		String result = PASS;
		if (users.isEmpty()) {
			result = FAIL;
		}
		System.out.println("Test case name: testGetAllUsers, Result: " + result);
	}

	// Test: Get User of id 1
	// Test: Check if user is same as sample user
	private void testGetUser() {
		User sampleUser = new User();
		sampleUser.setId(1);

		System.out.println("testGetUser URL:-->"
				+ client.target(REST_SERVICE_URL).path("/{userid}").resolveTemplate("userid", 1).toString());
		User user = client.target(REST_SERVICE_URL).path("/{userid}").resolveTemplate("userid", 1)
				.request(MediaType.APPLICATION_XML).get(User.class);
		String result = FAIL;
		if (sampleUser != null && sampleUser.getId() == user.getId()) {
			result = PASS;
		}
		System.out.println("Test case name: testGetUser, Result: " + result);
	}

	// Test: Update User of id 1
	// Test: Check if result is success XML.
	private void testUpdateUser() {
		Form form = new Form();
		form.param("id", "1");
		form.param("name", "suresh");
		form.param("profession", "clerk");

		System.out.println("testUpdateUser URL:-->" + client.target(REST_SERVICE_URL).toString());
		String callResult = client.target(REST_SERVICE_URL).request(MediaType.APPLICATION_XML)
				.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), String.class);
		String result = PASS;
		if (!SUCCESS_RESULT.equals(callResult)) {
			result = FAIL;
		}

		System.out.println("Test case name: testUpdateUser, Result: " + result);
	}

	// Test: Add User of id 2
	// Test: Check if result is success XML.
	private void testAddUser() {
		Form form = new Form();
		form.param("id", "2");
		form.param("name", "naresh");
		form.param("profession", "clerk");

		System.out.println("testAddUser:-->" + client.target(REST_SERVICE_URL).toString());
		String callResult = client.target(REST_SERVICE_URL).request(MediaType.APPLICATION_XML)
				.put(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE), String.class);

		String result = PASS;
		if (!SUCCESS_RESULT.equals(callResult)) {
			result = FAIL;
		}

try {
            
            URL url = new URL("http://192.168.1.101:8080/javaworld/servlet/HelloJavaWorld");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            
            BufferedWriter out = 
                new BufferedWriter( new OutputStreamWriter( conn.getOutputStream() ) );
            out.write("username=javaworld\r\n");
            out.flush();
            out.close();
            BufferedReader in = 
                new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
            
            String response;
            while ( (response = in.readLine()) != null ) {
                System.out.println( response );
            }
            in.close();
        }
        catch ( MalformedURLException ex ) {
            // a real program would need to handle this exception
        }
        catch ( IOException ex ) {
            // a real program would need to handle this exception
        }
		System.out.println("Test case name: testAddUser, Result: " + result);
	}

	// Test: Delete User of id 2
	// Test: Check if result is success XML.
	private void testDeleteUser() {
		System.out.println("testDeleteUser:-->"
				+ client.target(REST_SERVICE_URL).path("/{userid}").resolveTemplate("userid", 2).toString());
		String callResult = client.target(REST_SERVICE_URL).path("/{userid}").resolveTemplate("userid", 2)
				.request(MediaType.APPLICATION_XML).delete(String.class);

		String result = PASS;
		if (!SUCCESS_RESULT.equals(callResult)) {
			result = FAIL;
		}
		System.out.println("Test case name: testDeleteUser, Result: " + result);
	}
}
