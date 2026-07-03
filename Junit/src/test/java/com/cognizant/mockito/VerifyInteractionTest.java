package com.cognizant.mockito;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Pass mock object to service
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }
}