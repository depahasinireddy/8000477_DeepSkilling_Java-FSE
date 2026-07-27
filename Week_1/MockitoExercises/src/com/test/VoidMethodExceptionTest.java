package com.test;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class VoidMethodExceptionTest {

    @Test(expected = RuntimeException.class)
    public void testVoidMethodException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException())
                .when(mockApi)
                .saveData(anyString());

        mockApi.saveData("Test");
    }
}