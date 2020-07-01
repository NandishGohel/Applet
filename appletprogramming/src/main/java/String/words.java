package String;

class WordCount
{
    static int i,count=0,result;
    static int wordcount(String str)
    {
        char ch[]= new char[str.length()];     
        for(i=0; i<str.length(); i++)
        {
            ch[i] = str.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            count++;
        }
        return count;
    }    
    public static void main (String args[])
    {
        result = WordCount.wordcount("Java is a pure Object oriented programming language ");
        System.out.println("The number of words in the String are :  "+result);
    }
}