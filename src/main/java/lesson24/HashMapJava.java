package lesson24;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Germany");
        hashMap.put("BMW", "Germany");
        hashMap.put("Lada", "Russia");

        if(hashMap.containsKey("Audi")){
            System.out.println("Audi was found");
        }
        if(hashMap.containsValue("Germany")){
            System.out.println("Germany was found");
        }

        System.out.println(hashMap.keySet());

        System.out.println(hashMap.values());

        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.size());

        hashMap.remove("Audi","Germany");
        System.out.println("----------for-----------");
        System.out.println(hashMap.get("BMW"));
        System.out.println("----------for-----------");

       // hashMap.clear(); //Чистка hashMap
        System.out.println(hashMap.entrySet());
        //-------------for-keys---------------
        System.out.println("----------for-----------");
        for (String carName: hashMap.keySet()){
            System.out.println(hashMap.get(carName));
        }
        System.out.println("----------for-values----------");
        //-------------for-values---------------
        for (String country: hashMap.values()){
            System.out.println(country);
        }

        // for-keys ------ and -------- for-values
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println("name --> " + entry.getKey() + " country--> " + entry.getValue());
        }
    }

}
