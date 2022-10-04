public class Chaine {
    public static boolean testSousChaine(String s, String t)
    {
        int index = 0, count = 0;
        while (true)
        {
            index = s.indexOf(t, index);
            if (index != -1)
            {
                count ++;
                index += t.length();
            }
            else {
                break;
            }
        }
        System.out.println(count);
        if(count >= 3){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        String s = "AABCCAAADCBBAADBBCAAUEUEAAAUUAAA";
        String t = "AA";
        System.out.println(testSousChaine(s,t));
    }
}
