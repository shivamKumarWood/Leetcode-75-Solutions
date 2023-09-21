class Solution:
    def reverseVowels(self, s: str) -> str:
        charArray = list(s)
        if len(s) <= 1:
            return s
        i, j = 0, len(s) - 1
        
        vowels = "aeiouAEIOU"
        
        while i < j:
            ch = charArray[i]
            if ch in vowels:
                while i < j:
                    ch1 = charArray[j]
                    if ch1 in vowels:
                        charArray[i], charArray[j] = charArray[j], charArray[i]
                        j -= 1
                        break
                    else:
                        j -= 1
                i += 1
            else:
                i += 1
        
        return ''.join(charArray)