package com.elitlabs.ecommerce.test;

import com.elitlabs.ecommerce.controllers.Payment;
import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.services.PaymentServices;
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
@WebMvcTest(value = Payment.class, secure = false)
public class PaymentServiceTestClient {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PaymentServices paymentServices;

    @Test
    public void find() throws Exception {
        PaymentDTO newpayment = new PaymentDTO();
        newpayment.setP_id(1);
        newpayment.setP_date("2019-5-19");
        newpayment.setP_price("2000");
        newpayment.setP_CustomerDetails("Dilshan");
        newpayment.setP_SellerDetails("Nuwan");

        List<PaymentDTO> paymentDTOS = Arrays.asList(newpayment);
        given(paymentServices.findAllPayment()).willReturn(paymentDTOS);

        this.mockMvc.perform((get("http://localhost:8080/payment/all")))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'p_id': 1, 'p_date': '2019-5-19', 'p_price':'2000', 'p_CustomerDetails':'Dilshan', 'p_SellerDetails':'Nuwan'}]"));
    }
}
