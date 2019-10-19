echo "Enter a number: "
read n
rev=0
while [ "$n" -ge 1 ]
do
	rem=`expr $n % 10`
	rev=`expr $rev \* 10`
	rev=`expr $rev + $rem`
	n=`expr $n / 10`
	echo "$rem $rev $n"
done
echo "Rev = $rev"
