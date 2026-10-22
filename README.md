# itk.academy | Geometry Library

Это простая библиотека предназначена для выявления площади и периметра геометрических фигур.

# Контракты

Основные контракты классов являются `AreaCalculator` и `PerimeterCalculator`. 

**AreaCalculator** - контракт, который отдает информацию площади фигуры.

**PerimterCalculator** - контракт, передаюищий информацию периметра фигуры.

# Основные фигуры

## Прямоугольник

**Прямоугольник** - это фигура, у которой все 4 стороны равны.

### Площадь
Умножив две стороны прямоугольника (a,b) мы получим ее площадь (S).
```
S = a*b
```

### Периметр

Периметр (P) треугольника - это сумма всех сторон прямоугольника (a,b,c,d). 

```
P = a + b + c + d
```

### Код
Чтобы узнать площадь и периметр фигуры, необходимо выполнить следующее:

```java
import org.rkov.geometry.Rectangle;

public class App 
{
    public static void main( String[] args )
    {
        var rectangle = new Rectangle(10, 20);

        double square = rectangle.getSquare();

        double perimeter = rectangle.getPerimeter();
    }
}
```

## Треугольник

**Треугольник** - это фигура, которая состоит из трех отрезков, соединяющих 3 точки.

### Площадь

Используется формула Герона. Три стороны (a,b,c).

```
S = √(p × (p – a) × (p – b) × (p – c))

где p = (a + b + c) / 2
```

### Периметр

Периметр треугольника (P) - это сумма всех сторон треугольника (a,b,c). 

```
P = a + b + c
```

### Код
Чтобы узнать площадь и периметр фигуры, необходимо выполнить следующее:

```java
import org.rkov.geometry.Triangle;

public class App 
{
    public static void main( String[] args )
    {
        var triangle = new Triangle(10, 20, 30);

        var square = rectangle.getSquare();

        var perimeter = rectangle.getPerimeter();
    }
}
```

Или если все стороны равны:

```java
import org.rkov.geometry.Triangle;

public class App 
{
    public static void main( String[] args )
    {
        var triangle = new Triangle(10);

        var square = rectangle.getSquare();

        var perimeter = rectangle.getPerimeter();
    }
}
```

## Круг

**Круг** - совокупность всех точек плоскости, расстояние от которых до заданной точки (центра) не превышает заданного неотрицательного числа (радиуса).

### Площадь

Площадь круга (s) равна квадрату радиуса (r) уммноженная на π.  

```
S= π × r²
```

### Периметр

Периметр круга — это длина его границы, то есть расстояние, которое вы проходите, обойдя круг один раз.

```
P = 2 * π * r
```

### Код
Чтобы узнать площадь и периметр фигуры, необходимо выполнить следующее:

```java
import org.rkov.geometry.Circle;

public class App 
{
    public static void main( String[] args )
    {
        var circle = new Circle(10);

        var square = circle.getSquare();

        var perimeter = circle.getPerimeter();
    }
}
```


