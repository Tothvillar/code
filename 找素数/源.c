int judgement(int x)
{
	double a = sqrt(x);
	for (int b = 2; b <= a; b++)
	{
		if (x % b == 0)
		{
			return 1;
		}
	}
	return 0;
}
int main()
{
	int num = 0;
	scanf("%d", &num);
	if (judgement(num))
		printf("该数不是素数");
	else
	{
		printf("该数是素数");
	}
	return 0;
}