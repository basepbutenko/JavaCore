public class Search {
    public static void main(String[] args) {
        int nums[] = {7, 8, 6, 6, 7, 8, 9, 6, 5, 4, 3, 2, 3, 4, 6, 7,};
        int val = 6;
        boolean found = false;
        for (int x : nums){
        if (x == val) {
            found = true;
            break;
        }
    }
        if(found)
            System.out.println("Значение найдено!");
}
}
