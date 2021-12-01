package com.ripalay.testinandroidlesson6;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

//    @Test
//    public void checkBtnVisible(){
//        onView(withId(R.id.addBt)).perform(click());
//        onView(withId(R.id.subBt)).check(matches(isDisplayed()));
//    }
//
    @Test
    public void checkAddCause(){
        onView(withId(R.id.num1Et)).perform(typeText("7"));
        onView(withId(R.id.num2Et)).perform(typeText("3"));
        onView(withId(R.id.addBt)).perform(click());
        onView(withId(R.id.resTv)).check(matches(withText("10")));
    }
    @Test
    public void checkEmptyFieldCause(){
        onView(withId(R.id.num1Et)).perform(typeText(""));
        onView(withId(R.id.num2Et)).perform(typeText(""));
        onView(withId(R.id.multiplyBt)).perform(click());
        onView(withId(R.id.resTv)).check(matches(withText("")));
    }
    @Test
    public void checkWordsCause(){
        onView(withId(R.id.num1Et)).perform(typeText("fdf"));
        onView(withId(R.id.num2Et)).perform(typeText("vcnbmv"));
        onView(withId(R.id.addBt)).perform(click());
        onView(withId(R.id.resTv)).check(matches(withText("")));
    }

    @Test
    public void checkSpaceCause(){
        onView(withId(R.id.num1Et)).perform(typeText(" 3"));
        onView(withId(R.id.num2Et)).perform(typeText("3 "));
        onView(withId(R.id.addBt)).perform(click());
        onView(withId(R.id.resTv)).check(matches(withText("6")));
    }

}
