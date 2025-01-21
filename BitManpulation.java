
package com.mycompany.solid;

//Bit manipulation
// &,|,^,~ (these bitwise operators deals with bits in bacground)
//( 1<<1 == 2^1)
//(n>>1) n/2
//(n<<1) n*2
class BitManpulation {
    //check even or odd
    static public int isEven(int n){
     return (n&1);
    }
    //-----check the number is power of two or 
    static public Boolean isPowerOfTwo(int n){
        return (n>0) &&((n&(n-1))==0);
    }
    //flip bit in index k (XOR)
    static public int flipBit(int num,int k){
      return (num ^(1<<k));
    }
    //bit at index make it off in any case
     static public int bitOff(int num,int k){
      return (num &(~(1<<k)));
    }  
     //found the number that contain k num
     static public int numberOfKOnes(int k){
      return ((1<<k)-1);  //(2^k)-1
    }  
    //count the ones in number
     static public int onesCount(int k){
      int cnt=0;
      int r;
      while(k>0){
      r=k%2;
      if(r==1){cnt++;}
      k>>=1;//k=k/2;
      }
      return cnt;
    } 
     
}
