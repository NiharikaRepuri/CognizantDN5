package com.cognizant.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testFetchData() {

        // Create a mock object of ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the getData() method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Pass the mock object to MyService
        MyService service = new MyService(mockApi);

        // Call the method
        String result = service.fetchData();

        // Verify the result
        assertEquals("Mock Data", result);
    }
}