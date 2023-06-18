A, B = input().split()

A = int(A)
B = int(B)

codition = B % A
codition2 = A % B

if codition == 0 or codition2 == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")