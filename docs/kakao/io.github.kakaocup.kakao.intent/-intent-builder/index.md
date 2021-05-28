//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intent](../index.md)/[IntentBuilder](index.md)



# IntentBuilder  
 [androidJvm] class [IntentBuilder](index.md)

Class for building Intent matchers

   


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/IntentBuilder/#/PointingToDeclaration/"></a>[IntentBuilder](-intent-builder.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/IntentBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [IntentBuilder](-intent-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/any/#/PointingToDeclaration/"></a>[any](any.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/any/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [any](any.md)()  <br>More info  <br>Matches any intent  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/getMatcher/#/PointingToDeclaration/"></a>[getMatcher](get-matcher.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/getMatcher/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getMatcher](get-matcher.md)(): Matcher<[Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/getResult/#/PointingToDeclaration/"></a>[getResult](get-result.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/getResult/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getResult](get-result.md)(): [Instrumentation.ActivityResult](https://developer.android.com/reference/kotlin/android/app/Instrumentation.ActivityResult.html)?  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasAction/#kotlin.String/PointingToDeclaration/"></a>[hasAction](has-action.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasAction/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasAction](has-action.md)(action: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasAction](has-action.md)(action: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches intent with given action  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasCategories/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[hasCategories](has-categories.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasCategories/#kotlin.Array[kotlin.String]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasCategories](has-categories.md)(vararg categories: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasCategories](has-categories.md)(categories: Matcher<out [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>)  <br>More info  <br>Matches intent with given categories  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#android.content.ComponentName/PointingToDeclaration/"></a>[hasComponent](has-component.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#android.content.ComponentName/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasComponent](has-component.md)(component: [ComponentName](https://developer.android.com/reference/kotlin/android/content/ComponentName.html))  <br>fun [hasComponent](has-component.md)(function: [ComponentNameBuilder](../-component-name-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>fun [hasComponent](has-component.md)(component: Matcher<[ComponentName](https://developer.android.com/reference/kotlin/android/content/ComponentName.html)>)  <br>More info  <br>Matches intent with given component  <br><br><br>[androidJvm]  <br>Content  <br>fun [hasComponent](has-component.md)(className: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Matches intent which component has given class name  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasData/#android.net.Uri/PointingToDeclaration/"></a>[hasData](has-data.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasData/#android.net.Uri/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasData](has-data.md)(uri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html))  <br>fun [hasData](has-data.md)(function: [UriBuilder](../-uri-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>fun [hasData](has-data.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasData](has-data.md)(uri: Matcher<[Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)>)  <br>More info  <br>Matches intent with given data  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtra/#kotlin.String#kotlin.Any/PointingToDeclaration/"></a>[hasExtra](has-extra.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtra/#kotlin.String#kotlin.Any/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasExtra](has-extra.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br>fun [hasExtra](has-extra.md)(key: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, value: Matcher<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>More info  <br>Matches intent with given extra  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtras/#kotlin.Function1[io.github.kakaocup.kakao.intent.BundleBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[hasExtras](has-extras.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtras/#kotlin.Function1[io.github.kakaocup.kakao.intent.BundleBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasExtras](has-extras.md)(function: [BundleBuilder](../-bundle-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>fun [hasExtras](has-extras.md)(extras: Matcher<[Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html)>)  <br>More info  <br>Matches intent with given extras  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtraWithKey/#kotlin.String/PointingToDeclaration/"></a>[hasExtraWithKey](has-extra-with-key.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasExtraWithKey/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasExtraWithKey](has-extra-with-key.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasExtraWithKey](has-extra-with-key.md)(key: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches intent with given extra key  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasFlag/#kotlin.Int/PointingToDeclaration/"></a>[hasFlag](has-flag.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasFlag/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasFlag](has-flag.md)(flag: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Matches intent with given flag  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasFlags/#kotlin.Int/PointingToDeclaration/"></a>[hasFlags](has-flags.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasFlags/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasFlags](has-flags.md)(flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>fun [hasFlags](has-flags.md)(vararg flags: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Matches intent with given flags  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasPackage/#kotlin.String/PointingToDeclaration/"></a>[hasPackage](has-package.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasPackage/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasPackage](has-package.md)(packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasPackage](has-package.md)(packageName: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches intent with given package  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasType/#kotlin.String/PointingToDeclaration/"></a>[hasType](has-type.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasType/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasType](has-type.md)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasType](has-type.md)(type: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches intent with given type  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/isInternal/#/PointingToDeclaration/"></a>[isInternal](is-internal.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/isInternal/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isInternal](is-internal.md)()  <br>More info  <br>Matches any internal intent  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/toPackage/#kotlin.String/PointingToDeclaration/"></a>[toPackage](to-package.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/toPackage/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [toPackage](to-package.md)(packageName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Matches intent which addresses to given package  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/withResult/#kotlin.Function1[io.github.kakaocup.kakao.intent.ActivityResultBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[withResult](with-result.md)| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/withResult/#kotlin.Function1[io.github.kakaocup.kakao.intent.ActivityResultBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withResult](with-result.md)(function: [ActivityResultBuilder](../-activity-result-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Invoke this function if you want to set default result for intending intents  <br><br><br>|
