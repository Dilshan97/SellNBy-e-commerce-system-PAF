package com.elitlabs.ecommerce.test;

import com.elitlabs.ecommerce.controllers.User;
import com.elitlabs.ecommerce.models.UserDTO;
import com.elitlabs.ecommerce.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = User.class, secure = false)
public class UserServiceTestClient {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void find() throws Exception {

        UserDTO newuser = new UserDTO();
        newuser.setUser_id(1);
        newuser.setFirst_name("Nuwan");
        newuser.setLast_name("Chamikara");
        newuser.setEmail("chamikaragmn@gmail.com");
        newuser.setPhone("0715849445");
        newuser.setRole("Seller");
        newuser.setPassword("123456");


        List<UserDTO> userDTOS = Arrays.asList(newuser);
        given(userService.allUser()).willReturn(userDTOS);

        this.mockMvc.perform((get("http://localhost:8080//api/User/all")))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'user_id': 1, 'first_name': 'Nuwan', 'last_name': 'Chamikara', 'email': 'chamikaragmn@gmail.com', 'phone': '0715849445', 'role': 'Seller', 'password': '123456'}]"));
    }
}
