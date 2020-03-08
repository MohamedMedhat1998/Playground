package com.andalus.playground

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.andalus.playground.ConstraintMatcher.Companion.PARENT
import com.andalus.playground.ConstraintMatcher.Constraint.*
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun check_constraints() {
        onView(withId(R.id.button)).check(matches(ConstraintMatcher(TopToTop, PARENT)))
        onView(withId(R.id.button)).check(matches(ConstraintMatcher(EndToEnd, PARENT)))
        onView(withId(R.id.button)).check(matches(ConstraintMatcher(StartToStart, R.id.guideline)))
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.andalus.playground", appContext.packageName)
    }
}
