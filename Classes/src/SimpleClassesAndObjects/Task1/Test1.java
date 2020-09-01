package SimpleClassesAndObjects.Task1;

public class Test1 {
    private int var1 = 0;
    private int var2 = 2;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.print("Переменная №1 имеет значение ");
        test1.printVar1();
        System.out.print("Переменная №2 имеет значение ");
        test1.printVar2();
        test1.setVar1(1);
        test1.setVar2(3);
        System.out.print("Теперь переменная №1 имеет значение ");
        test1.printVar1();
        System.out.print("Теперь переменная №2 имеет значение ");
        test1.printVar2();
        System.out.print("Сумма переменных равна ");
        System.out.println(test1.sum(test1.var1, test1.var2));
        System.out.print("Максимальное число равно ");
        System.out.println(test1.max(test1.var1, test1.var2));

    }

    public void printVar1() {
        System.out.println(var1);
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void printVar2() {
        System.out.println(var2);
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int sum(int var1, int var2) {
        return var1 + var2;
    }

    public int max(int var1, int var2) {
        return Math.max(var1, var2);
    }
}
