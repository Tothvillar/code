#define _CRT_SECURE_NO_WARNINGS
#include<math.h>
#include<stdio.h>
#include<stdint.h>
void print_directory()
{
	printf("*************************\n");
	printf("***1.���Ԫһ�η���******\n");
	printf("***2.�ж��Ƿ�Ϊ����******\n");
	printf("***3.�ж��Ƿ�Ϊˮ�ɻ���**\n");
	printf("***0.�˳�����************\n");
	printf("*************************\n");
	printf("��ѡ���ܣ�");
}
void is_run()
{
	int a = 0;
	printf("��������ݣ�");
	scanf("%d", &a);
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
	{
		printf("����������");
	}
	else
		printf("���겻������");
}
void is_Narcissistic_number()
{
	int n = 0;
	while (1)
	{
		printf("������һ������");
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
				printf("������ˮ�ɻ���");
				break;
			}
			else
			{
				printf("��������ˮ�ɻ���");
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
	printf("������3��ϵ����");
	printf("ax**2 + bx = c");
	printf("������һԪ���η��̵�����ϵ����\n");
	scanf("%lf %lf %lf", &a, &b, &c);
	d = b * b - 4 * a * (-c);
	if (d >= 0)
	{
		x1 = (-b + sqrt(d)) / (2 * a);
		x2 = (-b - sqrt(d)) / (2 * a);
		printf("x1 = %lf,x2 = %lf", x1, x2);
	}
	else
		printf("��һԪ���η�����ʵ����");
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
			printf("�Բ�������������");
	}

	return 0;
}