#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdint.h>
int main()
{
	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
	int a = 0;
	printf("请输入数字:");
	scanf("%d", &a);
	int left = 0;
	int right = 9;
	while (left <= right)
	{
		int add = (right + left) / 2;
		if (arr[add] < a)
		{
			left = add + 1;
		}
		else if (arr[add] > a)
		{
			right = add - 1;
		}
		else
		{
			printf("找到了这数字的下标是：%d", add);
			break;
		}
	}
	if (left > right)
		printf("找不到该数字");
	return 0;
}