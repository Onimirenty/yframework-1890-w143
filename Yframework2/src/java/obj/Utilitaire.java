package obj;

public class Utilitaire {
        public Utilitaire() {
    }
    
    public String getLastOfPath(String path, String context){
        String[] words = path.split(context);
        String[] lastpath = new String[words.length];
        String last = new String();
        String result = new String();
        char[] res; 
        for(int i=1; i<words.length; i++){
            lastpath[i]= words[i];
            last = lastpath[i];
            result = last;
        }
        
        if(last.contains("?")){
            char[] data = last.toCharArray();
            for(int i=0; i<data.length; i++){
                if(data[i]=='?'){
                    res = new char[i];
                    for(int j=0; j<data.length; j++){
                        if(data[j]!='?')
                            res[j] = data[j];
                        else
                            break;
                    }
                    result = new String(res);
                }   
            }
            
        }
        return result;
    }
}
