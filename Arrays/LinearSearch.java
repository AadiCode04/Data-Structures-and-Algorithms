

public class LinearSearch {

    public static int linearsearch( int nos[] , int key) {
        for (int i = 0; i <= nos.length; i++) {
            if( nos[i] == key){
                return i ;
            }
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        int nos[] = { 2 ,4 ,6 ,8 ,10 ,12, 14 ,16};
        int key = 10;
       int index = linearsearch(nos, key);
       if( index == -1 ){
        System.out.println("Key is Not Found");
       }else{
        System.out.println("Key is at Index :" + index);
       }
    }
}
