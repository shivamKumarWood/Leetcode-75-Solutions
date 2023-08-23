class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len1 = len(word1)
        len2 = len(word2)
        
        if len1 == 0:
            return word2
        elif len2 == 0:
            return word1
        
        pos = 0
        str = ""
        
        while pos <= len1 - 1 or pos <= len2 - 1:
            if pos < len1:
                str+= word1[pos]
            if pos < len2:
                str += word2[pos]
            pos += 1
        
        return str