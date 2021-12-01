package com.ripalay.testinandroidlesson6;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CheckStringTest {
    CheckString checkString;

    @Before
    public void setup() {
        Context context = Mockito.mock(Context.class);
       // Mockito.when(context.getString(R.string.url)).thenReturn("URL");
        checkString = new CheckString(context);
    }

    @Test
    public void checkUrlTest(){
        checkString.checkUrl("URL");
    }
}
