#include <iostream>

using namespace std;

class LittleElephantAndBallsAgain {
public:
    int getNumber(string s)
    {
        char c = 0;
        int curnum = 0;
        int maxnum = 0;
        for (int i=0;i<s.size();i++)
        {
            if (s.at(i) == c)
            {
                curnum += 1;
            }
            else
            {
                if (curnum > maxnum) maxnum = curnum;
                curnum = 1;
                c = s.at(i);
            }
        }
        if (curnum > maxnum) maxnum = curnum;
        return s.size() - maxnum;
    }
}
