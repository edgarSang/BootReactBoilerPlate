package com.backend.web;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.test.web.servlet.MockMvc;

import com.backend.api.user.PostsController;
import com.backend.api.user.PostsRepository;
import com.backend.api.user.PostsService;

@WebMvcTest(PostsController.class)
@AutoConfigureMockMvc(addFilters = false)
@MockBean(JpaMetamodelMappingContext.class)
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
