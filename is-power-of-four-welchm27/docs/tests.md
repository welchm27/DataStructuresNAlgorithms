---
title: Unit tests
nav_order: 3
---

{% include abbreviations.md %}
* 
* TOC
{:toc}

Use JUnit5 to verify your code with the inputs and expected outputs below. (Note that JUnit5 is already included in the `dependencies` task in `build.gradle`; there's no need to add it to the project dependencies again.)

## Test cases

Note that the values below are formatted with underscores as digit group separators which the Java parser recognizes in numeric literals; however, test code is not required to include them, and methods such as `Long.parseLong` cannot handle them.

| `input` | Expected return value | Expected exception |
|-------------------:|----------------------:|:------------------:|
| `1` | `true` | _N/A_ |
| `4_294_967_296L` | `true` | _N/A_ |
| `65` | `false` | _N/A_ |
| `8_589_934_592L` | `false` | _N/A_ |
| `0` | _N/A_ | `java.lang.IllegalArgumentException` |
| `-16` | _N/A_ | `java.lang.IllegalArgumentException` |

Additional test cases may be used by the automated tests; an implementation that conforms to the [specifications](implementation.md#specifications) stated previously will pass all such additional tests.
 
## Tips

1. The `Power.isPowerOfFour` method to be completed is `static`, and the `Power` constructor is `private`. Do not attempt to create instances of `Power` in your tests.  

2. If an integer literal is too large for the Java compiler to parse as an `int`, you will need to use the `L` suffix to instruct the parser to treat it as a `long`. (This is illustrated in some of the `input` values, above.) 

3. On the other hand, `Long.parseLong` cannot handle the `L` suffix (or any other numeric type suffix); nor can it handle an underscore character (`_`) used as a digit group character. Thus, if reading and parsing data from a file or from user input at runtime, directly or indirectly (e.g. using JUnit5's `@CsvFileSource`), type suffixes and digit group separators should be avoided or stripped out.

4. The JUnit5 `assertThrows` method may be used to verify that a method throws an expected exception under specific conditions. For more information, see the [Javadocs documentation for the `assertThrows(Class, Executable)` method](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html#assertThrows(java.lang.Class,org.junit.jupiter.api.function.Executable)){:target='_blank'}.
