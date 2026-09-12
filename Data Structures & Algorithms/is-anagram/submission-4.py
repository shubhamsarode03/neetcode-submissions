class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!= len(t)):
            return False
        size = 26
        list = [0] * size

        for i in range(len(s)):
            s_index = ord(s[i]) - ord('a')
            list[s_index] +=1
            t_index = ord(t[i])- ord('a')
            list[t_index] -= 1

        for i in range (len(list)):
            if list[i] >0:
                return False
        return True

        