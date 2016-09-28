
public class Sorting{
    public static void main(String[] args){
        int[] sort = new int[20];
        for (int i = 0; i < 20; i++){
            sort[i] = (int)(Math.random() * 21);
            System.out.println(sort[i]);
        }
        System.out.println("sorted List:");
        for (int i = 0; i < sort.length; i++){
            int min = sort[i];
            int minIndex = i;
            int place = i;
        for (int j = i + 1; j <= sort.length - 1; j++){
            if (min > sort[j]){
            place = j;
            min = sort[j];
        }
        }
        int temp = sort[place];
        sort[place] = sort[minIndex];
        sort[minIndex] = temp;
        System.out.println(sort[i]);
        }
    }
}
