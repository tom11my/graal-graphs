// #include <iostream>
// using namespace std;
int printHello(int i) {
    int y = i + 2;
    return y;
}

int main() {
    int i = 0;

    // while (i < 3) {
    //     int res = printHello(i);
    //     cout << res << "\n";
    //     i++;
    // }
    while (true) {
        int res = printHello(i); 
        // cout << res << "\n";
        // i++;
    }
}
