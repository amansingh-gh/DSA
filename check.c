#include <stdio.h>
#include <math.h>

int main() {
    int arr[3] = {10, 20, 30};

    int a = 1;
    char ch = 'A';
    float f = 1.5;

    int *p1 = &a;
    char *p2 = &ch;
    float *p3 = &f;

    // Print values
    printf("Value of *p1: %d\n", *p1);

    // Print addresses
    printf("Address of p1: %p\n", (void*)&p1);
    p1++;
    printf("Address after p1++: %p\n", (void*)&p1);

    // Print sizes
    printf("Size of int: %zu bytes\n", sizeof(int));
    printf("Size of char: %zu bytes\n", sizeof(char));
    printf("Size of float: %zu bytes\n", sizeof(float));

    printf("Size of int pointer (p1): %zu bytes\n", sizeof(p1));
    printf("Size of char pointer (p2): %zu bytes\n", sizeof(p2));
    printf("Size of float pointer (p3): %zu bytes\n", sizeof(p3));

    return 0;
}
