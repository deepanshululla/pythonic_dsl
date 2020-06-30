# Pythonic DSL

This is a python interpreter written in python using Antlr4.python

The interpreter is pretty basic and only understands a few commands such as if-else conditions, print statements,
and evaluation Reverse polish notations.


```
(venv) ➜  pythonic_dsl git:(master) ✗ make run
PYTHONPATH=.. python ./bin/lang_bin.py -f ./test_input.txt
2
2.4
hello world
4
6.4
2.666666666666667
-7.333333333333333
2 is equal to 2
we just used if statement
3 is = 3
5 is = 5
Nothing satisfies me
[1, 2, 3]
['hi', 1, 4]
['hi', [1, 3, 4], 4]
1
{'a': 1, 'b': 2}
{'a': [1, 3, 2], 'b': 2.5}
```