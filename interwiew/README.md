손코딩
======

>재귀를 이용한 피보나치 수열
>    >시간복잡도 : O(2^n)
            
            int fibo(int n){
            if(n<2) return n;
            return fibo(n-1) + fibo(n-2);
            }
피보나치 수열
======
![finonacci](https://user-images.githubusercontent.com/100178951/175017729-0584714f-5be1-4abe-98ae-5207df098002.png)

앞에 두개에 있는 항목의 합이 그 다음 항목이 되는것을 의미


메모이제이션을 이용한 피보나치
========

>메모이제이션을 이용한 피보나치
>     >시간복잡도 : O(2^n)

    int fibo(int n) {
        if(n == 0)
           return 0;
        else if(n == 1)
           return 1;
        else if(fibo[n] != 0)
           return fibo[n];
        else
           return fibo[n] = fibo(n - 1) + fibo(n - 2);
        }

//참고자료 https://n-square.tistory.com/82

//참고자료 https://github.com/4z7l/tech_interview.zip/blob/main/%EC%A7%81%EB%AC%B4/Coding.md