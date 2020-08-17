package nl.hrmanagement.attendance;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.hrmanagement.attendance.security.jwt.JwtTokenUtil;
import nl.hrmanagement.attendance.service.IRESTController;
import nl.hrmanagement.attendance.service.IServiceProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityManagerFactory;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@AutoConfigureMockMvc //need this in Spring Boot test
@AutoConfigureTestEntityManager
public class AttendanceIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ObjectMapper objectMapper;

    @MockBean
    private IRESTController controller;

    @MockBean
    private EntityManagerFactory entityManagerFactory;

    @MockBean
    private IServiceProvider serviceProvider;

    @MockBean
    private JwtTokenUtil jwtTokenUtil;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void retrieveCompanyThroughAllLayers_noJWT() throws Exception {
        mockMvc.perform(get("/attendance/"))
                .andExpect(status().is(401));
    }

    @Test
    public void retrieveCompanyThroughAllLayers_withJWT() throws Exception {
        mockMvc.perform(get("/attendance/"))
                .andExpect(status().is(401));
    }

}
