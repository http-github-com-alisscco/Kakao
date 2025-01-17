package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.idle
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.kakao.switch.SwitchableActions.Direction.LEFT
import io.github.kakaocup.kakao.switch.SwitchableActions.Direction.RIGHT
import io.github.kakaocup.sample.screen.TestActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TestActivityTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(TestActivity::class.java)

    @Test
    fun testContentScreen() {
        onScreen<TestActivityScreen> {
            content {
                isVisible()
            }

            toolbar {
                hasTitle("Test Activity")
                hasSubtitle("Subtitle")
                hasHomeAsUpIndicatorDrawable(R.drawable.ic_android_black_24dp)
            }

            textViewLarge {
                click()
                isVisible()
                hasText("LARGE")
                isCompletelyAbove {
                    withId(R.id.text_view_small)
                }
            }

            textViewSmall {
                isVisible()
                hasText("small")
                isCompletelyBelow {
                    withId(R.id.text_view_large)
                }
            }

            buttonViewLeft {
                isVisible()
                hasText("left")
                isCompletelyLeftOf {
                    withId(R.id.button_view_right)
                }
            }

            buttonViewRight {
                isVisible()
                hasText("right")
                isCompletelyRightOf {
                    withId(R.id.button_view_left)
                }
            }

            textViewSmall {
                isVisible()
                hasText("small")
                isCompletelyBelow {
                    withId(R.id.text_view_large)
                }
            }

            textViewColored {
                hasTextColor(R.color.background_color)
            }

            map {
                click()
                hasAnyTag("test_tag", "non_test_tag")
            }

            multiTypeRecycler {
                hasText("MULTI TYPE RECYCLER")
            }

            singleTypeRecycler {
                hasText("SINGLE TYPE RECYCLER")
            }

            autoComplete {
                hasText("AUTO_COMPLETE")
            }

            ratingbar {
                hasRating(0f)
                setRatingAt(3f)
                hasRating(3f)
            }

            snackbarButton {
                click()
            }

            snackbar {
                isDisplayed()

                text { hasText("This is snackbar!") }
                action {
                    hasText("DISMISS")
                    click()
                    idle(500)
                }

                doesNotExist()
            }

            seekbar {
                scrollTo()
                hasProgress(70)
                dragProgressTo(30)
                hasProgress(30)
            }

            switch {
                scrollTo()
                isChecked()
                click()
                isNotChecked()
                click()
                isChecked()
                swipeSwitchThumb(LEFT)
                swipeSwitchThumb(LEFT)
                isNotChecked()
                swipeSwitchThumb(RIGHT)
                swipeSwitchThumb(RIGHT)
                isChecked()
            }

            switchCompat {
                scrollTo()
                isChecked()
                click()
                isNotChecked()
                click()
                isChecked()
                swipeSwitchThumb(LEFT)
                swipeSwitchThumb(LEFT)
                isNotChecked()
                swipeSwitchThumb(RIGHT)
                swipeSwitchThumb(RIGHT)
                isChecked()
            }

            nestedTextView {
                scrollTo()
            }

            searchView {
                scrollTo()
                hasHint("This is the HINT!")
                hasHint(R.string.hint)
                typeQuery("Hello")
                hasQuery("Hello")
                appendQuery(", World!")
                hasQuery("Hello, World!")
            }
        }
    }
}
