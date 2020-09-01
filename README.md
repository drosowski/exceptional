# Railway Oriented Programming :tram:

> Functional error handling for fun and profit!

https://fsharpforfunandprofit.com/rop/

https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/

---

Kotlin uses the `Result` type to model success/failure in a functional way.
Using the `Result` type for operations that might throw an exception increases the readability by
* focusing on the happy path
* using familiar concepts like `map` and `fold`

## Exercise :muscle:

The `PersonFileReader` already uses `try/catch` statements as expressions.
Still, it's hard to follow the programs flow, because it's disturbed by the explicit exception handling.
Try to refactor the class using Kotlins `runCatching` and the `Result` type while keeping the tests green. :green_heart:

Have fun! :sunglasses:   