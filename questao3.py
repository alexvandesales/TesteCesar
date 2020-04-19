def CombinacaoPalavras(first, second):
    firstLength = len(first)
    secondLength = len(second)

    if abs(firstLength - secondLength) > 1:
        return False

    count = 0
    i = 0
    j = 0

    while i < firstLength and j < secondLength:
        if first[i] != second[j]:
            if count == 1:
                return False

            if firstLength > secondLength:
                i = i + 1

            elif firstLength < secondLength:
                j = j + 1
            else:
                i = i + 1
                j = j + 1
            count += 1
        else:
            i = i + 1
            j = j + 1

    if i < firstLength or j < secondLength:
        count = count + 1

    return count == 1

def main():
    if CombinacaoPalavras("pale", "ple"):
        print("Yes")
    else:
        print("No")

    if CombinacaoPalavras("pales", "pale"):
        print("Yes")
    else:
        print("No")

    if CombinacaoPalavras("pale", "bale"):
        print("Yes")
    else:
        print("No")

    if CombinacaoPalavras("pale", "bake"):
        print("Yes")
    else:
        print("No")

main()