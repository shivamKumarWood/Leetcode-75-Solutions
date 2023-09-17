#Approach:1
class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        n1, n2 = len(str1), len(str2)
        if n1 > n2:
            return self.helper(str1, str2)
        else:
            return self.helper(str2, str1)
    
    def helper(self, str1: str, str2: str) -> str:
        res = ""
        n1, n2 = len(str1), len(str2)
        idx = n2
        while idx > 0:
            if n1 % idx != 0 or n2 % idx != 0:
                idx -= 1
            else:
                i = 0
                while i < n1:
                    if str1[i:i+idx] != str2[0:idx]:
                        break
                    i += idx
                j = 0
                while j < n2:
                    if str2[j:j+idx] != str2[0:idx]:
                        break
                    j += idx
                if i == n1 and j == n2:
                    return str2[0:idx]
                idx -= 1
        return res

#Approach:2
class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if not (str1 + str2 == str2 + str1):
            return ""
        
        gcdLength = self.gcd(len(str1), len(str2))

        return str1[:gcdLength]

    @staticmethod
    def gcd(a: int, b: int) -> int:
        while b != 0:
            temp = b
            b = a % b
            a = temp
        return a