public class TestChaine {

    public boolean testChaine(String s,String t){
        int i = 0, j = 0;

        i = s.indexOf(t, i);

        if (i != -1)
        {
            j ++;
            i += t.length();
        }
        System.out.println(j);
        if(j >= 5){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        TestChaine t = new TestChaine();
        System.out.println(t.testChaine("AABCCAAADCBBAADBBC","AA"));
    }
}
