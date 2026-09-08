#include <iostream>
#include <string>

using namespace std;

int marsExploration(string s) {
    int changedCount = 0;
    string expected = "SOS";
    
    for (int i = 0; i < s.length(); i++) {
        // Compare each character with the corresponding character in "SOS"
        if (s[i] != expected[i % 3]) {
            changedCount++;
        }
    }
    
    return changedCount;
}

int main() {
    string s;
    if (cin >> s) {
        cout << marsExploration(s) << endl;
    }
    return 0;
}
