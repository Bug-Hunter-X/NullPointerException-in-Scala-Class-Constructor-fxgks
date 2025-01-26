# NullPointerException in Scala Class Constructor

This example demonstrates a common error in Scala: a `NullPointerException` arising from passing a `null` value to a class constructor that doesn't handle it gracefully.  The `MyClass` constructor expects a `String` for the `name` parameter.  If `null` is provided, the `s"Hello, my name is $name"` string interpolation will fail, resulting in the exception.

The solution shows how to add null checks to prevent this. 