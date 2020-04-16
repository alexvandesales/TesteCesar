def permutaLetras(first, second):
    if (len(second) == len(first)):
        if (first[0] == second[0]):
            wordLength = len(second)
            diferencaCaracteres = 0
            i = 0
            for x in second:
                if(x != first[i]):
                    diferencaCaracteres = diferencaCaracteres +1
                i = i +1

            if(wordLength > 3):
                if (diferencaCaracteres < (wordLength * (2 / 3))):
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
    permutaLetras("you", "yuo")
    permutaLetras("probably", "porbalby")
    permutaLetras("despite", "desptie")
    permutaLetras("moon", "nmoo")
    permutaLetras("misspellings", "mpeissngslli")

main()

