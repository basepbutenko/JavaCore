package ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main   {
    public static void main(String[] args) throws Exception {
        ArrayList <String> al=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++){
            System.out.println("Enter value ["+ i +"]");
            String s= bufferedReader.readLine();
            al.add(s);
        }
        for(int i=0; i< al.size(); i++){
            int j=al.size()-i-1;
            System.out.println(al.get(j));

        }
    }
}
