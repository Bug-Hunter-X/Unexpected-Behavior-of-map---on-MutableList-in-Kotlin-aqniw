# Unexpected map() Behavior on MutableList in Kotlin

This example demonstrates a potential source of confusion when using the `map()` function with mutable lists in Kotlin. Unlike its behavior with immutable lists, `map()` on a mutable list doesn't modify the original list in place.  This can be unexpected for developers accustomed to imperative programming styles.

The `bug.kt` file shows the issue: the `map()` call doesn't change `mutableList`, while it does change a list that was created using `listOf`.  The `bugSolution.kt` shows how to modify the list in place.