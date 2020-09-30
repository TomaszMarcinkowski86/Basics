import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Lekcja21KolekcjeKolejkaStos {

    public static void main(String[] args) {
        //Kolejka
        Queue<String> kolejka = new ArrayDeque<>();

        kolejka.add("pierwszy");
        kolejka.add("drugi");
        kolejka.add("trzeci");
        kolejka.add("czwarty");

        System.out.println("Queue First In First Out FIFO");
        System.out.println(kolejka);
        System.out.println(kolejka.peek()); // to podgląda ale nie usuwa go z kolejki
        System.out.println(kolejka.remove());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.size()); // rozmiar
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        // System.out.println(kolejka.poll()); // ta przy usuwaniu rzuca Exeption jak już nie ma elementów w kolejce
        //System.out.println(kolejka.remove()); // ta przy usuwaniu zwraca null jak już nie ma elementów w kolejce

        System.out.println("Stack - Stos First In Last Out FILO");
        Stack<String> stos = new Stack<>();
        stos.push("one");
        stos.push("two");
        stos.push("three");
        stos.push("four");

        System.out.println(stos);
        System.out.println(stos.size());
        System.out.println(stos.pop()); // usuwanie elementu ze stosu
        System.out.println(stos.size());
        stos.push("jakis ostatnio dodany element");
        System.out.println(stos.pop());
        System.out.println(stos.size());
        System.out.println(stos.remove(0)); // możemy usunąc konkretny element
        System.out.println(stos.size());
        System.out.println(stos);


    }
}
