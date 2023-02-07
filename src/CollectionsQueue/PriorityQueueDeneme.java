package CollectionsQueue;

import java.util.PriorityQueue;

public class PriorityQueueDeneme {
    public static void main(String[] args){
        PriorityQueue q = new PriorityQueue();
        q.add(20);
        q.add(40);
        q.add(60);
        q.add(21);
        while (!q.isEmpty()){
            System.out.println(q.poll()); // çıkış büyükten küçüğe doğru olmasını nedeni çıkş için öncelik belirlenmemesinden dolayıdır.
        }
    }
}
