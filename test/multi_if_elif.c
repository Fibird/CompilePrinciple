int main()
{
	int a, b, c;
	a = 6 * 4;
	b = a * 3 - 9;
	c = a / b;
	
	if (a > b)
	{
		a = 8;
	}
	else if (a < c)
	{
		b = 6;
	}
	else if (b > c)
	{
		c = 9;
	}
	else
	{
		a = b + c;
	}
}