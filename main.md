**Basic workflow of `main.java`**

- **What the program does:** defines a class `main` with a `main` method that declares two integers `x` and `y` and prints:
	- `x` (the value of `x`)
	- `x + y` (sum)
	- `x * y` (product)
	- `x / y` (integer division result)

- **Code in `main.java`:**

```java
public class main {
		public static void main(String[] args){
				int x = 8;
				int y = 2;
				System.out.println(x);
				System.out.println(x+y);
				System.out.println(x*y);
				System.out.println(x/y);
		}
}
```

**Java primitive data types and sizes**

- `byte`  : 8-bit signed (1 byte)
- `short` : 16-bit signed (2 bytes)
- `int`   : 32-bit signed (4 bytes)
- `long`  : 64-bit signed (8 bytes)
- `float` : 32-bit IEEE 754 (4 bytes)
- `double`: 64-bit IEEE 754 (8 bytes)
- `char`  : 16-bit Unicode (2 bytes)
- `boolean`: JVM spec uses a boolean value (size not precisely defined; treated as true/false)

These are the primitive types used most commonly; `int` is the default integer type for arithmetic.

**Arithmetic with `int`**

- Supported operators: `+`, `-`, `*`, `/`, `%`.
- When both operands are `int`, the result is an `int`.

Example (from `main.java`): `x / y` when `x` and `y` are `int` produces an integer result.

**Why `x / y` can be `4` instead of `4.5`**

- Simple explanation: because `x` and `y` are whole numbers (`int`), Java does integer division and throws away the fractional part — it keeps only the whole-number portion. So `9 / 2` becomes `4` (the `.5` is dropped). To get `4.5`, make at least one number a decimal (for example `9.0`) or cast an `int` to `double`.

- Also note: when both operands are `int`, Java performs integer arithmetic for all operators, so the result is an `int` (for example `int * int = int`, `int + int = int`).

```java
int x = 9;
int y = 2;
System.out.println(x / y);          // prints 4 (integer division)
System.out.println((double)x / y); // prints 4.5 (floating-point division)
System.out.println(x / 2.0);       // prints 4.5
```

**How to compile and run** (Windows PowerShell):

```powershell
javac main.java
java main
```

**Quick note:** if you need the fractional result keep one operand as `double` (cast or literal). If both operands are `int`, Java performs integer arithmetic and drops fractions.

---
Created to explain data types, `int` arithmetic, and integer-division behavior for `main.java`.
