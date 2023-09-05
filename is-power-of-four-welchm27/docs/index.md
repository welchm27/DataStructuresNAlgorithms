---
title: Overview
nav_order: 1
has_heading_toc: false
---

{% include abbreviations.md %}

Typically, when we refer to an integer $a$ as a _power_ of some another integer $b$, we are saying that $a = b^n$, where $n$ is also an integer. In this problem in particular, we'll be looking at powers of $4$, or numbers of the form $4^n$. For example, $1 = 4^0$, $4 = 4^1$, $16 = 4^2$, $64 = 4^3$, etc. Thus, $1, 4, 64, \ldots$ are powers of $4$.

Of course, we can raise an integer to a negative power, but the result is not an integer. For example, $4^{-1} = \tfrac{1}{4}$. For this problem, we're restricting the scope to integers only, so we'll only consider a number to be a power of $4$ if it can be expressed as $4^n$, where $n \ge 0$. 

In this problem, you must complete the implementation of a method that takes a `long` input parameter, and returns the `boolean` value `true` if the value of the parameter is a power of $4$, and `false` otherwise. Because this problem is also intended as practice in recursion, you're encouraged to implement a recursive approach to the problem.