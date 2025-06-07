package ArrayList;

import java.util.ArrayList;

public class GuestList{
    public static void main(String[] args) {
        ArrayList guest = new ArrayList();

        guest.add("saman ");
        guest.add("kamal");
        guest.add("nimal");
        guest.add(20);
        guest.add(1,2410);
        //guest.clear();
        guest.remove(2);

        for(int i=0;i<guest.size();i++){
            System.out.println("Guest "+(i+1)+" :"+guest.get(i));
        }
        System.out.println();
        System.out.println("size of array : "+guest.size());
        System.out.println();

        boolean isempty=guest.isEmpty();
        System.out.println("Is empty : "+isempty);

    }
}