#include <iostream>
#include <vector>

using namespace std;

class LittleElephantAndIntervalsDiv2
{
public:
    int getNumber(int m, vector<int> l, vector<int> r)
    {
        vector<int> colors;
        colors.resize(m+1);
        for (int i=0;i < l.size();i++)
        {
            for (int j=l[i];j<=r[i];j++)
            {
                colors[j]=i+1;
            }
        }
        bool used[20] = {0};
        for (int i=1;i<=m;i++)
        {
            used[colors[i]] = true;
        }
        int count=0;
        for (int i=1;i<=l.size();i++)
        {
            if (used[i])count++;
        }
        return 1<<count;
    }
};
