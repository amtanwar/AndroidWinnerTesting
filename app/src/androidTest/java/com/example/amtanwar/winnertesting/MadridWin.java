package com.example.amtanwar.winnertesting;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MadridWin {

    @Rule
    public ActivityTestRule<Football> mActivityTestRule = new ActivityTestRule<>(Football.class);

    @Test
    public void madridWin() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.edit_barc), isDisplayed()));
        appCompatEditText.perform(replaceText("2"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.edit_barc), withText("2"), isDisplayed()));
        appCompatEditText2.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.edit_mad), isDisplayed()));
        appCompatEditText3.perform(replaceText("3"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.score_sub), withText("Submit Score"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction result = onView(allOf(withId(R.id.result_view), withText("Madrid won !"), isDisplayed()));
        result.perform(click());

    }

}
