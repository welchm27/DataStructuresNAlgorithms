---
title: Implementation
nav_order: 10
---

{% include abbreviations.md %}
{% assign javadocs = site.aux_links.Javadocs | relative_url %}

* TOC
{:toc}

## Basic problem

### Declaration

In the `com.tlglearning.practice.Combinations` class, the `zeroSumTriples` method is declared as follows:

```java
public static Set<? extends Set<Integer>> zeroSumTriples(int[] data)
```

(The stub of this method in the source code includes a `TODO` comment with the text "`Implement as specified.`".)

Your implementation **must not** change the modifiers, return type, signature (method name and number/types/order of parameters).

Note: The bounded wildcard (`? extends Set`) on the return type is only there to give you more flexibility in your implementation. For example, if you were to declare and return a local variable with the reference type *`Set`*`<`*`Set`*`<Integer>>`, *`Set`*`<HashSet<Integer>>`, *`Set`*`<LinkedHashSet<Integer>>`, or `HashSet<TreeSet<Integer>>` (and so on), the compiler would accept it as matching the declared return type. On the other hand, if the return type were declared simply as *`Set`*`<`*`Set`*`<Integer>>` (i.e. without a wildcard), and you wrote your implementation to return a local variable declared with the reference type *`Set`*`<HashSet<Integer>>` (for example), the compiler would refuse to compile the `return` statement.

For more declaration details, see the [Javadoc documentation]({{ javadocs }}com/tlglearning/practice/Combinations.html#zeroSumTriples(int[])){:target='_blank'}.

### Specifications

For compactness, the specifications below refer to *`Set`*`<Integer>` and *`Set`*`<`*`Set`*`<Integer>>`, rather than using the bounded wildcard shown for the return type (*`Set`*`<? extends `*`Set`*`<Integer>>`) above.

1. Each distinct triplet (three values) from the array referenced by the `data` parameter, where the three values sum to zero, must be packaged into a *`Set`*`<Integer>` and included as an element of the *`Set`*`<`*`Set`*`<Integer>>` returned by the `zeroSumTriples(int[])` method. 

2. The *`Set`*`<`*`Set`*`<Integer>>` returned by the `zeroSumTriples(int[])` must not contain any `null` elements or *`Set`*`<Integer>` elements that _do not_ sum to zero.

3. You may assume that all values in `data` are distinct. Beyond that, you should make no assumptions regarding specific values in the array, the order of values in the array, or the length of the array.

4. There is no requirement with regard to the mutability or specific implementation class of the *`Set`* returned (nor to that of the *`Set`*`<Integer>` instances contained within the outer *`Set`*); it is only required that your method return the result as a *`Set`*`<`*`Set`*`<Integer>>`.

### Tips

1. *`Set`* is an interface, not a class; thus, you can't create *`Set`* instances using (for example) `new `*`Set`*`<Integer>()`. However, you _can_ create instances of `HashSet`, `LinkedHashSet`, or `TreeSet` (all of which---as well as others---are implementations of *`Set`*) using the `new` keyword. 

2. The *`Set`*`.of(...)` static factory method may be used to create an unmodifiable set containing the specified values; consider using this method to create each set of three values summing to zero (i.e. each triple).
 
3. By using a *`Set`*, you can ignore the order of values within each triple; the resulting set is the same. Similarly, by gathering the triple sets into an outer *`Set`*, you can ignore the order across the triples.

4. You may find it useful to sort the data before processing; however, the problem can be solved without doing so.

5. You may find it useful to create one or more additional `static` methods as “helpers”. The problem can be solved without doing so, but decomposing a complex operation using invocations of one or more helper methods can make your code easier to read and debug.

6. Don't hesitate to declare any `static` fields (esp. `static final` constants) that you feel might simplify or clarify your code.

7. The method to be completed includes a `TODO` comment to that effect.
    
## Efficiency stretch goal

### Specifications

Implement a solution (in the `zeroSumTriples(int[])` method, and without modifying any aspect of the method [declaration](#declaration) or [specifications](#specifications) shown above) that has time complexity $O \left( n^2 \right)$---that is, as the number of elements in the `data` array increases, the time required to find all the zero-sum triples increases in proportion to the square of `data.length` (but not, for example, in proportion to the cube of `data.length`). If you have a loop that iterates over `data`, nested inside another loop that iterates over `data`, nested inside another such loop, you probably have an implementation with time complexity $O \left( n^3 \right)$; thus, we might state this task as "Implement a solution with no more than two levels of loop nesting." 

### Tips

See the [tips for the basic problem](#tips), all of which apply to this stretch goal as well. In addition:

1. Consider using a `HashMap` to keep track of sums of pairs of values (with the key being the sum, and the value being the pair of numbers). Looking up values in a `HashMap` is a nearly constant-time operation in most cases.

2. Alternatively (or in addition to the above), sorting the input array, and then iterating from both ends toward the middle can be an effective component of an approach with $O \left( n^2 \right)$ time complexity.
