/**
 * testSinglyLinkedList
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
      linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3
        System.out.println(linkedList.get(12)); //Terjadi exception error
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        // System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]
        // Sebagaimana dijelaskan pada testSinglyLinkedList, objek array perlu dibantu menggunakan toString agar tidak mengeluarkan kode hash
        System.out.println(java.util.Arrays.toString(linkedList.toArray()));

        /*
        
        Hasil dari addFirst adalah 6, 5, 4, 3, 2, 1
        1. Seharusnya, indeks 2 menghasilkan 4
        2. index 12 tidak menghasilkan exception error, karena kali ini kami menggunakan pengondisian dimana jika current==null, maka return null.
        3. indeks 4 bukan 5, tetapi 2
        4. indeks 10 menghasilkan -1, karena tidak ada
        5. PrintReverse menghasilkan 1, 2, 3, 4, 5, 6
        6. Benar menghasilkan true, int 3 dihapus dari linkedlist
        7. Benar menghasilkan false, karena current langsung null
        6. toArray benar menghasilkan 6, 5, 4, 2, 1
        
        */
    }
}