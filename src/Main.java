import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.add(" Hello ");
        myList.add(" My ");
        myList.add(" Dear ");
        myList.add(" Friend ");


        System.out.println("Изначальный массив: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
        }

        myList.revert();
        System.out.println();

        System.out.println("Перевёрнутый массив: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
        }
    }
}

