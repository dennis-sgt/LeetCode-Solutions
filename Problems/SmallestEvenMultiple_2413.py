class Solution(object):
    def smallestEvenMultiple(self, n):
        for i in range(1, n + 1):
            if i % 2 == 0 and i % n == 0:
                return i
        return n * 2
