class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        if(m<n) return false;   //When s2 is smaller than s1 

        int map1[]=new int[26];

        for(int i=0;i<n;i++){
            map1[s1.charAt(i)-'a']++;  //elements created for map1
        }
        for(int i=0;i<=m-n;i++){   //elements created for map2
            int map2[]=new int[26];
            for(int j=0;j<n;j++){
                map2[s2.charAt(i+j)-'a']++;
            }
            if(isMatched(map1,map2)){  //for matching map1 and map2
                return true;  // and if it is matched then return true
            }
        }
        return false;  // else false
    }

        private boolean isMatched(int map1[], int map2[]){  //Are these two frequency arrays equal
            for(int i=0;i<26;i++){
                if(map1[i]!=map2[i]) return false;
            }
            return true;
        }

    }
