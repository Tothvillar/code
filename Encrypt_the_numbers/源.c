#include<stdio.h>
#include<stdint.h>
int main()
{
	char arr[20] = { 'H','e','l','l','o',' ','W','o','r','l','d' };
	int i = 0;
	printf("加密前\n");
	for (int a = 0; a < 20; a++)
	{
		printf("%c", arr[a]);
	}
	printf("\n");
	for (i = 0; i < 20; i++)
	{
		if (arr[i] >= 'a' && arr[i] <= 'z')
		{
			if (arr[i] < 'v')
			{
				arr[i] += 5;
			}
			else
				arr[i] -= 21;
		}
		if (arr[i] >= 'A' && arr[i] <= 'Z')
		{
			if (arr[i] < 'V')
			{
				arr[i] += 5;
			}
			else
				arr[i] -= 21;
		}
	}
	printf("加密后\n");
	for (int a = 0;  a< 20; a++)
	{
		printf("%c", arr[a]);
	}
	return 0;
}