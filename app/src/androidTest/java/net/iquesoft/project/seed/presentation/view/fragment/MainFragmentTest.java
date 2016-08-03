package net.iquesoft.project.seed.presentation.view.fragment;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import net.iquesoft.project.seed.R;
import net.iquesoft.project.seed.presentation.view.activity.TestFragmentActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainFragmentTest {

    @Rule
    public ActivityTestRule<TestFragmentActivity> activityTestRule =
            new ActivityTestRule<>(TestFragmentActivity.class);

    @Before
    public void setUp() throws Exception {
        activityTestRule.getActivity();
        activityTestRule.getActivity().getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new MainFragment(), null).commit();
    }

    @Test
    public void testControls() throws Exception {
        onView(withId(R.id.tvMainFragment)).check(matches(isDisplayed()));
    }
}