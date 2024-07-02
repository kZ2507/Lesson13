import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneList {
    Map<String, String> list;

    PhoneList() {
        list = new HashMap<>();
    }

    public void add(String number, String surname) {
        list.put(number, surname);
    }

    public void get(String surname) {
        if (list.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = list.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии нет в списке");
        }
    }

    public static void main (String[]args){
        PhoneList phoneList = new PhoneList();
        phoneList.add("89122962878", "Петров");
        phoneList.add("89122912878", "Сидоров");
        phoneList.add("89124462878", "Захарченко");
        phoneList.add("89332962878", "Петров");

        phoneList.get("Петров");
    }
}