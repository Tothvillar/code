int jieCheng(int n)
{
	if (n < 1)
	{
		printf("�������");
		exit(-1);
	}
	if (n == 1)
	{
		return 1;
	}
	return n * jieCheng(n - 1);
}
int main()
{
	double result = 0.00;
	while (1)
	{
		printf("������һ��������");
		int n = 0;
		scanf("%d", &n);
		result = jieCheng(n);
		printf("%d�Ľ׳�Ϊ��%.0lf\n", n, result);
	}
	return 0;
}
