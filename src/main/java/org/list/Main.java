package org.list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> animalList = new SinglyLinkedList<>();

        //Insertions
        animalList.insertAtBeginning("Cat");
        animalList.insertAtEnd("Dog");
        animalList.insertAtEnd("Snake");
        animalList.insertAtPosition("Cow", 1);
        animalList.traverse();

        //Deletions
        animalList.deleteFromBeginning();
        animalList.traverse();
        animalList.deleteFromEnd();
        animalList.traverse();
        animalList.deleteFromPosition(1);
        animalList.traverse();

        //Search
        System.out.println(animalList.search("Cow"));
        System.out.println(animalList.search("Cat"));

        SinglyLinkedList<Integer> numList = new SinglyLinkedList<>();

        //Insertions
        numList.insertAtBeginning(100);
        numList.insertAtEnd(200);
        numList.insertAtEnd(300);
        numList.insertAtPosition(150, 1);
        numList.traverse();

        //Deletions
        numList.deleteFromBeginning();
        numList.traverse();
        numList.deleteFromEnd();
        numList.traverse();
        numList.deleteFromPosition(1);
        numList.traverse();

        //Search
        System.out.println(numList.search(150));
        System.out.println(numList.search(100));


    }
}