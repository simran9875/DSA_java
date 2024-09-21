package practice1;

public class str {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("tony is my name");
        // String names = "tonys";
        // for concat
        // String fullName = (names.concat(name)); // && name +names (is same)
        // for length
        // System.out.println(fullName.length());
        // for charAt
        // for (int i =0;i<fullName.length();i++){
        //     System.out.print(fullName.charAt(i)+"  ");
        // compare first
        /*in case of compare
        s1==s2 => 0
        s1 <s2 => positive value
        s1>s2 => negative value
        */
        // if (name.compareTo(names)==0){
        //     System.out.println("string is equal");
        // } else {
        //     System.out.println("not equal");
        // }
        // compare 2
        // System.out.println(name.compareTo(names)); // or name == names without println statement the output is not printed
        
        // substring := part of the string output k liye
        // System.out.println(name.substring(5));
        // StringBuilder sb = new StringBuilder("HelloWorld");
    
    for(int i=0; i<name.length()/2; i++) {
    int front = i;
    int back = name.length() - i - 1;


    char frontChar = name.charAt(front);
    char backChar = name.charAt(back);


    name.setCharAt(front, backChar);
    name.setCharAt(back, frontChar);
    }
    System.out.println(name);
    }

    }

