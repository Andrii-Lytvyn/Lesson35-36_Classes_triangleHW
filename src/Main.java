import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Задача 2
Создайте класс Triangle (треугольник), принимающий три целых значения - длины трёх сторон
треугольника. В конструкторе нужно проверить введённые значения на корректность (например,
длины не могут быть отрицательными). В классе должен быть описан отдельный
 статический метод public static bool checkSides(int a, int b, int c),
 который должен проверить неравенство треугольника. Этот метод необходимо использовать в
 конструкторе.
При провале любой из проверок нужно вывести на экран соответствующее сообщение.*/
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    Triangle newTriangle = new Triangle(a, b, c);


  }
}