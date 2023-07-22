import java.util.ArrayList;

public class WaterContainer{
    public static int storeWater(ArrayList<Integer>heigth){
        int maxWater =0;
        int lp = 0;
        int rp = heigth.size()-1;

        while(lp<rp){
            //calculate water area
            int ht = Math.min(heigth.get(lp),heigth.get(rp));
            int width = rp-lp;
            int currWater = ht *width;
            maxWater= Math.max(maxWater, currWater);

            //upadte ptr
            if(heigth.get(lp)<heigth.get(rp)){
                lp++;
            }else{
                rp--;
            }
            
        }
       return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>heigth = new ArrayList<>();
        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);
        System.out.println(storeWater(heigth));
    }
}