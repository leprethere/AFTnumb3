class Numb3 {
    String b;

    public Numb3(String b) {
        //сообщение, полученное при создание объекта
        System.out.println(b);
    }

    public Numb3() {
        //сообщение "111"
        System.out.println("111");
    }

    public static void main(String[] args) {
        //2 объекта - 1 с отправкой сообщения, 2-ой - без отправки
        Numb3 message = new Numb3("Создано!");
        Numb3 noMessage = new Numb3();
    }
}
