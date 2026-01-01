public class SentenceFormatter {

    public static String formatParagraph(String para){
        if(para==null || para.trim().isEmpty())
            return "";

        para=para.trim().replaceAll("\\s+"," ");

        String res="";
        boolean cap=true;

        for(int i=0;i<para.length();i++){
            char ch=para.charAt(i);

            if(cap && Character.isLetter(ch)){
                res+=Character.toUpperCase(ch);
                cap=false;
            }else{
                res+=ch;
            }

            if(ch=='.' || ch=='?' || ch=='!'){
                cap=true;
                if(i+1<para.length() && para.charAt(i+1)!=' ')
                    res+=" ";
            }
        }
        return res;
    }

    public static int countWords(String para){
        if(para==null || para.trim().isEmpty())
            return 0;
        return para.trim().split("\\s+").length;
    }

    public static String longestWord(String para){
        if(para==null || para.trim().isEmpty())
            return "";

        String[] arr=para.trim().split("\\s+");
        String longw=arr[0];

        for(String w:arr){
            if(w.length()>longw.length())
                longw=w;
        }
        return longw;
    }

    public static String replaceWord(String para,String oldw,String neww){
        if(para==null || para.trim().isEmpty())
            return "";
        return para.replaceAll("(?i)\\b"+oldw+"\\b",neww);
    }

    public static void main(String[] args){
        String para="  hello world.this is   a test!how are you?  ";

        String formatted=formatParagraph(para);
        System.out.println("Formatted Paragraph:");
        System.out.println(formatted);

        System.out.println("Word Count: "+countWords(formatted));
        System.out.println("Longest Word: "+longestWord(formatted));

        String replaced=replaceWord(formatted,"test","demo");
        System.out.println("After Replacement:");
        System.out.println(replaced);
    }
}