class Palindrome 
{
    public static void main(String args[]) 
    {
      int num = 3553, revNum = 0, remainder;
      int originalNum = num;

      while (num != 0) 
      {
        remainder = num % 10;
        revNum = revNum * 10 + remainder;
        num /= 10;
      }
      if (originalNum == revNum) 
        System.out.println(originalNum + " is Palindrome.");
      else 
        System.out.println(originalNum + " is not Palindrome.");
    }
}