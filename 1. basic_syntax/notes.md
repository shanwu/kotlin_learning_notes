#### Basic Syntax
I will use [print_file_content.kt](./ex/pkg/print_file_content.kt) as the sample code for this learning note.

##### Package definition and imports
Just like java, except **it is not required to match the dirs and pkgs.**
```kotlin
package ex.pkg
import java.io.File
......
```

##### Program entry point
&rarr; `main()`
```kotlin
......
fun main(args: Array<String>) {
    ......
}
```

##### Functions
Functions with paramters:
```kotlin
fun countFileLines(file:File):Int {
    var res = 0;
    file.forEachLine {
        res++;
    }
    return res;
}
```

Functions with an expression body and inferred return type:
```kotlin
fun printFileContent(file:File) = file.forEachLine {println(it) }
```

##### Variables
Read-only local variables &rarr; `val`
Variables can be reassigned &rarr; `var`

##### String templates

```kotlin
val lineCount = countFileLines(file)
val message = "There are $lineCount lines in the file"
println(message)
```

##### Nullable variables
```kotlin
......
var k: Int? = null
k = Integer.parseInt(x)
......
```

##### while loop
##### when expression
##### Ranges
##### Collections
ref:
1. [Basic Syntax](https://kotlinlang.org/docs/reference/basic-syntax.html)