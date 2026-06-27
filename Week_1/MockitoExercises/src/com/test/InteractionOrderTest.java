package com.test;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InOrder;

public class InteractionOrderTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();
        mockApi.saveData("Hello");

        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).saveData("Hello");
    }
}