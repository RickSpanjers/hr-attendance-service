package nl.hrmanagement.attendance;

import nl.hrmanagement.attendance.dto.*;
import nl.hrmanagement.attendance.service.impl.AttendanceServiceProvider;
import org.hibernate.service.spi.ServiceException;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * @author Rick Spanjers
 * @since 21/10/2019
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class AttendanceApplicationTests {

	@InjectMocks
	private AttendanceServiceProvider attendanceServiceProvider;

	@Before
	public void setUp() {
		ClassLoader classLoader = getClass().getClassLoader();
		MockitoAnnotations.initMocks(this);
	}

	public AttendanceApplicationTests() throws ServiceException {

	}

	@Test
	public void setupContext(){

	}

	@Test(expected = NullPointerException.class)
	public void testRequestAttendance_NoUserId(){
		GenericResponseDTO actualResult = attendanceServiceProvider.requestAttendance(UUID.fromString("74fb46e0-4ea3-4018-9780-86455c457e01"));
		assertFalse(actualResult.getSuccess());
	}

	@Test(expected = NullPointerException.class)
	public void testRetrieveAttendance_NoUserId(){
		GenericResponseDTO actualResult = attendanceServiceProvider.retrieveAttendance(UUID.fromString("74fb46e0-4ea3-4018-9780-86455c457e01"));
		assertFalse(actualResult.getSuccess());
	}

}
