package com.nagarro.training;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.nagarro.training.controller.Controller;

@WebMvcTest(Controller.class)
public class ControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetEmployee() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/employee")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1001))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("John Doe"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.designation").value("Manager"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.salary").value(50000.00));
	}
}
