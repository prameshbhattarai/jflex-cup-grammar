# Example of creating Domain Specific Language

## Description
Example of creating Domain Specific language (DSL) using [JFlex](https://jflex.de/) and [CUP](https://www2.cs.tum.edu/projects/cup/examples.php).  
A DSL is a specialized programming language tailored to a specific domain or problem area.

## Setup
```shell
mvn clean package
```

### Run
```shell
java -jar ./target/grammar.jar ./example1
```

### Supported Grammar
* ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, MODULUS operation
* MAIN function, PRINT function
* Define VARIABLE for calculation operation

### Example
In a ./example1 file, writing a simple program as defined following:
```shell
main() {
    a = 1;
    b = 2;
    print(a + b);
    print(4 + 4);
    print("4 + 4");
    print("abc");
    print(a);
}
```
