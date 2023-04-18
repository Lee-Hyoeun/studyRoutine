package etc;

import java.util.HashSet;

class no42576 {
    public boolean solution(String[] phone_book) {
        
        HashSet<String> set = new HashSet<>();
        
        for(String num : phone_book){
            set.add(num);
        }
        
        for(int i =0; i< set.size(); i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(set.contains(phone_book[i].substring(0,j))) return false;
            }
        }
        
        return true;
        
    }
}

