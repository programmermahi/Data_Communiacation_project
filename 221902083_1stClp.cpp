#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function to convert IPv4 decimal to binary
char *decimalToBinary(unsigned int decimal) {
    char *binary = (char *)malloc(33 * sizeof(char));
    if (binary == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    
    int index = 31;
    binary[index] = '\0';
    
    while (index >= 0) {
        binary[--index] = (decimal % 2) + '0';
        decimal /= 2;
    }
    
    return binary + index + 1;
}

// Function to convert binary to IPv4 decimal
unsigned int binaryToDecimal(const char *binary) {
    unsigned int decimal = 0;
    int len = strlen(binary);
    int power = 1;
    
    for (int i = len - 1; i >= 0; i--) {
        if (binary[i] == '1')
            decimal += power;
        power *= 2;
    }
    
    return decimal;
}

int main() {
    unsigned int ipDecimal;
    char ipBinary[33];
    
    // Convert IPv4 decimal to binary
    printf("Enter IPv4 address in decimal notation: ");
    scanf("%u", &ipDecimal);
    char *binary = decimalToBinary(ipDecimal);
    printf("IPv4 address in binary: %s\n", binary);
    free(binary);
    
    // Convert binary to IPv4 decimal
    printf("Enter IPv4 address in binary notation (32 bits): ");
    scanf("%s", ipBinary);
    unsigned int decimal = binaryToDecimal(ipBinary);
    printf("IPv4 address in decimal: %u\n", decimal);
    
    return 0;
}
