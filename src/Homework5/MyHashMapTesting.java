package Homework5;

public class MyHashMapTesting {
    public static void main(String[] args) {
        MyHashMap<Integer, String> clients = new MyHashMap<>();
        clients.put(1, "Ivan");
        clients.put(2, "Pavlo");
        clients.put(3, "Igor");
        clients.put(4, "Vadim");
        clients.remove(2);
        System.out.println(clients.size());
        System.out.println(clients.get(3));
        System.out.println(clients.toString());
        clients.clear();
        System.out.println(clients.size());
    }
}
