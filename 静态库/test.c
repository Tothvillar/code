#define _CRT_SECURE_NO_WARNINGS
#include<stdint.h>
#include<stdio.h>
#include"add.h"
int main()
{
	int a = 0;
	int b = 0;
	scanf("%d %d",&a,&b );
	int num = add(a, b);
	printf("%d\n", num);

}