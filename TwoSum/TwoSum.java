import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer , Integer> Map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){


            // Sirayla i sayisina gore nums listesinin indexine gore ariyor 
            // ornek ilk 0 ile basladigi icin sifirinci indexini aliyor
            // bu sayede tum elemanlari tanimis oluyor
            // Maksimum nums.lenght yazmamizin nedeni listenin indexi kadar almasi
            // index sifirdan basliyor oyuzden <= yazmamiza gerek yok eger yazacaksan + 1 eklememiz lazim

            int needInt = target - nums[i];
            // Containskey Daha onceden Bu map'e kaydedılmıs needInt varmı dıye sorgular
            // eger varsa map.get value ile index numarasini veren bir methoddur
            // map.get ile key'ın index numarasini alir ve for da olusturdugu ve num[] da kullandigi degerin index numarasini kullanir ve yeni bir int olusturur
            if(Map.containsKey(needInt)){ // Map.put( nums[i],i); yazmamizin nednei Key ile aramamizdir. arama key ile olur containskey
                return new int[] {
                    Map.get(needInt) , i // get ile degerin index numarasini aliyoruz Map.put( nums[i],i); diye kaydettigimzi icin
                };
            }

            // eger return saglanamazsa daha sonraki for donguleri icin loglar
            Map.put( nums[i],i);


        }   
        return new int[]{};
    }
}