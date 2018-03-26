package com.l.pset.pset3.view;

import com.l.pset.pset3.model.Movement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

public class JuryTest {
     private Jury jury = new Jury();
     private Movement movement1;
     private Movement movement2;

     @Before
    public void before(){
        movement1 = Mockito.mock(Movement.class);
        movement2 = Mockito.mock(Movement.class);
    }

    @Test
    public void testMove1wins() {
        // preconditions
        // obtaining result
        // making assertions

        Mockito.when(movement1.wins(movement2)).thenReturn(true);

        String result = jury.sayResult(movement1, movement2);

        assertEquals(result, "Player 1 wins");
    }
    @Test
    public void testMove2wins() {
        // preconditions
        // obtaining result
        // making assertions

        Mockito.when(movement1.wins(movement2)).thenReturn(false);
        Mockito.when(movement2.wins(movement1)).thenReturn(true);

        String result = jury.sayResult(movement1, movement2);

        assertEquals(result, "Player 2 wins");
    }
    @Test
    public void testNobodywins() {
        // preconditions
        // obtaining result
        // making assertions

        Mockito.when(movement1.wins(movement2)).thenReturn(false);
        Mockito.when(movement2.wins(movement1)).thenReturn(false);

        String result = jury.sayResult(movement1, movement2);

        assertEquals(result, "Nobody wins");
    }


    @Test
    public void sayResult() {

    }
}