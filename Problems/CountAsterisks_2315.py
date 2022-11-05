class Solution:
    def countAsterisks(self, s: str) -> int:
        counter = 0
        split = s.split("|")
        print(split)
        for i in range(0, len(split), 2):
            counter += split[i].count("*")
        return counter
