public class Duplicates {
    public static void RemoveDup(String str,int idx, StringBuilder newStr, boolean map[]){
       if(idx == str.length()){
        System.out.println(newStr);
        return;
       }
       //index
       char curr = str.charAt(idx);
       //skip
        if(map[curr - 'a'] == true){
            RemoveDup( str,idx+1,newStr, map);
        }else{
            //add
            map[curr - 'a'] = true;
            RemoveDup( str,idx+1,newStr.append(curr), map);
        }



    }
    public static void main(String args[]){
      String str = "appppnnaaacollegeee";
      RemoveDup( str,0, new StringBuilder(""), new boolean[26]);
    }
    
}
