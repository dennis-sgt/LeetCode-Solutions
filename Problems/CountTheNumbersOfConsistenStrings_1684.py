class Solution:
    def countConsistentStrings(self, allowed: str, words: list[str]) -> int:
        output = 0
        for i in range(len(words)):
            temp = 0
            for c in words[i]:
                if c in allowed:
                    temp += 1
                else:
                    temp -= 1
            if temp == len(words[i]):
                output += 1
        return output
