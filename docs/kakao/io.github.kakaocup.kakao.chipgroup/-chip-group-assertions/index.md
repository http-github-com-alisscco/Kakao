//[kakao](../../../index.md)/[io.github.kakaocup.kakao.chipgroup](../index.md)/[ChipGroupAssertions](index.md)



# ChipGroupAssertions  
 [androidJvm] interface [ChipGroupAssertions](index.md) : [BaseAssertions](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)

Provides assertions for a ChipGroup

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/assert/#kotlin.Function0[androidx.test.espresso.ViewAssertion]/PointingToDeclaration/"></a>[assert](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/assert.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/assert/#kotlin.Function0[androidx.test.espresso.ViewAssertion]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [assert](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/assert.md)(function: () -> ViewAssertion)  <br>More info  <br>Check the view with the given custom assertion  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/doesNotExist/#/PointingToDeclaration/"></a>[doesNotExist](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/does-not-exist.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/doesNotExist/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [doesNotExist](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/does-not-exist.md)()  <br>More info  <br>Checks if the matched view does not exist  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasAnyTag/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[hasAnyTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-any-tag.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasAnyTag/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasAnyTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-any-tag.md)(vararg tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Checks if the view has at least one of the given tags  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasBackgroundColor/#kotlin.Int/PointingToDeclaration/"></a>[hasBackgroundColor](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-background-color.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasBackgroundColor/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasBackgroundColor](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-background-color.md)(@[ColorRes](https://developer.android.com/reference/kotlin/androidx/annotation/ColorRes.html)()resId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>open fun [hasBackgroundColor](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-background-color.md)(colorCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Checks if the view has given background color  <br><br><br>|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/hasChip/#kotlin.Int/PointingToDeclaration/"></a>[hasChip](has-chip.md)| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/hasChip/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasChip](has-chip.md)(@[IdRes](https://developer.android.com/reference/kotlin/androidx/annotation/IdRes.html)()id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Check if ChipGroup has a Chip with id  <br><br><br>[androidJvm]  <br>Content  <br>open fun [hasChip](has-chip.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Check for Chip with text  <br><br><br>[androidJvm]  <br>Content  <br>open fun [hasChip](has-chip.md)(matcher: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Check for Chip with matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasDescendant/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[hasDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-descendant.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasDescendant/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-descendant.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view has given descendant  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasNotDescendant/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[hasNotDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-descendant.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasNotDescendant/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasNotDescendant](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-descendant.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view has not given descendant  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasNotSibling/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[hasNotSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-sibling.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasNotSibling/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasNotSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-not-sibling.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view has not given sibling  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasSibling/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[hasSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-sibling.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasSibling/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasSibling](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-sibling.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view has given sibling  <br><br><br>|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/hasSize/#kotlin.Int/PointingToDeclaration/"></a>[hasSize](has-size.md)| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/hasSize/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasSize](has-size.md)(size: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Check if ChipGroup has size number of chips  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasTag/#kotlin.String/PointingToDeclaration/"></a>[hasTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-tag.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/hasTag/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasTag](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/has-tag.md)(tag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Checks if the view has given tag  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/inRoot/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.RootBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[inRoot](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/in-root.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/inRoot/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.RootBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [inRoot](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/in-root.md)(function: [RootBuilder](../../io.github.kakaocup.kakao.common.builders/-root-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Check if the view is in given root  <br><br><br>|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/isChipSelected/#kotlin.Int/PointingToDeclaration/"></a>[isChipSelected](is-chip-selected.md)| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/isChipSelected/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isChipSelected](is-chip-selected.md)(@[IdRes](https://developer.android.com/reference/kotlin/androidx/annotation/IdRes.html)()id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Check if Chip with matching id in ChipGroup is selected  <br><br><br>[androidJvm]  <br>Content  <br>open fun [isChipSelected](is-chip-selected.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>open fun [isChipSelected](is-chip-selected.md)(matcher: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Check if Chip with matching text in ChipGroup is selected  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isClickable/#/PointingToDeclaration/"></a>[isClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-clickable.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isClickable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-clickable.md)()  <br>More info  <br>Checks if the view is clickable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyAbove/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[isCompletelyAbove](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-above.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyAbove/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isCompletelyAbove](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-above.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view displayed is completely above of the view matching the given matcher.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyBelow/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[isCompletelyBelow](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-below.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyBelow/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isCompletelyBelow](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-below.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view displayed is completely below of the view matching the given matcher.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyDisplayed/#/PointingToDeclaration/"></a>[isCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-displayed.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyDisplayed/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-displayed.md)()  <br>More info  <br>Checks if the view is completely displayed  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyLeftOf/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[isCompletelyLeftOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-left-of.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyLeftOf/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isCompletelyLeftOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-left-of.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view displayed is completely right of the view matching the given matcher.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyRightOf/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[isCompletelyRightOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-right-of.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isCompletelyRightOf/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isCompletelyRightOf](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-completely-right-of.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the view displayed is completely right of the view matching the given matcher.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isDisabled/#/PointingToDeclaration/"></a>[isDisabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-disabled.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isDisabled/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isDisabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-disabled.md)()  <br>More info  <br>Checks if the view is disabled  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isDisplayed/#/PointingToDeclaration/"></a>[isDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-displayed.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isDisplayed/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-displayed.md)()  <br>More info  <br>Checks if the view is displayed  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isEnabled/#/PointingToDeclaration/"></a>[isEnabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-enabled.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isEnabled/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isEnabled](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-enabled.md)()  <br>More info  <br>Checks if the view is enabled  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isFocusable/#/PointingToDeclaration/"></a>[isFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focusable.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isFocusable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focusable.md)()  <br>More info  <br>Checks if the view is focusable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isFocused/#/PointingToDeclaration/"></a>[isFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focused.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isFocused/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-focused.md)()  <br>More info  <br>Checks if the view is focused  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isGone/#/PointingToDeclaration/"></a>[isGone](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-gone.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isGone/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isGone](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-gone.md)()  <br>More info  <br>Checks if the view has GONE visibility  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isInvisible/#/PointingToDeclaration/"></a>[isInvisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-invisible.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isInvisible/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isInvisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-invisible.md)()  <br>More info  <br>Checks if the view has INVISIBLE visibility  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotClickable/#/PointingToDeclaration/"></a>[isNotClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-clickable.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotClickable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotClickable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-clickable.md)()  <br>More info  <br>Checks if the view is not clickable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotCompletelyDisplayed/#/PointingToDeclaration/"></a>[isNotCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-completely-displayed.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotCompletelyDisplayed/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotCompletelyDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-completely-displayed.md)()  <br>More info  <br>Checks if the view is not completely displayed  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotDisplayed/#/PointingToDeclaration/"></a>[isNotDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-displayed.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotDisplayed/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotDisplayed](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-displayed.md)()  <br>More info  <br>Checks if the view is not displayed  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotFocusable/#/PointingToDeclaration/"></a>[isNotFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focusable.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotFocusable/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotFocusable](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focusable.md)()  <br>More info  <br>Checks if the view is not focusable  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotFocused/#/PointingToDeclaration/"></a>[isNotFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focused.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotFocused/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotFocused](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-focused.md)()  <br>More info  <br>Checks if the view is not focused  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotSelected/#/PointingToDeclaration/"></a>[isNotSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-selected.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isNotSelected/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isNotSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-not-selected.md)()  <br>More info  <br>Checks if the view is not selected  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isSelected/#/PointingToDeclaration/"></a>[isSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-selected.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isSelected/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isSelected](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-selected.md)()  <br>More info  <br>Checks if the view is selected  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isVisible/#/PointingToDeclaration/"></a>[isVisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-visible.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/isVisible/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [isVisible](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/is-visible.md)()  <br>More info  <br>Checks if the view has VISIBLE visibility  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/matches/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[matches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/matches.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/matches/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [matches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/matches.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Check if the view matches given matcher  <br><br><br>|
| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/notMatches/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[notMatches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/not-matches.md)| <a name="io.github.kakaocup.kakao.common.assertions/BaseAssertions/notMatches/#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [notMatches](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/not-matches.md)(function: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Check if the view does not match given matcher  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/root/#/PointingToDeclaration/"></a>[root](index.md#-1098886823%2FProperties%2F34310170)| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/root/#/PointingToDeclaration/"></a> [androidJvm] abstract var [root](index.md#-1098886823%2FProperties%2F34310170): Matcher<Root>   <br>|
| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/view/#/PointingToDeclaration/"></a>[view](index.md#-2026174218%2FProperties%2F34310170)| <a name="io.github.kakaocup.kakao.chipgroup/ChipGroupAssertions/view/#/PointingToDeclaration/"></a> [androidJvm] abstract val [view](index.md#-2026174218%2FProperties%2F34310170): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.chipgroup/KChipGroup///PointingToDeclaration/"></a>[KChipGroup](../-k-chip-group/index.md)|
