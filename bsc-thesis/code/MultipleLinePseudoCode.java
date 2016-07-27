i = index in line number attribute which contains the invoke.* opcode
if (lineNrAttribute[j>i] <= lineNrAttribute[i]) {		
		
		if (isAlternating(i,j))
			return getAlternatingInterval(i, j);
		
		// non-alternating
		b = j which has the smallest line number after j;
		a = corresponding index to b; // index<k which has the same line number as b||k
		return getNonAlternatingInterval(a, b);	
		
} else if (lineNrAttribute[j<i] == lineNrAttribute[i]) {
		b = i;
		a = j;
		return getInterval(a, b);
}	