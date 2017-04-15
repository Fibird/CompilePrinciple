int main()
{
    int a, b, c;
    a = 4;
    b = 8 * a;
    c = a + b * 3;
    if (a > b)
    {
        a = b;
    }
    else if (a > c)
    {
        b = c;
    }
    else
    {
        c = 0;
    }
    return 0;
}
