public class Numb4 {
    static int ID = 0;

    public Numb4() {
        ID++;
    }

    public void viv() {
        System.out.println(ID);
    }

    public static void main(String[] args) {
        Numb4 num1 = new Numb4();
        num1.viv();
        Numb4 num2 = new Numb4();
        num2.viv();
        Numb4 num3 = new Numb4();
        num3.viv();
    }
}
