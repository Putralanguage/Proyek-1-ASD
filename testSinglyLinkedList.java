/**
 * testSinglyLinkedList
 */
public class testSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3
        // System.out.println(linkedList.get(12)); //Terjadi exception error
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        // System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]
        // Agar keluar seusai permintaan pada output yang diminta, diperlukan perubahan pada pencetakan karena yang dicetak berupa objek array. Apabila meneruskan sebagaimana yang diminta soal, yang keluar bukan output ekspektasi, melainkan kumpulan hash code memori.
        System.out.println(java.util.Arrays.toString(linkedList.toArray()));   
        

        /*
        
        Pada input terakhir addFirst, hasilnya seharusnya adalah [6, 5, 4, 3, 2, 1].
        1. Indeks ke-0 adalah 6, indeks ke-1 adalah 5, dan indeks ke-2 adalah 4.
        2. Benar terjadi eksepsi error, maka kami mengubahnya menjadi komentar untuk dapat melanjutkan ke berikutnya
        3. Angka 4 berada di indeks ke-2, bukan indeks ke-5. Indeks ke-5 justru diisi oleh angka 1.
        4. PrintReverse seharusnya menghasilkan 1 2 3 4 5 6
        5. Benar menghasilkan True, int 3 hilang dari linkedlist
        6. Benar menghasilkan False
        7. Benar menghasilkan 6, 5, 4, 2, 1

        */
    }
}