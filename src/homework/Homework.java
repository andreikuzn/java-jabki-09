package homework;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    // 1. Создайте список из 5 целых чисел. Выведите его элементы через пробел.
    public static String joinList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    // 2. Выведите третий элемент списка
    public static Integer thirdElement(List<Integer> list) {
        return list.size() >= 3 ? list.get(2) : null;
    }

    // 3. Удалите второй элемент списка и выведите оставшиеся
    public static List<Integer> removeSecond(List<Integer> list) {
        List<Integer> copy = new ArrayList<>(list);
        if (copy.size() >= 2) {
            copy.remove(1);
        }
        return copy;
    }

    // 4. Найдите сумму всех чисел в списке
    public static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }

    // 5. Подсчитайте, сколько раз встречается число 7
    public static int countSevens(List<Integer> list) {
        int count = 0;
        for (int n : list) {
            if (n == 7) {
                count++;
            }
        }
        return count;
    }

    // 6. Проверьте, содержится ли число 42
    public static boolean contains42(List<Integer> list) {
        for (Integer n : list) {
            if (n != null && n == 42) {
                return true;
            }
        }
        return false;
    }

    // 7. Найдите минимальное и максимальное число в списке
    public static int[] minAndMax(List<Integer> list) {
        if (list.isEmpty()) return null;
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int value = list.get(i);
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return new int[] {min, max};
    }

    // 8. Удалите все числа, делящиеся на 2
    public static List<Integer> removeEvenNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);
        for (int i = 0; i < result.size(); ) {
            if (result.get(i) % 2 == 0) {
                result.remove(i);
            } else {
                i++;
            }
        }
        return result;
    }

    // 9. Создайте список из массива int[] arr = {1, 2, 3, 4}
    public static List<Integer> listFromArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }
        return list;
    }

    // 10. Найдите количество элементов, больше чем число n
    public static int countGreaterThanN(List<Integer> list, int n) {
        int count = 0;
        for (int x : list) {
            if (x > n) {
                count++;
            }
        }
        return count;
    }

    // 11. Выведите строки, длина которых больше 5
    public static List<String> longStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.length() > 5) {
                result.add(s);
            }
        }
        return result;
    }

    // 12. Инвертировать список
    public static List<Integer> reversedList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    // 13. Объединить два списка без дубликатов
    public static List<Integer> unionNoDuplicates(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>(l1);
        for (Integer elem : l2) {
            if (!result.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    // 14. Сумма только нечётных чисел
    public static int sumOfOddNumbers(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            if (n % 2 != 0) {
                sum += n;
            }
        }
        return sum;
    }

    // 15. Вернуть строки, начинающиеся с "А"
    public static List<String> filterByFirstA(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("А")) {
                result.add(s);
            }
        }
        return result;
    }
}
