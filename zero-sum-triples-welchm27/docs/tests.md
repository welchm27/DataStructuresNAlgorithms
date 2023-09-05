---
title: Unit tests
nav_order: 20
---

{% include abbreviations.md %}

* TOC
{:toc}

## Basic problem

### Test cases

Use JUnit5 to verify the correct operation of your code with the following `int[]` inputs and expected *`Set`*`<`*`Set`*`<Integer>>` return values: 

| `data` | Expected return value of `zeroSumTriples(data)` |
|:------:|:-----------------------------------------------:|
| `{1, -2, 2, 5, 3, 0, -4, -1}` | `[[1, 3, -4], [1, 0, -1], [-2, 2, 0], [-2, 3, -1], [5, -4, -1]]` |
| `{7, 10, 2, -4, -7, 9, -6, -8, 8, 6, -10, -9, 5, 4, -2, -1, -5, 3}` | `[[7, 2, -9], [7, -6, -1], [7, -10, 3], [7, -2, -5], [10, -4, -6], [10, -8, -2], [10, -9, -1], [2, -7, 5], [2, -6, 4], [2, -8, 6], [2, 8, -10], [2, -5, 3], [-4, 9, -5], [-4, 6, -2], [-4, 5, -1], [-7, 9, -2], [-7, 8, -1], [-7, 4, 3], [9, -8, -1], [-6, 8, -2], [-8, 5, 3], [6, -10, 4], [6, -9, 3], [6, -1, -5], [-9, 5, 4], [-2, -1, 3]]` |

In evaluating your implementation, the automated testing may include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Tips

1. Since the `Combinations.zeroSumTriples(int[])` method returns a set, which is an _unordered_ collection, you needn't worry if your implementation doesn't find the triples in the order shown above; nor should your tests require a specific order of the triples, nor of the values within them. In any event, the contract of the *`Set`*`<E>.equals(Object)` method (which is invoked by the JUnit `assertEquals(Object, Object)` method when the arguments are sets) compares sets by contents, not by the order of the contents.

2. The test data shows the *`Set`*`<`*`Set`*`<Integer>>` expected values in the form returned by the *`Set`*`.toString()` method. However, this form will not work for specifying the expected values in (for example) a `@MethodSource`-annotated method. For that, consider using the *`Set`*`.of` static factory method. For example, the expected value in the first test case above can be written in code as *`Set`*`.of(`*`Set`*`.of(1, 3, -4), `*`Set`*`.of(1, 0, -1), `*`Set`*`.of(-2, 2, 0), `*`Set`*`.of(-2, 3, -1), `*`Set`*`.of(5, -4, -1))`.

3. The `Combinations.zeroSumTriples(int[])` method to be completed is `static`, and the `Combinations` class is `abstract`. Do not attempt to create instances of `Combinations` in your tests.

## Efficiency stretch goal

There are no additional unit test requirements for the stretch goal. _However_, if you attempt the efficiency stretch goal, don't forget to run your unit tests against your modified implementation.
