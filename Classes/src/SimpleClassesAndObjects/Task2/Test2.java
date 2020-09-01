package SimpleClassesAndObjects.Task2;

public class Test2 {
    public int var1 = 0;
    public int var2 = 2;

    public Test2(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
        System.out.printf("Конструктор c входными параметрами, значения переменных %d,%d", this.var1, this.var2);
    }

    public Test2() {

        System.out.printf("Конструктор по умолчанию, значения переменных %d,%d", var1, var2);
    }

    public static void main(String[] args) {
        Test2 simple = new Test2();
        System.out.println();
        Test2 withParam = new Test2(2, 3);
        System.out.println();

        simple.setVar1(3);
        withParam.setVar2(5);

    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
        System.out.println("Теперь значение переменной var1 равно " + this.var1);
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
        System.out.println("Теперь значение переменной var2 равно " + this.var2);
    }
}
