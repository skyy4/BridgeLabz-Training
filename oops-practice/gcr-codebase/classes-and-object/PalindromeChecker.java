public class PalindromeChecker {
    private String txt;

    public PalindromeChecker(String txt){
        this.txt=txt;
    }

    public boolean check(){
        String s=txt.replaceAll("\\s","").toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return s.equals(rev);
    }

    public void display(){
        if(check())
            System.out.println(txt+" is palindrome");
        else
            System.out.println(txt+" is not Palindrome");
    }

    public static void main(String[] args){
        new PalindromeChecker("A man a plan a canal Panama").display();
        new PalindromeChecker("Hello").display();
    }
}

