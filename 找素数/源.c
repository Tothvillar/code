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
		printf("������������");
	else
	{
		printf("����������");
	}
	return 0;
}