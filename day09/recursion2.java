package day09;

public class recursion2 {
    static int fib (int n){
                if (n==0||n==1){
                    return n;
                }
                int fib1=fib(n-1);
                int fib2=fib(n-2);
                return fib1+fib2;
            }
            static void GenerateSubsequence(String ques,String ans){
                if (ques.length()==0){
                    System.out.println(ans);
                    return;
                }
                GenerateSubsequence(ques.substring(1), ans+ques.charAt(0));
                GenerateSubsequence(ques.substring(1), ans);
            }
            static void toss(int n,String ans){
                if (n==0){
                    System.out.println(ans);
                    return;
                }
                toss(n-1,ans+"H");
                toss(n-1,ans+"T");
            }
            static int CountToss(int n){
                if (n ==0){
                    return 0;
                }
                int l =CountToss(n-1);
                int r =CountToss(n-1);
                return l+r;
            }
            static int countSubsequence(String ques){
                if (ques.length()==0){
                    return 1;
                }int l = countSubsequence(ques.substring(1));
                int r = countSubsequence(ques.substring(1));
                return l+r;
            }
            
            static void generateParanthesis(int n, String ans , int l , int r){
                if (l==n && r==n){
                    System.out.println(ans);
                    return;
                }if (l<n){
                    generateParanthesis(n, ans+"{", l+1, r);
                }if (r<l){
                    generateParanthesis(n, ans+"}", l, r+1);
                }
            }
            static void generate(String ques , String ans){
                if (ques.length()==0){
                    System.out.println(ans);
                    return ;
                }for (int i = 0;i<ques.length();i++){
                    String s1 = ques.substring(0,i);
                    String s2 = ques.substring(i+1);
                    generate(s1+s2, ans+ques.charAt(i));
                }
            }
            // 20, 22 lc
            public static void main(String[] args) {
                generate("abc", "");
                // generateParanthesis(3, "", 0, 0);
                // System.out.println(validPar("(]"));
                // System.out.println(countSubsequence("car"));
                // System.out.println(CountToss(2));
                // GenerateSubsequence("car","");
                // toss(3, "");
                // Scanner sc = new Scanner (System.in);
                // String n = sc.nextLine();
                // System.out.print/ln(subsequence(0));
                // System.out.println(fib(n));
                // sc.close();
            }
        }

