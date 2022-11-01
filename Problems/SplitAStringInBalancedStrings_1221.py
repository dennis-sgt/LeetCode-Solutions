class Solution(object):
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        counter = 0
        for c in s:
            counter += 1 if c == "L" else -1
            if counter == 0:
                ans += 1
        return ans
