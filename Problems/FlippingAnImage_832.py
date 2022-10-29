class Solution(object):
    def flipAndInvertImage(self, image):
        ans = []
        for elem in image:
            row = []
            for i in range(len(elem) - 1, -1, -1):
                row.append(1 - elem[i])
            ans.append(row)
        return ans
