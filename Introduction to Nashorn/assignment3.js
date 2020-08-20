var hmap = Java.type("java.util.HashMap");
countAndCap = new hmap();
countAndCap.put('India','Delhi');
countAndCap.put('Australia','Canberra');
countAndCap.put('Japan','Tokyo');
countAndCap.put('France','Paris');
countAndCap.put('USA','Washington D C');
keys = countAndCap.keySet();
iter = keys.iterator();
for(;iter.hasNext();)
{
	s = iter.next();
	print(s+" : "+countAndCap.get(s));
}