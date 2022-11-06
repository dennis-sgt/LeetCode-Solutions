class Solution:
    def numOfStrings(self, patterns: list[str], word: str) -> int:
        output = 0
        for i in range(len(patterns)):
            if patterns[i] in word:
                output += 1
        return output
