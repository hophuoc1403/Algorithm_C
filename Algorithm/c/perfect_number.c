#include <stdio.h>

int tongUoc(int num,int i,int sum){
		
		if(i < 1){
			return sum;
		}
		
		 if(num % i == 0){
		 	sum += i;
		 }
		 return tongUoc(num,i-1,sum);
	}
	
	int isPerfectNumber(int num){
		int sum = tongUoc(num,num-1,0);
		if(sum == num){
			return 1;
		}
		return 0;
	}

int main() {
	int num;
	printf("nhap so : ");
	scanf("%d",&num);
	
	if(isPerfectNumber(num))
		printf("la so hoan hao");
		
	else printf("khong phai so hoan hao");
	
	
	return 0;
}
