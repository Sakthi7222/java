public class reverse
{
public static void main(String[]args)
{
String input="Amazon development centre Chennai";
input=input.toLowerCase();
String[] words=input.split(" ");
int wordCount=words.length;
System.out.println("Word Count:"+wordCount);
System.out.println("Reserved Sentence:");
for(int i=wordCount-1;i>=0;i--)
{
System.out.println(words[i]+" ");
}
}
}