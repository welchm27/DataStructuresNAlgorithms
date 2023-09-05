---
title: Implementation
nav_order: 2
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs | relative_url %}

* TOC
{:toc}

## Declaration

For this problem, you must implement the `isPerfectSquare` method in the `com.tlglearning.practice.Square` class. This method is declared as follows:
 
```java
public static boolean isPerfectSquare(long input) throws IllegalArgumentException
```

(The stub of this method in the source code includes a `TODO` comment with the text "`Implement as specified.`".)

Your implementation **must not** change the modifiers, return type, signature (method name and parameter number/types/order), or possible exceptions shown above.

For more method declaration details, see the [Javadoc documentation]({{ javadocs }}com/tlglearning/practice/Square.html#isPerfectSquare(long)){:target='_blank'}.

## Specifications

Your implementation must provide this functionality:

1. If `input` is negative, `isPerfectSquare(input)` must throw an instance of `IllegalArgumentException`;

2. Otherwise, if `input` is a perfect square, `isPerfectSquare(input)` must return `true`; 

3. Otherwise, `isPerfectSquare(input)` must return `false`.

## Tips

1. For computing square roots, `Math.sqrt(input)` is preferred over `Math.pow(input, 0.5)`. In fact, within a certain range of `input` values, and where `input` is in fact a perfect square, `Math.sqrt(input)` is guaranteed to return the exact square root of `input`; in contrast, `Math.pow(input, 0.5)` only guarantees to return a value that is _very close_ to the exact square root. 

    On the other hand, `long` values will be widened to `double` when invoking `Math.sqrt(double)`; if the resulting `double` can't represent the original `long` exactly, then the accuracy guarantee doesn't mean as much as we'd like. Even before we hit that threshold, we need to watch out for false positives. (See the next point for more information.)

2. Whenever practical, use integer calculations. 

    One intuitive approach to determining whether a given `input` is a perfect square is to compute `Math.sqrt(input)`, and if the result has no fractional part (i.e. nothing after the decimal point), conclude that `input` is a perfect square. However, if `input` is a very large `long` (greater than $2^{52}$), and is _close_ to a perfect square, `Math.sqrt(input)` might return a value with no fractional part, even though `input` actually isn't a perfect square! 

    This doesn't necessarily mean you shouldn't use the `Math.sqrt(double)` method at all, but only that you shouldn't rely on it _exclusively_, and you shouldn't assume that if `Math.sqrt(input)` returns a value with no fractional part, that conclusively proves that `input` is a perfect square.

    Instead, you might consider computing `Math.sqrt(input)`, rounding the result to a `long`, and then using integer calculations to _confirm_ that the result actually is (or isn't) the square root of `input`.

4. There are multiple ways to round a floating-point value to an integer; here some commonly used techniques:

    * The `Math.round` method rounds a `double` or `float` to the nearest integer, returning the value as a `long` or `int`, respectively.

    * Casting with `(long)` (or any of the narrower integer primitive types) truncates the fractional portion of a `double` or `float`, effectively rounding toward zero (0), and instructs the compiler to treat the result as a value of the specified type.

    * The `Math.floor` method rounds down (toward $-\infty$), returning the value as a `double` (not a `long` or `int`), but without a fractional part.

    * The `Math.ceil` method rounds up (toward $\infty$), returning the value as a `double` (not a `long` or `int`), but without a fractional part.

5. You may find it useful to create one or more additional `private static` methods as "helper methods"; the problem can be solved without doing so, however.

6. Do not hesitate to declare any `static` fields (especially `static final` constants) that you feel might simplify or clarify your code.
