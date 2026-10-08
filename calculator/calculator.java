class Solution {
    public void calculate(int a, int b, int optr) {
        // code here
        int x=a+b,y=b-a,z=a*b;
        if (optr==1){
            System.out.print(x);
        }
        else if(optr==2){
            System.out.print(y);
        }
        else {
            System.out.print(z);
        }
        }
    }
