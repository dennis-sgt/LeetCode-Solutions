romanLetters = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }

class Solution:
    def romanToInt(self, s: str) -> int:
        ans = 0
        
        for i in range(len(s)):
            if len(s) == 1:
                ans += romanLetters.get(s[i])
            elif i < len(s) - 1 and romanLetters.get(s[i]) >= romanLetters.get(s[i + 1]):
                if i + 1 == (len(s) - 1) and romanLetters.get(s[i + 1]) <= romanLetters.get(s[i]):
                    print("NN")
                    ans += romanLetters.get(s[i + 1])
                ans += romanLetters.get(s[i])
            elif i < len(s) - 1 and romanLetters.get(s[i]) < romanLetters.get(s[i + 1]):
                if i + 1 == (len(s) - 1) and romanLetters.get(s[i + 1]) >= romanLetters.get(s[i]):
                    print("Fortnite")
                    ans += romanLetters.get(s[i + 1])
                ans -= romanLetters.get(s[i])
                
        return ans
