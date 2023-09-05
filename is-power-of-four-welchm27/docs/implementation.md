---
title: Implementation
nav_order: 2
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs | relative_url %}

* TOC
{:toc}

## Declaration

For this problem, you must implement the `isPowerOfFour` method in the `com.tlglearning.practice.Power` class. This method is declared as follows:
 
```java
public static boolean isPowerOfFour(long input) throws IllegalArgumentException
```

(The stub of this method in the source code includes a `TODO` comment with the text "`Implement as specified.`".)

Your implementation **must not** change the modifiers, return type, signature (method name and number/types/order of parameters), or possible exceptions shown above.

For more method declaration details, see the [Javadoc documentation]({{ javadocs }}com/tlglearning/practice/Power.html#isPowerOfFour(long)){:target='_blank'}.

## Specifications

Your implementation must provide this functionality:

1. If `input` is non-positive, `isPowerOfFour(input)` must throw an instance of `IllegalArgumentException`;

2. Otherwise, if `input` can be expressed as $4^n$, where the integer $n \ge 0$, `isPowerOfFour(input)` must return `true`; 

3. Otherwise, `isPowerOfFour(input)` must return `false`.

## Tips

1. You are encouraged to use _recursion_ in your implementation. Consider this recursive definition for a power of $4$:

    <div class="hanging-equation">$$\begin{equation}\label{power-recursive}\end{equation}$$</div>

    > An integer $a$ (where $a > 0$) is a power of $4$ if and only if:
    > * $a = 1$;
    > * **OR**
    >     * $a \bmod 4 = 0$,
    >     * **AND** $\lfloor \tfrac{a}{4} \rfloor$ is a power of $4$.

    Note that the condition following **AND** in the above is recursive; that is, it expresses the answer to the overall question ("Is $a$ a power of $4$?") in terms of an answer to the same question, but for a smaller value ("Is $\lfloor \tfrac{a}{4} \rfloor$ a power of $4$?").

2. There's no need to use floating-point calculations in your implementation. (In many cases, if it's practical to solve a given problem entirely in the integer domain, it's a good idea to do so.) Of course, the problem can be solved using logarithmic calculations; it can also be solved using bitwise operations; you're encouraged, however, to use integer calculations only, and leverage the recursive definition given above.

3. You may find it useful to create one or more additional `private static` methods as "helper methods"; the problem can be solved without doing so, however.

4. Do not hesitate to declare any `static` fields (especially `static final` constants) that you feel might simplify or clarify your code.
