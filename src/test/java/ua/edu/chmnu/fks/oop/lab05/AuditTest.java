package ua.edu.chmnu.fks.oop.lab05;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AuditTest {

    @Test
    public void addFirst() {
        List list = mock(List.class);
        list.addFirst(2);
        verify(list, times(1)).addFirst(2);
    }

    @Test
    public void addLast() {
        List list = mock(List.class);
        list.addLast(5);
        verify(list, times(1)).addLast(5);
    }

    @Test
    public void find() {
        List list = new List();
        list.addFirst(2);
        int actual = list.find(2).getData();
        assertEquals(2, actual);
    }

    @Test
    public void printList() {
        List list = mock(List.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.printList();
        verify(list, times(1)).printList();
    }

    @Test
    public void reverseList() {
        List list = mock(List.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.reverseList();
        verify(list, times(1)).reverseList();
    }

    @Test
    public void lengthList() {
        List list = mock(List.class);
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.addLast(5);
        list.addLast(9);
        when(list.lengthList()).thenReturn(5);
        assertEquals(list.lengthList(), 5);
        verify(list).lengthList();
        doReturn(5).when(list).lengthList();
    }
}