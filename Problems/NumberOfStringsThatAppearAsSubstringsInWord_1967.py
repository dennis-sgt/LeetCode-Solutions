class Solution:
    def numOfStrings(self, patterns: list[str], word: str) -> int:
        return sum(list(1 for i in range(len(patterns)) if patterns[i] in word))
