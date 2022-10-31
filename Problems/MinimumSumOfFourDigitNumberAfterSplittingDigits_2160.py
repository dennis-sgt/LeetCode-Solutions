class Solution(object):
    def minimumSum(self, num):
        """
        :type num: int
        :rtype: int
        """
        min1 = min(list(str(num)))
        num = str(num).replace(min(list(str(num))), "", 1)
        min2 = min(list(str(num)))
        num = str(num).replace(min(list(str(num))), "", 1)
        max1 = max(list(str(num)))
        num = str(num).replace(max(list(str(num))), "", 1)
        max2 = num
        return int(min1 + max1) + int(min2 + max2)
