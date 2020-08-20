function verifyPrime(num) {
	var isPrime = false;
	if(num === 2  || num === 3)
	{
		isPrime = true;
	}
	else
	{
		var r = Math.ceil(Math.sqrt(num));
		for(var i = 2; i<=r ; i++)
		{
			if(num%i === 0)
			{
				isPrime = false;
				break;
			}
			if(i === r)
			{
				isPrime = true;
			}
		}
	}
	return isPrime;
}