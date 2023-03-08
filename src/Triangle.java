/*Задача 2
Создайте класс Triangle (треугольник), принимающий три целых значения - длины трёх сторон
треугольника. В конструкторе нужно проверить введённые значения на корректность (например,
длины не могут быть отрицательными). В классе должен быть описан отдельный
 статический метод public static bool checkSides(int a, int b, int c),
 который должен проверить неравенство треугольника. Этот метод необходимо использовать в
 конструкторе.
При провале любой из проверок нужно вывести на экран соответствующее сообщение.*/
public class Triangle {
  int a, b, c;

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    checkSides(a, b, c);
  }
  public static boolean checkSides(int a, int b, int c) {
    if (!minus(a, b, c)) {
      return false;

    } else {
      if ((b <= c + a) || (a <= b + c) || (c <= b + a)) {
        System.out.println("Неравенство выполняется");
        return true;
      } else {
        System.out.println("Error");
        return false;
      }
    }
  }
  public static boolean minus(int a, int b, int c) {
    String error;
    if (a < 0 || b < 0 || c < 0) {
      if (a < 0) {
        error = "Ошибка А =" + a + "<0 ";
        System.out.println(error);
      }
      if (b < 0) {
        error = "Ошибка B =" + b + "<0 ";
        System.out.println(error);
      }
      if (c < 0) {
        error = "Ошибка C =" + c + "<0 ";
        System.out.println(error);
      }
      return false;
    } else {
      return true;
    }
  }
}

