#include <stdio.h>
#include <math.h>

int calculate(int n,int i){
	if(n % i == 0){
	
		int restNumber = n;
		int sum = 0;
		while (restNumber > 1){
			if(restNumber%i == 0){
				sum+=1;
				restNumber /= i;
			}
		}
		
		printf("%d ^ %d",i,sum);
	}
	if(i >= sqrt(n)){
		return ;
	}
	return calculate(n,i+1);
}

int main(){
	int num ;
	printf("nhap so : ");
	scanf("%d",&num);
	
	calculate(num,2);
	
	
	return 0;
}
