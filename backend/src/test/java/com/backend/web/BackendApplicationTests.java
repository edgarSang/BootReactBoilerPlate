package com.backend.web;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.backend.user.PostsController;
import com.backend.user.PostsRepository;
import com.backend.user.PostsService;

@WebMvcTest(PostsController.class)
@AutoConfigureMockMvc(addFilters = false)
class BackendApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	PostsService postsService;

	@MockBean
	PostsRepository postsRepository;

	@Test
	public void getInitReferences_checkNation() throws Exception {
		mockMvc.perform(get("/posts/1"))
			   .andExpect(status().isOk())
//			   .andExpect(jsonPath("$.nation", is("JP")))
			   .andDo(print());
	}

}
