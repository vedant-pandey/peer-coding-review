def magic_number(n):

    n_int = bin(n).replace("0b", "")

    binary = int(n_int)
    binary1 = int(n_int)
    decimal, i, n = 0, 1, 0
    while(binary != 0):
        dec = binary % 10
        decimal = decimal + dec * pow(5, i)
        binary = binary//10
        i += 1
    return decimal

print(magic_number(7))   