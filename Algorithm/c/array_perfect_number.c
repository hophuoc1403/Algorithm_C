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
	
	void checkFrom1ToNumber(int num){
		int i ;
		printf("so hoan hao la : \n");
		for(i = 0;i<= num;i++){
			if(isPerfectNumber(i)){
				printf("%d \t",i);
			}
		}
	}

int main() {
	
	int num;
	printf("nhap so : ");
	scanf("%d",&num);
	
	checkFrom1ToNumber(num);
	
	return 1;
}
