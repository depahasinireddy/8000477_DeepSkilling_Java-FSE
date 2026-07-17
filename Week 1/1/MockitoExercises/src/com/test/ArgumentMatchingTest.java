package com.test;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class ArgumentMatchingTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.save("Hello");

        verify(mockApi).saveData(anyString());
    }
}