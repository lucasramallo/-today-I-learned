a1, a2, a3, a4 = input().split()

a1 = float(a1)
a2 = float(a2)
a3 = float(a3)
a4 = float(a4)

somaDosPesos = 10

media = ((a1 * 2) + (a2 * 3) + (a3 * 4) + (a4 * 1)) / somaDosPesos

if media >= 7.0:
    print("Media: %.1f" % media)
    print("Aluno aprovado.")
elif media < 5.0:
    print("Media: %.1f" % media)
    print("Aluno reprovado.")
elif media >= 5.0 and media <= 6.9:
    nExame = float(input())
    
    print("Media: %.1f" % media)
    print("Aluno em exame.")
    print("Nota do exame: {}".format(nExame))

    mediaExame = (media + nExame) / 2
    
    if media >= 5.0:
        print("Aluno aprovado.")
    elif media <= 4.9:
        print("Aluno reprovado.")

    print("Media final: {}".format(mediaExame))   

