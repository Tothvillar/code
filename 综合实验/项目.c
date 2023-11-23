#define _CRT_SECURE_NO_WARNINGS
#include<math.h>
#include<stdio.h>
#include<stdint.h>
void print_directory()
{
	printf("*************************\n");
	printf("***1.解二元一次方程******\n");
	printf("***2.判断是否为闰年******\n");
	printf("***3.判断是否为水仙花数**\n");
	printf("***0.退出程序************\n");
	printf("*************************\n");
	printf("请选择功能：");
}
void is_run()
{
	int a = 0;
	printf("请输入年份：");
	scanf("%d", &a);
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
	{
		printf("该年是闰年");
	}
	else
		printf("该年不是闰年");
}
void is_Narcissistic_number()
{
	int n = 0;
	while (1)
	{
		printf("请输入一个数：");
		scanf("%d", &n);
		if (n >= 100 && n < 1000)
		{
			int sum = 0;
			int i = n;
			for (i = n; i != 0; i /= 10)
			{
				sum += (i % 10) * (i % 10) * (i % 10);

			}
			if (sum == n)
			{
				printf("该数是水仙花数");
				break;
			}
			else
			{
				printf("该数不是水仙花数");
				break;
			}
		}
	}
}
void Solve_the_equation()
{
	double a = 0.00;
	double b = 0.00;
	double c = 0.00;
	double d = 0.00;
	double x1 = 0.00;
	double x2 = 0.00;
	printf("请输入3个系数：");
	printf("ax**2 + bx = c");
	printf("请输入一元二次方程的三个系数：\n");
	scanf("%lf %lf %lf", &a, &b, &c);
	d = b * b - 4 * a * (-c);
	if (d >= 0)
	{
		x1 = (-b + sqrt(d)) / (2 * a);
		x2 = (-b - sqrt(d)) / (2 * a);
		printf("x1 = %lf,x2 = %lf", x1, x2);
	}
	else
		printf("此一元二次方程无实数根");
}
int main()
{
	print_directory();
	int num = 0;
	while (1)
	{
		scanf("%d", &num);
		if (num == 1)
		{
			Solve_the_equation();
			break;
		}
		else if (num == 2)
		{
			is_run();
			break;
		}
		else if (num == 3)
		{
			is_Narcissistic_number();
			break;
		}
		else if (num == 0)
		{
			break;
		}
		else
			printf("对不起请重新输入");
	}

	return 0;
}