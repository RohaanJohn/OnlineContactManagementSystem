package com.example.OnlineContactManagementSystem;
import com.example.OnlineContactManagementSystem.entity.UserTable;
import com.example.OnlineContactManagementSystem.services.UserServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserServiceImpl userService;

	private UserTable usertable;

	@BeforeEach
	public void setUp() {
		usertable = new UserTable();
		usertable.setUserName("John");
		usertable.setUserPhoneNumber("897655321");
		usertable.setUserEmailAddress("john@gmail.com");
	}

	@Test
	public void testCreateUser() throws Exception {
		mockMvc.perform(post("http://localhost:8080/api/v1/users")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{ \"userName\": \"John\", \"userPhoneNumber\": \"897655321\", \"userEmailAddress\": \"john@gmail.com\" }"))
				.andExpect(status().isOk());
	}

	@Test
	public void testDisplayUser() throws Exception {
		mockMvc.perform(get("http://localhost:8080/api/v1/users/1")
						.contentType(MediaType.APPLICATION_JSON)
						.content(""))
				.andExpect(status().isOk());

	}

	@Test
	public void testUpdateUser() throws Exception {
		mockMvc.perform(put("http://localhost:8080/api/v1/users/2")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{ \"userName\": \"Tom\", \"userPhoneNumber\": \"0897655321\", \"userEmailAddress\": \"tom@gmail.com\" }"))
				.andExpect(status().isOk());

	}

	@Test
	public void testDeleteUser() throws Exception {
		mockMvc.perform(delete("http://localhost:8080/api/v1/users/152")
						.contentType(MediaType.APPLICATION_JSON)
						.content(""))
				.andExpect(status().isOk());

	}
}