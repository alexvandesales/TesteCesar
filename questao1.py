def count_char(str):
    result = 0
    for char in str:
        if char != " ":
            result += 1
    return result

def main():
    string = "User is not allowed      ";
    espacos = len(string.split()) -1              # espacos em branco entre as palavras
    indexFim = count_char(string) + espacos       # indice do ultimo caracter diferente de em branco
    qtdeCaracteres = count_char(string) + espacos # qtde de caracteres na string com espacos entre as palavras
    espacoFim = len(string) - qtdeCaracteres      # qtde de espacos em branco depois da ultima palavra
    espacoTotal = espacos + espacoFim             # soma de caracteres em branco na string

    print (string)                                # print da string original
    print(len(string))                            # print do tamanho total da string original

    if(espacoFim == (espacos * 2)):
        print (string[:indexFim].replace(" ", "%32"))     # print da string atualizada
        print(len(string[:indexFim].replace(" ", "%32"))) # print do tamanho da string atualizada

main()