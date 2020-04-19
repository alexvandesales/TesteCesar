def PermutaLetras(first, second):
    if (len(second) == len(first)):
        if (first[0] == second[0]):
            tamPalavra = len(second)
            diferencaCaracteres = 0
            i = 0

            for x in second:
                if(x != first[i]):
                    diferencaCaracteres = diferencaCaracteres +1
                i = i +1

            if(tamPalavra > 3):
                if (diferencaCaracteres < (tamPalavra * (2 / 3))):
                    print("True")
                else:
                    print("False")
            else:
                print(diferencaCaracteres > 0)
        else:
            print("False")
    else:
        print("False")

def main():
    PermutaLetras("you", "yuo")
    PermutaLetras("probably", "porbalby")
    PermutaLetras("despite", "desptie")
    PermutaLetras("moon", "nmoo")
    PermutaLetras("misspellings", "mpeissngslli")

main()

