package day07;

public class string {
    static String reverse(String s1){
        String s2= "";
        for (int i = s1.length()-1;i>=0;i-- ){
            s2+=s1.charAt(i);
        }return s2;
    }
    static boolean pallindrome(String s1){
        int i =0;int j = s1.length()-1;
                while (i<=j){
                    if (s1.charAt(i)!=s1.charAt(j))
                    return false ;
                    i++;j--;
                }return true;
        }
        static char maxOcuur(String s2){
            int countMaxElement=0;
        char maxElement= '*';
        int countCurrElement=0;
        char currElement= '*';
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!=currElement){
                if(countCurrElement>countMaxElement){
                    countMaxElement= countCurrElement;
                    maxElement= currElement;
                }
                currElement= s2.charAt(i);
                countCurrElement=1;
            }else{
                countCurrElement++;
            }
        }
        if(countCurrElement>countMaxElement){
            countMaxElement= countCurrElement;
            maxElement= currElement;
        }
        return maxElement;
    }
        static char charfindMaxOcc(String s){
            int [] arr = new int [26];
            for (int i =0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }int index =0;
            for (int i =0;i<arr.length;i++){
                if (arr[index]<arr[i]){
                    index =i;
                }
            }return (char)('a'+index);
        }
        static void reverseWord(String s){
        String [] arr = s.split("\\s");
        for (int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
        }
    public static void main(String[] args) {
        /*questions for practice of string 
         * 1 function to reverse a string
         * potato-otatop
         * 2 function to check the string is pallindrome or not
         * detartrated - true
         * 3 find the max occuring element in a sorted string 
         * aaabbbbcdd - b
         * 4 find the max occuring element in String 
         * abcabcaabaca-a
         * 5 function to reverse the words of a string 
         * the bird is flying - flying is bird the
         * homework ques 424 on leetcode 
         */
        // String s1= "this\sis\sa\sclass";
        // String s2="this is a class";
        // String s3="this\tis\ta\ttab";
        // String s4="this is line 1\nthis is line 2";
        // String s5= "this is \r funny";
        // String s6="this is\b\b\b\b a table";
        // String s7="girls rule \f ";
        // String s8="\"hello\"";
        // String s9="\'hello\'";
        // char a= '\'';
        // String s10= "this is a \\ divide ";


        // String s11= "hi, this is string";
        // String [] arr = s11.split("\s",2);
        // for (String i:arr){
        //     System.out.println(i);
        // }
        // String s12= "hello";
        // String s13 = new String ("hello").intern();
        // System.out.println(s13==s12);
        // System.out.println(s12==s13);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);
        // System.out.println(s6);
        // System.out.println(s7);
        // System.out.println(s8);
        // System.out.println(s9);
        // System.out.println(a);
        // System.out.println(s10);
        // int n =5;
        // String s15 = String.valueOf(n);
        // s15+="abc";
        // System.out.println(s15);

        // String s = "potatop";
        // String m = "aaabbbbcddaaaaa";
        // String rev = reverse(s);
        // System.out.println(rev);
        // System.out.println(pallindrome(s));
        // System.out.println(maxOcuur(m));
        // System.out.println(charfindMaxOcc(m));
        String w = "this is a class";
        reverseWord(w);
        
    }
}

