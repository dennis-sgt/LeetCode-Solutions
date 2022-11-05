class Solution:
    def countAsterisks(self, s: str) -> int:
        return sum(list(s.split("|")[i].count("*") for i in range(0, len(s.split("|")), 2)))
