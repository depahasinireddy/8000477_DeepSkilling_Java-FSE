package com.test;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).saveData(anyString());

        mockApi.saveData("Sample");

        verify(mockApi).saveData("Sample");
    }
}