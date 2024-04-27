package linear_data_structure.hash_table;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//Practice3
//참고 - Hashtable? HashMap?
public class Practice3 {
    public static void main(String[] args) {
        //Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(0, 10);
        System.out.println(ht.get(0));

        //HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 10);
        System.out.println(hm.get(0));


        Map<Integer, Integer> map1 = ht;         //Map 인터페이스를 이용하여 다형적 참조
        Map<Integer, Integer> map2 = hm;         //Map 인터페이스를 이용하여 다형적 참조
        System.out.println(map1.get(0));
        System.out.println(map2.get(0));

        //ht.put(null, -999);
        //System.out.println(ht.get(null));      HashTable은 키값으로 null이 들어가면 오류 발생

        hm.put(null, -999);                     //HashMap은 키값으로 null이 들어가도 결과 출력
        System.out.println(hm.get(null));

        // Hashtable 과 HashMap 차이
        // 공통 : 둘 다 Map 인터페이스를 구현한것
        // 차이 :
            //Key 에 Null 사용 여부
            //Hashtable : X
            //HashMap : O

            // Thread-safe
            // Hashtable : O (멀티 스레드 환경에서 우수)
            // HashMap : X (싱글 스레드 환경에서 우수)
            // 참고) synchronizedMap, ConcurrentHashMap

    }
}
